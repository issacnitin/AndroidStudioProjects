package com.issacnitin.referenceapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;

public class GFX extends Activity{
	
	MyGraphics layout;

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		PowerManager pm = (PowerManager)getSystemService(Context.POWER_SERVICE);
		pm.newWakeLock(PowerManager.FULL_WAKE_LOCK, "GFX");
		super.onCreate(savedInstanceState);
		layout = new MyGraphics(this);
		setContentView(layout);
	}
	

}
