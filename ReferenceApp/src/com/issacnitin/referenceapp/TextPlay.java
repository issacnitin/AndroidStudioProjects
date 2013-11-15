package com.issacnitin.referenceapp;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity implements OnClickListener{

	ToggleButton tbutton1;
	EditText edText1;
	TextView tView1;
	Button button1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		initialize();
		
		tbutton1.setOnClickListener(this);
		button1.setOnClickListener(this);
		
		
	}


	private void initialize() {
		// TODO Auto-generated method stub
		button1 = (Button)findViewById(R.id.button1);
		tbutton1 = (ToggleButton)findViewById(R.id.toggleButton1);
		edText1 = (EditText)findViewById(R.id.editText1);
		tView1 = (TextView)findViewById(R.id.textView1);
	}


	@Override
	public void onClick(View arg0) {
		switch(arg0.getId()){
		case R.id.button1 :
			String chase = (String)edText1.getText().toString();
			if(chase.contentEquals("left"))
					tView1.setGravity(Gravity.LEFT);
			else if(chase.contentEquals("right"))
					tView1.setGravity(Gravity.RIGHT);
			else if(chase.contentEquals("center"))
					tView1.setGravity(Gravity.LEFT);
			else if(chase.contentEquals("blue"))
					tView1.setTextColor(Color.BLUE);
			else if(chase.contentEquals("WTF")){	
				Random cheese = new Random();
				tView1.setText("wtf!!!");
				tView1.setTextSize(cheese.nextInt(75));
				tView1.setTextColor(Color.rgb(cheese.nextInt(254), cheese.nextInt(254), cheese.nextInt(254)));
			switch(cheese.nextInt(3)){
			case 0:
				tView1.setGravity(Gravity.LEFT);
				break;
			case 1:
				tView1.setGravity(Gravity.CENTER);
				break;
			case 2:
				tView1.setGravity(Gravity.RIGHT);
				break;
			default: 
			}
			}
			else{
				tView1.setText("WTFiswrongWithyou?");
				tView1.setGravity(Gravity.LEFT);
				tView1.setTextColor(Color.WHITE);
			}
			
			break;
			
			case R.id.toggleButton1:
				if(tbutton1.isChecked()){
					edText1.setInputType(InputType.TYPE_TEXT_VARIATION_WEB_PASSWORD);
									}
			else{
				edText1.setInputType(InputType.TYPE_CLASS_TEXT);
			}
				break;
				
			default: throw new RuntimeException("Your noob");
	}

		
	}


		
	}

	

