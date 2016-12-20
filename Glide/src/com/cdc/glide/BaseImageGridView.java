package com.cdc.glide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class BaseImageGridView extends Activity {
	
	private GridView gvBase;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_base_gridview);
		gvBase=(GridView) findViewById(R.id.gvBase);
		
		gvBase.setAdapter(new ImageListAdapter(this, Server.Images));
		
		
	}

}
