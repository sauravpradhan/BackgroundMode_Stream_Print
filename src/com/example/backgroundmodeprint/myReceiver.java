package com.example.backgroundmodeprint;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.util.Log;
import android.widget.Toast;

public class myReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		Toast.makeText(MainActivity.ctx, "Package Added", Toast.LENGTH_LONG).show();
		Log.d("S@urav","Current Mode is:"+MainActivity.mAm.getMode());
		Log.d("S@urav","Current Volume for Music stream is:"+MainActivity.mAm.getStreamVolume(AudioManager.STREAM_MUSIC));
		Log.d("S@urav","Current Volume for Call stream is:"+MainActivity.mAm.getStreamVolume(AudioManager.STREAM_VOICE_CALL));
		Log.d("S@urav","Current Volume for Ring stream is:"+MainActivity.mAm.getStreamVolume(AudioManager.STREAM_RING));
		Log.d("S@urav","Current Volume for DTMF stream is:"+MainActivity.mAm.getStreamVolume(AudioManager.STREAM_DTMF));
		Log.d("S@urav","Current Volume for Notification stream is:"+MainActivity.mAm.getStreamVolume(AudioManager.STREAM_NOTIFICATION));
	}

}
