package com.project.jinxuefen.materialdesignone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {


    TextView CoordinatorLayout;
    LinearLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoordinatorLayout = (TextView) findViewById(R.id.CoordinatorLayout);
        CoordinatorLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CoordinatorLayoutActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

    }


}
