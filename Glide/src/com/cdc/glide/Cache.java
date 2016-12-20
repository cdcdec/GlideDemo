package com.cdc.glide;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class Cache extends Activity {
	
	private ImageView imgCacheMemory;
	private ImageView imgCacheDisk;
	private ImageView imgCacheMemoryDisk;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_base_cache);
		
		
		imgCacheMemory=(ImageView) findViewById(R.id.imgCacheMemory);
		imgCacheDisk=(ImageView) findViewById(R.id.imgCacheDisk);
		imgCacheMemoryDisk=(ImageView) findViewById(R.id.imgCacheMemoryDisk);
		
		Glide.with(this).load(Server.CACHE_MEMORY).skipMemoryCache(true).override(286, 176).into(imgCacheMemory);
		Glide.with(this).load(Server.CACHE_DISK).diskCacheStrategy(DiskCacheStrategy.NONE).override(188, 200).into(imgCacheDisk);
		Glide.with(this).load(Server.CACHE_MEMORY_DISK).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).override(253, 199).into(imgCacheMemoryDisk);
		
		
		
		
		
		
	}
	

}
