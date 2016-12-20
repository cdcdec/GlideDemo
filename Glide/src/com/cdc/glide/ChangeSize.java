package com.cdc.glide;

import com.bumptech.glide.Glide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class ChangeSize extends Activity {
	private ImageView imgOverride;
	private ImageView imgCenterCrop;
	private ImageView imgFitCenter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_change_size);
		
		imgOverride=(ImageView) findViewById(R.id.imgOverride);
		imgCenterCrop=(ImageView) findViewById(R.id.imgCenterCrop);
		imgFitCenter=(ImageView) findViewById(R.id.imgFitCenter);
		Glide.with(this).load("https://cdcdec.github.io/images/i750_2.jpg").placeholder(R.drawable.cycle_icon_stub).override(750,505).into(imgOverride);
		Glide.with(this).load("https://cdcdec.github.io/images/i750_3.jpg").error(R.drawable.cycle_icon_error).centerCrop().into(imgCenterCrop);
		Glide.with(this).load("https://cdcdec.github.io/images/i750_1.jpg").placeholder(R.drawable.cycle_icon_stub).fitCenter().into(imgFitCenter);
		
		
		
	}
	

}
