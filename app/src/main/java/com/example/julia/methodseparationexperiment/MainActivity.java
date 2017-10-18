package com.example.julia.methodseparationexperiment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TestControlCenter controller = new TestControlCenter(this);

        controller.layout1code(count);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
