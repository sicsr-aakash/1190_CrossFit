package edu.sicsr.eventhandling9;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button buttonclick2;
	private EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        buttonclick2 = (Button)findViewById(R.id.buttonclick2);
        name = (EditText)  findViewById(R.id.name);
        
       android.view.View.OnClickListener listener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Toast.makeText(getApplicationContext(), "Button Clicked!", Toast.LENGTH_LONG).show();
			
			
			
		}
	}; 
	
	buttonclick2.setOnClickListener(listener);
		
    }
    
	
        	
      
    }



