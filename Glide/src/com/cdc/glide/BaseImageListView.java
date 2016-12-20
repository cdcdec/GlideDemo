package com.cdc.glide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class BaseImageListView extends Activity {
	
	private ListView lvBase;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_base_lisiview);
		lvBase=(ListView) findViewById(R.id.lvBase);
		
		lvBase.setAdapter(new ImageListAdapter(this, Server.Images));
		
		
	}

}
