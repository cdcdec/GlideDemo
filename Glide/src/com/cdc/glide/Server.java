package com.cdc.glide;

import android.os.Environment;

public class Server {
	
	public  static final String FILE_PATH=Environment.getExternalStorageDirectory().getAbsolutePath()+"/cdc_glidesample";
	
	public static String[] Images = {
        "https://cdcdec.github.io/images/1024_1.jpg",
        "https://cdcdec.github.io/images/1024_2.jpg",
        "https://cdcdec.github.io/images/1024_3.jpg",
        "https://cdcdec.github.io/images/1024_4.jpg",
        "https://cdcdec.github.io/images/1024_5.jpg",
        "https://cdcdec.github.io/images/1024_6.jpg",
        "https://cdcdec.github.io/images/i750_1.jpg",
        "https://cdcdec.github.io/images/i750_2.jpg",
        "https://cdcdec.github.io/images/i750_3.jpg"
	};
	
	/**gif图**/
	public static String GIF_1="https://cdcdec.github.io/images/loading_1.gif";
	public static String GIF_2="https://cdcdec.github.io/images/giphy.gif";
	public static String GIF_3_NOT_GIF="https://cdcdec.github.io/images/JakeWharton.gif";
	/**缓存**/
	public static String CACHE_MEMORY="https://cdcdec.github.io/images/sketch_eyes.jpg";
	public static String CACHE_DISK="https://cdcdec.github.io/images/sketch_man.jpg";
	public static String CACHE_MEMORY_DISK="https://cdcdec.github.io/images/sketch_woman.jpg";
	
	/**优先级**/
	public static String Priority_LOW="https://cdcdec.github.io/images/sketch_low.jpg";
	public static String Priority_NORMAL="https://cdcdec.github.io/images/sketch_tree2_normal.jpg";
	public static String Priority_HIGH="https://cdcdec.github.io/images/sketch_greetwal_high.jpg";
	public static String Priority_IMMEDIATE="https://cdcdec.github.io/images/sketch_tree_immediate.jpg";
	
	/**缩略图**/
	public static String Thumbnail_0="https://cdcdec.github.io/images/thumbnail_0.jpg";
	public static String Thumbnail_1="https://cdcdec.github.io/images/thumbnail_1.jpg";
	public static String Thumbnail_2="https://cdcdec.github.io/images/thumbnail_2.jpg";
	
	
	

}
