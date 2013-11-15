package com.example.qstpproject;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

	String classes[] = {"Example-1","Example0","Example1","Example2","Example3","Example4"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, classes));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String cheese = classes[position];
		try{
		Class ourClass = Class.forName("com.issacnitin.referenceapp." + cheese); 
		Intent Counter = new Intent(this, ourClass);
		startActivity(Counter);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	

}
