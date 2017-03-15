package com.cdc.glide;

import com.bumptech.glide.Glide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * 图片改变了,但是图片的名称和路径没有改变
 * @author cdc
 *
 */
public class BaseImageNameNoChange extends Activity{
	
	private TextView txtNameNoChange;
	
	private ImageView imgNameNoChange;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_base_name_no_change);
		txtNameNoChange=(TextView) findViewById(R.id.txtNameNoChange);
		imgNameNoChange=(ImageView) findViewById(R.id.imgNameNoChange);
		/**
		 * 因为Glide加载图片会将图片缓存到本地，如果url不变则直接读取缓存不会再网络加载
		 * 解决方法有两个：
		 * 1.每次加载都清理缓存。这是个很垃圾的解决方法，相当于舍弃了缓存这个非常重要的功能。
		 * 2.图片地址采用这种：url+?随机数。当图片更换的时候，后台改变随机数就可以，这样你本地就会重新加载网络图片。这是根本解决方法，后台就应该这样设计
		 * */		
		Glide.with(this).load("http://192.168.0.164:8080/order/image/login.jpg").into(imgNameNoChange);
		
	}

}
