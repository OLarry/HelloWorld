package com.example.larryoshea.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MyActivity extends Activity {

    String tag = "lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void onStart() {
        super.onStart();
        Log.d(tag, "in the onStart() event");
    }

    public void onRestart() {
        super.onRestart();
        Log.d(tag, "in the onRestart() event");
    }

    public void onPause() {
        super.onPause();
        Log.d(tag, "in the onPause() event");
    }

    public void onResume() {
        super.onResume();
        Log.d(tag, "in the onResume() event");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(tag, "in the onDestroy() event");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
