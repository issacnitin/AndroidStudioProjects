package com.example.rbnencrypted;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends Activity {	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		if(new String("RatZ").equals(message)){
			Context context = getApplicationContext();
		    for (int i=0; i<6; i++)
		    	Toast.makeText(context, "Happy Bday 2u ThunderBuddy!\nwith lots of <3,\nBatz & Katz", Toast.LENGTH_LONG).show();
		    setContentView(R.layout.activity_display_message);
		    MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.s);
		    mediaPlayer.start();
	    }
		else{
			TextView textView = new TextView(this);
		    textView.setTextSize(35);
		    textView.setText("\"" + message + "\" is not a valid AccessKey!\n Try Again.\n\nBeware 3 wrong attempts will result in FBI knocking on your doors!");
		    setContentView(textView);
		    Vibrator mVibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);		    
		    mVibrator.vibrate(250);

		}
	    
	}

}
