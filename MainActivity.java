package com.example.compute;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Button b1;
	private Button b2;
	private Button b3;
	private Button b4;
	private Button b5;
	private Button b6;
	private Button b7;
	private Button b8;
	private Button b9;
	private Button b0;
	private TextView tv;
	private Button add;
	private Button subtract;
	private Button multiplicat;
	private Button divide;
	private Button equals;
	private Button clear;
	private int m;
	private double n;
	private double n1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv=(TextView) findViewById(R.id.textView1);
		clear=(Button) findViewById(R.id.button16);
		clear.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setText(" ");
			}
			
		});
		equals=(Button) findViewById(R.id.button15);
		equals.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				double n1 = Integer.parseInt (tv.getText().toString());
				
				switch(m){
				
				case 1:{
					double n2=n+n1;
					String str=""+n2;
					tv.setText(str);
					}
				break;
				case 2:{
					double n2=n-n1;
					String str=""+n2;
					tv.setText(str);
					}
				break;
				case 3:{
					double n2=n*n1;
					String str=""+n2;
					tv.setText(str);
					}
				break;
				case 4:{
					double n2=n/n1;
					String str=""+n2;
					tv.setText(str);
					}
				break;
				}
				
				
				
			}
			
		});
		
		add=(Button) findViewById(R.id.button11);
		
		add.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				n = Integer.parseInt (tv.getText().toString());
				tv.setText(" ");
				m=1;
			}
			
		});
		subtract=(Button) findViewById(R.id.button12);
		
		subtract.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				n = Integer.parseInt (tv.getText().toString());
				tv.setText(" ");
				m=2;
			}
			
		});
		multiplicat=(Button) findViewById(R.id.button13);
		
		multiplicat.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				n = Integer.parseInt (tv.getText().toString());
				tv.setText(" ");
				m=3;
			}
			
		});
		divide=(Button) findViewById(R.id.button14);
		
		divide.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				n = Integer.parseInt (tv.getText().toString());
				tv.setText(" ");
				m=4;
			}
			
		});
		
		b1=(Button) findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setText("1");
			}
		});
		b2=(Button) findViewById(R.id.button2);
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setText("2");
			}
		});
		b3=(Button) findViewById(R.id.button3);
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setText("3");
			}
		});
		b4=(Button) findViewById(R.id.button4);
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setText("4");
			}
		});
		b5=(Button) findViewById(R.id.button5);
		b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setText("5");
			}
		});
		b6=(Button) findViewById(R.id.button6);
		b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setText("6");
			}
		});
		
		
		b7=(Button) findViewById(R.id.button7);
		b7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setText("7");
			}
		});
		b8=(Button) findViewById(R.id.button8);
		b8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setText("8");
			}
		});
		b9=(Button) findViewById(R.id.button9);
		b9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setText("9");
			}
		});
		b0=(Button) findViewById(R.id.button10);
		b0.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				tv.setText("0");
			}
		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
