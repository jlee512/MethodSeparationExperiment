package com.example.julia.methodseparationexperiment;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by julia on 18/10/2017.
 */

public class TestControlCenter {

    Activity activity;

    TestControlCenter(Activity activity) {
        this.activity = activity;
    }

    void layout1code(int count) {
        activity.setContentView(R.layout.activity_main);

        Button layout2 = (Button) activity.findViewById(R.id.layout2button);
        TextView text_layout1 = (TextView) activity.findViewById(R.id.layout1count);
        text_layout1.setText("Count: " + count);

        //Switch to layout2 button click logic
        layout2.setOnClickListener(new TestOnClickListener(count) {

            @Override
            public void onClick(View v) {
                count++;
                layout2code(count);
            }
        });
    }

    void layout2code(int count) {
        activity.setContentView(R.layout.secondlayout);

        final Button layout1 = (Button) activity.findViewById(R.id.layout1button);
        TextView text_layout2 = (TextView) activity.findViewById(R.id.layout2count);
        text_layout2.setText("Count: " + count);

        //Switch to layout1 button click logic
        layout1.setOnClickListener(new TestOnClickListener(count) {

            @Override
            public void onClick(View v) {
                count++;
                layout1code(count);
            }
        });
    }

}
