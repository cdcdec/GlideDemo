package com.cdc.glide;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.NotificationTarget;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.RemoteViews;
/**Glide在通知栏上的应用***/
public class NotificationTargetActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notification_target);
	}
	
	
	public void notificationGlide(View view){
		RemoteViews rv = new RemoteViews(getPackageName(), R.layout.xml_notification);

		rv.setImageViewResource(R.id.remoteview_notification_icon, R.drawable.ic_launcher);

		rv.setTextViewText(R.id.remoteview_notification_headline, "Headline");  
		rv.setTextViewText(R.id.remoteview_notification_short_message, "Short Message");

		// build notification
		NotificationManager mNotificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		NotificationCompat.Builder mBuilder=new NotificationCompat.Builder(this); 
		mBuilder.setSmallIcon(R.drawable.ic_launcher)
		        .setContentTitle("Content Title")
		        .setContentText("Content Text")
		        .setContent(rv)
		        .setPriority(Notification.PRIORITY_DEFAULT)
		        .setAutoCancel(true);

		
		Notification notification=mBuilder.build();
		// set big content view for newer androids
		if (android.os.Build.VERSION.SDK_INT >= 16) {  
		    notification.bigContentView = rv;
		}

		mNotificationManager.notify(130, notification);  
		
		
		NotificationTarget notificationTarget=new NotificationTarget(this,
			    rv,
			    R.id.remoteview_notification_icon,
			    notification,
			    130);
		
		Glide  
	    .with( getApplicationContext() ) // safer!
	    .load(Server.CACHE_DISK)
	    .asBitmap()
	    .into( notificationTarget );
	}

}
