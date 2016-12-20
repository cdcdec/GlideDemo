package com.cdc.glide;

import com.bumptech.glide.Glide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageListAdapter extends BaseAdapter{
    private Context context;
    private LayoutInflater inflater;

    private String[] imageUrls;

    public ImageListAdapter(Context context, String[] imageUrls) {

        this.context = context;
        this.imageUrls = imageUrls;

        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (null == convertView) {
            convertView = inflater.inflate(R.layout.listview_item_image, parent, false);
        }

        Glide.with(context).load(imageUrls[position]).into((ImageView) convertView);

        return convertView;
    }

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return imageUrls.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return imageUrls[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}
}