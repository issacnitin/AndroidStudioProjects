package com.issacnitin.referenceapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	int counter;
	Button add,sub;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		counter = 0;
		add = (Button)findViewById(R.id.addOne);
		sub = (Button)findViewById(R.id.subOne);
		tv = (TextView)findViewById(R.id.netResult);
		add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				counter++;
				tv.setText("Your total is " + counter);
				
			}
		});
		sub.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				counter--;
				tv.setText("Your total is " + counter);
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

	
}
