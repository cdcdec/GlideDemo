package com.cdc.glide;

import java.io.File;
import java.util.concurrent.ExecutionException;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.FutureTarget;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
/**下载图片,返回File或者Bitmap**/
public class FileDownTarget extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_file_target);
		
		
		
	
	}
	
	
	private Handler  handler=new Handler(){
		public void handleMessage(android.os.Message msg) {
			switch (msg.what) {
			case 0:
				File cacheFile=(File) msg.obj;
				Toast.makeText(FileDownTarget.this, cacheFile.getAbsolutePath(), Toast.LENGTH_SHORT).show();
				break;
			case 1:
				Bitmap myBitmap=(Bitmap) msg.obj;
				ImageView image=(ImageView) findViewById(R.id.image);
				image.setImageBitmap(myBitmap);
			
				break;
			default:
				break;
			}
			
		};
	};
	

	
	
	public void down(View view){
		
		new  Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				FutureTarget<File> future = Glide.with(FileDownTarget.this)
				        .load(Server.Thumbnail_0)
				        .downloadOnly(500, 500);
				try {
					File cacheFile = future.get();
					Message  msg=handler.obtainMessage();
					msg.obj=cacheFile;
					msg.what=0;
					handler.sendMessage(msg);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();

		

		
	}
	
	
	public void downAsync(View view){
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Bitmap myBitmap = Glide.with(FileDownTarget.this)
					        .load(Server.Thumbnail_1)
					        .asBitmap()
					        .centerCrop()
					        .into(500, 500)
					        .get();
					Message  msg=handler.obtainMessage();
					msg.what=1;
					msg.obj=myBitmap;
					handler.sendMessage(msg);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start();
		
		
		
	}

	
	

}
