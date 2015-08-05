package com.example.backgroundmodeprint;
/* Author: Saurav Pradhan
 * This application works with broadcast : adb shell am broadcast -a android.intent.action.PACKAGE_ADDED
 */
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
public static Context ctx = null;
public static AudioManager mAm;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ctx = getApplicationContext();
		mAm = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
	}
}
