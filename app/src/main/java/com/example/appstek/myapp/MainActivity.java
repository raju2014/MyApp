package com.example.appstek.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

public class MainActivity extends AppCompatActivity {

    public  static GoogleAnalytics analyticsExam;
    public static Tracker mtracker;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        analyticsExam = GoogleAnalytics.getInstance(this);
        analyticsExam.setLocalDispatchPeriod(1000);

        mtracker = analyticsExam.newTracker("UA-98438331-2");
        mtracker.enableAdvertisingIdCollection(true);
        mtracker.enableAutoActivityTracking(true);
        mtracker.enableExceptionReporting(true);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,Secind.class);
                startActivity(intent);
            }
        });
    }
}
  /*
        handleScreenTrackingAnalytics();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void showMessage(View view) {
        handleEventTrackingAnalytics("Button Click", "Show Message");
        Toast toast = Toast.makeText(getApplicationContext(), "Button is clicked.", Toast.LENGTH_SHORT);
        toast.show();
    }
    private void handleScreenTrackingAnalytics() {
        AppMy application = (AppMy) getApplication();
        Tracker mTracker = application.getDefaultTracker();
        mTracker.setScreenName("MainActivity");
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());
    }
    private void handleEventTrackingAnalytics(final String category, final String action) {
        AppMy application = (AppMy) getApplication();
        Tracker mTracker = application.getDefaultTracker();
        mTracker.setScreenName("MainActivity");
        mTracker.send(new HitBuilders.EventBuilder()
                .setCategory(category)
                .setAction(action)
                .build());
    }
}

*/
