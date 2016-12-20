package com.cdc.glide;

import com.bumptech.glide.Glide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class ChangePlaceHolder extends Activity {
	
	private ImageView imgPh;
	private ImageView imgErrorPh;
	private ImageView imgcrossFade;
	private ImageView imgdontAnimate;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_change_placeholder);
		
		imgPh=(ImageView) findViewById(R.id.imgPh);
		imgErrorPh=(ImageView) findViewById(R.id.imgErrorPh);
		imgcrossFade=(ImageView) findViewById(R.id.imgcrossFade);
		imgdontAnimate=(ImageView) findViewById(R.id.imgdontAnimate);
		Glide.with(this).load("https://cdcdec.github.io/images/1024_1.jpg").placeholder(R.drawable.cycle_icon_stub).override(1024, 768).into(imgPh);
		Glide.with(this).load("https://cdcdec.github.io/images/1024.jpg").error(R.drawable.cycle_icon_error).into(imgErrorPh);
		Glide.with(this).load("https://cdcdec.github.io/images/1024_1.jpg").placeholder(R.drawable.cycle_icon_stub).crossFade().into(imgcrossFade);
		Glide.with(this).load("https://cdcdec.github.io/images/1024_1.jpg").placeholder(R.drawable.cycle_icon_stub).dontAnimate().into(imgdontAnimate);
		
		
		
	}
	
	
	

}
