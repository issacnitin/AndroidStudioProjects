package com.issacnitin.referenceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Data extends Activity implements OnClickListener {

	Button bSAFR, bSA;
	EditText eText;
	TextView tView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.get);
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		bSAFR = (Button) findViewById(R.id.button1);
		bSA = (Button) findViewById(R.id.button2);
		eText = (EditText) findViewById(R.id.editText1);
		tView = (TextView) findViewById(R.id.textView1);
		bSAFR.setOnClickListener(this);
		bSA.setOnClickListener(this);

	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String newString = eText.getText().toString();
		Bundle extras = new Bundle();
		extras.putString("key", newString);
		switch (arg0.getId()) {
		case R.id.button1:
			
			Intent i = new Intent(this, Get.class);
			i.putExtras(extras);
			startActivity(i);
			break;
		case R.id.button2:
			Intent j = new Intent(this, Get.class);
			j.putExtras(extras);
			startActivityForResult(j, 0);
			break;
		default:
			throw new RuntimeException("Imsorry this is not working!");
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);

		if (resultCode == RESULT_OK) {
			Bundle extras = data.getExtras();
			String sup = extras.getString("bSAFR");
			tView.setText(sup);
		}
	}

}
