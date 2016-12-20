package com.cdc.glide;

import com.bumptech.glide.Glide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class BaseImageProError extends Activity{
	
	private ImageView imgUrl;
	private ImageView imgSource;
	private ImageView imgFile;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_base_image);
		imgUrl=(ImageView) findViewById(R.id.imgUrl);
		imgSource=(ImageView) findViewById(R.id.imgSource);
		imgFile=(ImageView) findViewById(R.id.imgFile);
		
		
		Glide.with(this).load("https://pic4.zhimg.com/cb37d5884ee9b99de381447fc7362b73_b.jpg").placeholder(R.drawable.cycle_icon_stub).error(R.drawable.cycle_icon_error).into(imgUrl);
		
		
		Glide.with(this).load("https://pic4.zhimg.com/cb37d5884ee9b99de381447fc7362b73b.jpg").placeholder(R.drawable.cycle_icon_stub).error(R.drawable.cycle_icon_error).into(imgSource);
		
		
	}
}
