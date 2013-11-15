package com.issacnitin.referenceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Get extends Activity implements
		RadioGroup.OnCheckedChangeListener, OnClickListener {
	TextView question, answer;
	RadioGroup selectionList;
	String finalText;
	Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.data);
		initialize();
		Bundle extras = getIntent().getExtras();
		String myString = extras.getString("key") + " is... ";
		question.setText(myString);
	}

	private void initialize() {
		// TODO Auto-generated method stub
		question = (TextView) findViewById(R.id.textView1);
		answer = (TextView) findViewById(R.id.textView2);
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(this);
		selectionList = (RadioGroup) findViewById(R.id.radioGroup1);
		selectionList.setOnCheckedChangeListener(this);
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		switch (checkedId) {
		case R.id.radio0:
			finalText = "Sexy? I doubt it :P";
			break;
		case R.id.radio1:
			finalText = "Cool? Yes";
			break;
		case R.id.radio2:
			finalText = "Ob";
			break;
		default:
			throw new RuntimeException("Sorry!");
		}
		answer.setText(finalText);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v.getId() == R.id.button1) {
			Bundle extras = new Bundle();
			extras.putString("bSAFR", finalText);
			Intent kool = new Intent();
			kool.putExtras(extras);
			setResult(RESULT_OK, kool);
			finish();
		}
	}

}
