package com.example.julia.methodseparationexperiment;


import android.view.View;

/**
 * Created by julia on 18/10/2017.
 */

public abstract class TestOnClickListener implements View.OnClickListener {

    int count;
    public TestOnClickListener(int count) {
        this.count = count;
    }
}
