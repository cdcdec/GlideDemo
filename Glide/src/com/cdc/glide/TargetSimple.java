package com.cdc.glide;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.ViewTarget;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

public class TargetSimple extends Activity {
	
	private ImageView imgSimpleTarget;
	private ImageView imgSimpleTargetSize;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_callback_simple);
		initView();
		simpleTarget();
		
		simpleTargetSize();
		
		loadImageViewTarget();
	}
	
	private void initView(){
		imgSimpleTarget=(ImageView) findViewById(R.id.imgSimpleTarget);
		imgSimpleTargetSize=(ImageView) findViewById(R.id.imgSimpleTargetSize);
	}
	
	private void  simpleTarget(){
		SimpleTarget<Bitmap> target = new SimpleTarget<Bitmap>() {

			@Override
			public void onResourceReady(Bitmap arg0,
					GlideAnimation<? super Bitmap> arg1) {
				imgSimpleTarget.setImageBitmap(arg0);
			}  
		};
		Glide.with(this).load(Server.Priority_HIGH).asBitmap().into(target);
	}
	/***没有看出加尺寸和不加尺寸的区别**/
	private void  simpleTargetSize(){
		SimpleTarget<Bitmap> target = new SimpleTarget<Bitmap>(800,800) {
			
			@Override
			public void onResourceReady(Bitmap arg0,
					GlideAnimation<? super Bitmap> arg1) {
				imgSimpleTargetSize.setImageBitmap(arg0);
			}  
		};
		Glide.with(this).load(Server.Priority_HIGH).asBitmap().into(target);
	}
	
	private void loadImageViewTarget() {
		TargetSimpleView customView = (TargetSimpleView) findViewById( R.id.custom_view );

		ViewTarget<TargetSimpleView, GlideDrawable>  viewTarget = new ViewTarget<TargetSimpleView, GlideDrawable>( customView ) {
	        @Override
	        public void onResourceReady(GlideDrawable resource, GlideAnimation<? super GlideDrawable> glideAnimation) {
	            this.view.setImage( resource.getCurrent() );
	        }
	    };
	    Glide.with(this).load(Server.Priority_HIGH).into(viewTarget);
	}
	
	
	

}
