package com.cdc.glide;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.AppWidgetTarget;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.widget.RemoteViews;

public class ExampleAppWidgetProvider extends AppWidgetProvider{
	
	private AppWidgetTarget appWidgetTarget;

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		// TODO Auto-generated method stub
		super.onUpdate(context, appWidgetManager, appWidgetIds);
		// 每次 widget 被创建时，对应的将widget的id添加到set中
		RemoteViews rv = new RemoteViews(context.getPackageName(), R.layout.appwidget);
		appWidgetTarget = new AppWidgetTarget( context, rv, R.id.img, appWidgetIds );
        Glide.with(context.getApplicationContext()) // safer!
                .load(Server.Images[0])
                .asBitmap()
                .into( appWidgetTarget );
        pushWidgetUpdate(context, rv);
	}

    public static void pushWidgetUpdate(Context context, RemoteViews rv){
        ComponentName myWidget = new ComponentName(context, ExampleAppWidgetProvider.class);
        AppWidgetManager manager = AppWidgetManager.getInstance(context);
        manager.updateAppWidget(myWidget, rv);
    }

}
