package com.example.surya.shortcutapp;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void Camera(View view) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }

    public void Youtube(View view) {
        Intent intent = new Intent();
        intent.setData(Uri.parse("http://www.youtube.com/"));
        intent.setAction(Intent.ACTION_VIEW);
        startActivity(intent);
    }

    public void Call(View view) {
        Intent callIntent = new Intent();
        callIntent.setData(Uri.parse("tel:9614826204"));
        callIntent.setAction(Intent.ACTION_CALL);
        startActivity(callIntent);
    }
    public void Wifi(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.WIFI_SERVICE);
        startActivity(intent);
    }
}
