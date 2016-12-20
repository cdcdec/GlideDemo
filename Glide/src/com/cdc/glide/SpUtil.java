package com.cdc.glide;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
/**
 * 通过java的泛型简化SharedPreferences的储存和取用数据
 * @author cdc
 *
 */
public class SpUtil{
	
	private Context context;
	
	private String spName;
	/**
	 * 
	 * @param context 建议使用Application的上下文
	 * @param spName  保存数据的xml文件名:spName+".xml"
	 */
	public SpUtil(Context context,String spName){
		this.context=context;
		this.spName=spName;
	}
	
	
	private  SharedPreferences getSP() {
		return context.getSharedPreferences(spName, Context.MODE_PRIVATE);
	}

	public  <T> void saveData(String key, T t) {
		Editor editor = getSP().edit();
		if (t instanceof String) {
			editor.putString(key, (String) t).commit();
		} else if (t instanceof Integer) {
			editor.putInt(key, (Integer) t).commit();
		} else if (t instanceof Boolean) {
			editor.putBoolean(key, (Boolean) t).commit();
		} else if (t instanceof Long) {
			editor.putLong(key, (Long) t).commit();
		} else if (t instanceof Float) {
			editor.putFloat(key, (Float) t).commit();
		}
	}

	@SuppressWarnings("unchecked")
	public  <T> T getData(String key, T t) {
		SharedPreferences sp = getSP();
		if (t instanceof String) {
			String str = sp.getString(key, (String) t);
			t = (T) str;
		} else if (t instanceof Integer) {
			Integer in = sp.getInt(key, (Integer) t);
			t = (T) in;
		} else if (t instanceof Long) {
			Long lon = sp.getLong(key, (Long) t);
			t = (T) lon;
		} else if (t instanceof Float) {
			Float fl = sp.getFloat(key, (Float) t);
			t = (T) fl;
		} else if (t instanceof Boolean) {
			Boolean bl = sp.getBoolean(key, (Boolean) t);
			t = (T) bl;
		}
		return t;
	}
	
	


}
