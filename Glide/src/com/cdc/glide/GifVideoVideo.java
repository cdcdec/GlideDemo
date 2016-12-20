package com.cdc.glide;

import java.io.File;

import com.bumptech.glide.Glide;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class GifVideoVideo extends Activity {
	private ImageView imgVideo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gif_video_video);
		
		imgVideo=(ImageView) findViewById(R.id.imgVideo);
		
		String filePath =Server.FILE_PATH+"/police.mp4";
		Glide  
		    .with( this )
		    .load( Uri.fromFile( new File( filePath ) ) )
		    .into( imgVideo );
	}

}
