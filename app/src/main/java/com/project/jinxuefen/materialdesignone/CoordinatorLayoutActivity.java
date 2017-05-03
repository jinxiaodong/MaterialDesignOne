package com.project.jinxuefen.materialdesignone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;

import com.project.jinxuefen.materialdesignone.view.TempView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CoordinatorLayoutActivity extends AppCompatActivity {


    @Bind(R.id.dependency)
    TempView dependency;
    @Bind(R.id.text)
    Button text;
    @Bind(R.id.activity_coordinator_layout)
    LinearLayout activityCoordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);
        ButterKnife.bind(this);
    }
}
