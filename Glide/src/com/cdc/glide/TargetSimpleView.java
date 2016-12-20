package com.cdc.glide;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class TargetSimpleView extends FrameLayout{
	ImageView iv;
    TextView tv;

    public void initialize(Context context) {
        inflate( context,R.layout.custom_view_futurestudio, this );

        iv = (ImageView) findViewById(R.id.custom_view_image);
        tv = (TextView) findViewById(R.id.custom_view_text);
    }

    public TargetSimpleView(Context context, AttributeSet attrs) {
        super( context, attrs );
        initialize( context );
    }

    public TargetSimpleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super( context, attrs, defStyleAttr );
        initialize( context );
    }

    public void setImage(Drawable drawable) {
        iv = (ImageView) findViewById( R.id.custom_view_image );

        iv.setImageDrawable( drawable );
    }

}
