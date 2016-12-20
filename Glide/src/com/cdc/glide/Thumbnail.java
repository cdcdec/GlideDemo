package com.cdc.glide;

import com.bumptech.glide.DrawableRequestBuilder;
import com.bumptech.glide.Glide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
/**缩率图**/
public class Thumbnail extends Activity {
	
	private ImageView imgThumbnail1;
	private ImageView imgThumbnail2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_thumbnail_image);
		
		
		imgThumbnail1=(ImageView) findViewById(R.id.imgThumbnail1);
		imgThumbnail2=(ImageView) findViewById(R.id.imgThumbnail2);
		
		
		Glide.with(this).load(Server.Thumbnail_1).thumbnail(0.1f).into(imgThumbnail1);
		
		DrawableRequestBuilder<String> thumbnailRequest = Glide
		        .with( this )
		        .load( Server.Thumbnail_0 );

		    // pass the request as a a parameter to the thumbnail request
		    Glide
		        .with( this )
		        .load( Server.Thumbnail_2)
		        .thumbnail( thumbnailRequest )
		        .into( imgThumbnail2 );
	}

}
