package com.example.presly.myintentfilterpractice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /**
     * i had to remove the third button test, meaning this app doesnt do
     * what its meant to do.. i followed an old tutorial and some of the features wont work now
     * useless to spend more time on this, i understood the subject, time to move on.
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //first intent will use ACTION_VIEW with correct data
        Button startBrowser_a = (Button)findViewById(R.id.start_browser_a);
        startBrowser_a.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.example.com"));
                startActivity(i);
            }
        });

        //second intent will use LAUNCH action with correct data
        Button startBrowser_b = (Button)findViewById(R.id.start_browser_b);
        startBrowser_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.example.presly.myintentfilterpractice.LAUNCH", Uri.parse("http://www.com.example.presly.myintentfilterpractice"));
                startActivity(i);
            }
        });

        //third intent will use LAUNCH with INCORRECT data
        Button startBrowser_c = (Button)findViewById(R.id.start_browser_c);
        startBrowser_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.example.presly.myintentfilterpractice.LAUNCH",
                Uri.parse("https://www.example.com"));
                startActivity(i);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
    }
}
