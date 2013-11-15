package com.issacnitin.referenceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Email extends Activity implements OnClickListener{

	Button sendEmail;
	EditText toWhom, myName, subJect, bEmail;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.email);
		initialize();
		sendEmail.setOnClickListener(this);
	}

	private void initialize() {
		// TODO Auto-generated method stub
		sendEmail = (Button)findViewById(R.id.sendEmail);
		toWhom = (EditText)findViewById(R.id.toWhom);
		myName = (EditText)findViewById(R.id.myName);
		subJect = (EditText)findViewById(R.id.subJect);
		bEmail = (EditText)findViewById(R.id.bEmail);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.sendEmail:
			String[] toWhom2 = { toWhom.getText().toString() };
			String message = "Hey"  + toWhom.getText().toString() +
					"This is " + myName.getText().toString() + 
					"\n " + subJect.getText().toString() + 
					"\n" + bEmail.getText().toString();
			Intent emailClient = new Intent(Intent.ACTION_SENDTO);
			emailClient.putExtra(Intent.EXTRA_EMAIL, toWhom2);
			emailClient.setType("plain/text");
			emailClient.putExtra(Intent.EXTRA_TEXT, message);
			emailClient.putExtra(Intent.EXTRA_SUBJECT, "I hate you");
			emailClient.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(emailClient);
			
		
		break;
		
		default: throw new RuntimeException("Useless");
		}
		
	}
	

}
