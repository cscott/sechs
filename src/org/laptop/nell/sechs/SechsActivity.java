package org.laptop.nell.sechs;

import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SechsActivity extends Activity {
    public static final String TAG = SechsActivity.class.getName();
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.main);
    }
    public void onRecordButtonClicked(View v) {
        Log.d(TAG, "Record button clicked");
        Intent i = new Intent("edu.mit.media.funf.RECORD");
        i.putExtra("DATABASE_NAME", "mainPipeline");
        i.putExtra("TIMESTAMP", new Long(System.currentTimeMillis()/1000));
        i.putExtra("NAME", "SechsTest");
        i.putExtra("VALUE", "{\"foo\": 2}");
        sendBroadcast(i);
    }
    public void onArchiveButtonClicked(View v) {
        Log.d(TAG, "Archive Button Clicked");
        Intent i = new Intent("edu.mit.media.funf.ARCHIVE");
        i.putExtra("DATABASE_NAME", "mainPipeline");
        sendBroadcast(i);
    }
}