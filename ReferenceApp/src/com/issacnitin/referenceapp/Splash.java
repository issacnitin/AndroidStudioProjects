package com.issacnitin.referenceapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		final MediaPlayer ourSong = MediaPlayer.create(Splash.this,R.raw.aaaa);
		Thread timer = new Thread(){
			public void run(){
				try{
					ourSong.start();
					sleep(1000);
					ourSong.release();
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				finally{
					Intent openMainActivity = new Intent("com.issacnitin.referenceapp.MENU");
					startActivity(openMainActivity);
				}
			}
		};
		timer.start();
	}
	

}
