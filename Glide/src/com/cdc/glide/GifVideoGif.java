package com.cdc.glide;

import com.bumptech.glide.Glide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class GifVideoGif extends Activity {
	
	private ImageView imgGif1;
	private ImageView imgGif2;
	private ImageView imgGif3;
	private ImageView imgGif4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gif_video_gif);
		imgGif1=(ImageView) findViewById(R.id.imgGif1);
		imgGif2=(ImageView) findViewById(R.id.imgGif2);
		imgGif3=(ImageView) findViewById(R.id.imgGif3);
		imgGif4=(ImageView) findViewById(R.id.imgGif4);
		
		
		Glide.with(this).load(Server.GIF_1).override(124, 124).into(imgGif1);
		Glide.with(this).load(Server.GIF_3_NOT_GIF).override(225, 225).into(imgGif2);
		Glide.with(this).load(Server.GIF_3_NOT_GIF).asGif().override(225, 225).error(R.drawable.cycle_icon_error).into(imgGif3);
		Glide.with(this).load(Server.GIF_1).asBitmap().override(225, 225).error(R.drawable.cycle_icon_error).into(imgGif4);
		
		
		
		
	}

}
