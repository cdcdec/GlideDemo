package com.cdc.glide;

import com.bumptech.glide.Glide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class Priority extends Activity {
	
	private ImageView imgLow;
	private ImageView imgNormal;
	private ImageView imgHigh;
	private ImageView imgImmediate;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_priority_image);
		
		imgLow=(ImageView) findViewById(R.id.imgLow);
		imgNormal=(ImageView) findViewById(R.id.imgNormal);
		imgHigh=(ImageView) findViewById(R.id.imgHigh);
		imgImmediate=(ImageView) findViewById(R.id.imgImmediate);
		
		
		Glide.with(this).load(Server.Priority_LOW).priority(com.bumptech.glide.Priority.LOW).into(imgLow);
		Glide.with(this).load(Server.Priority_NORMAL).priority(com.bumptech.glide.Priority.NORMAL).into(imgNormal);
		Glide.with(this).load(Server.Priority_HIGH).priority(com.bumptech.glide.Priority.HIGH).into(imgHigh);
		Glide.with(this).load(Server.Priority_IMMEDIATE).priority(com.bumptech.glide.Priority.IMMEDIATE).into(imgImmediate);
		
		
		
		
	}

}
