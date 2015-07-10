package com.personal.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onItemClick(View v){
        switch(v.getId())
        {
            case R.id.button:
                Button b = (Button)v;
                Toast.makeText(this,"This button will launch " + b.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:
                Button b2 = (Button)v;
                Toast.makeText(this,"This button will launch " + b2.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.button3:
                Button b3 = (Button)v;
                Toast.makeText(this,"This button will launch " + b3.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.button4:
                Button b4 = (Button)v;
                Toast.makeText(this,"This button will launch " + b4.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.button5:
                Button b5 = (Button)v;
                Toast.makeText(this,"This button will launch " + b5.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.button6:
                Button b6 = (Button)v;
                Toast.makeText(this,"This button will launch " + b6.getText(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
