package com.netcetera.demo.gradle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f�r();
    }

    private void f�r() {
        Toast.makeText(this, "Some3", Toast.LENGTH_LONG).show();
    }


}
