package com.cdc.glide;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
/**监听异常**/
public class GetExceptionActivity extends Activity {
	
	
	private ImageView  img;
	
	private TextView txtException;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_get_exception);
		txtException=(TextView) findViewById(R.id.txtException);
		
		img=(ImageView) findViewById(R.id.img);
		
		Glide  
	    .with(this)
	    .load("http://fjakajka/klalkla/123.jpg")
	    .listener(requestListener)
	    .error(R.drawable.cycle_icon_error)
	    .into(img);
		
	}
	
	
	private RequestListener<String, GlideDrawable> requestListener = new RequestListener<String, GlideDrawable>() {  
	    @Override
	    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
	        // todo log exception
	    	Log.i("123456",e.toString());
	    	//Toast.makeText(GetExceptionActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
	    	
	    	if(e.toString().length()>0){
	    		txtException.setText(e.toString());
	    	}
	        // important to return false so the error placeholder can be placed
	        return false;
	    }

	    @Override
	    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
	        return false;
	    }
	};

}
