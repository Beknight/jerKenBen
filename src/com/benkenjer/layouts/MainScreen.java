package com.benkenjer.layouts;

import com.example.benkenjer.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);
        setup();
    }


    public void setup(){
    	// connect all the views
    	
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
