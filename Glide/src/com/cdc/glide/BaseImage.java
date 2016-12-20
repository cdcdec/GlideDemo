package com.cdc.glide;

import java.io.File;

import com.bumptech.glide.Glide;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ImageView;

public class BaseImage extends Activity {
	private ImageView imgUrl;
	private ImageView imgSource;
	private ImageView imgFile;
	private ImageView imgUri;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_base_image);
		imgUrl=(ImageView) findViewById(R.id.imgUrl);
		imgSource=(ImageView) findViewById(R.id.imgSource);
		imgFile=(ImageView) findViewById(R.id.imgFile);
		imgUri=(ImageView) findViewById(R.id.imgUri);
		
		//Glide.with(this).load("https://pic3.zhimg.com/4950d8af109ad03ddff93ede587b79fa_b.png").into(imgUrl);
		Glide.with(this).load("https://cdcdec.github.io/images/1024_1.jpg").into(imgUrl);
		
		
		Glide.with(this).load(R.drawable.cycle_icon_stub).into(imgSource);
		
		File file=new File(Environment.getExternalStorageDirectory().getAbsoluteFile()+"/cdc_glidesample/sl.jpg");
		
		Glide.with(this).load(file).into(imgFile);
		
		//这可能是任何 Uri。为了演示的目的我们只是用一个 资源文件 去创建了一个 Uri 
		Uri uri = resourceIdToUri(this, R.drawable.cycle_icon_stub);
		Glide.with(this).load(uri).into(imgUri);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static final String ANDROID_RESOURCE = "android.resource://";
	public static final String FOREWARD_SLASH = "/";
	/**将资源id转换为Uri形式**/
	private static Uri resourceIdToUri(Context context, int resourceId) {
	    return Uri.parse(ANDROID_RESOURCE + context.getPackageName() + FOREWARD_SLASH + resourceId);
	}

}
