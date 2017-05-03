package com.project.jinxuefen.materialdesignone;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.project.jinxuefen.materialdesignone.view.APSTSViewPager;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MaterialDesignActivity extends AppCompatActivity {

    @Bind(R.id.tablayout)
    TabLayout tablayout;
    @Bind(R.id.appBarLayout)
    AppBarLayout appBarLayout;
    @Bind(R.id.viewpager)
    APSTSViewPager viewpager;
    @Bind(R.id.activity_material_design)
    RelativeLayout activityMaterialDesign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design);
        ButterKnife.bind(this);
    }
}
