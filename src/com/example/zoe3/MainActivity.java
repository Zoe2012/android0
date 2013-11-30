package com.example.zoe3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	
		Button ourButton = (Button)findViewById(R.id.button1);
		ourButton.setOnClickListener(doSomething);		
	}
	
	private OnClickListener doSomething= new OnClickListener(){
		@Override
		public void onClick(View v){
		Intent ourIntent = new Intent();
		ourIntent.setClass(MainActivity.this, Activity2.class);
		startActivity(ourIntent);
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}







