package com.yx.yxcustomprogress;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.LinearInterpolator;

public class MainActivity extends Activity {

    private ColorfulRingProgressView project_schedul_crpv = null;
    private ObjectAnimator anim = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        project_schedul_crpv = (ColorfulRingProgressView) findViewById(R.id.project_schedul_crpv);
        project_schedul_crpv.setPercent(70);//设置进度条的进度，最大值为100
        project_schedul_crpv.setmTitleText("60");//设置百分比，最大值为100
        anim = ObjectAnimator.ofFloat(project_schedul_crpv, "percent", 0, (project_schedul_crpv).getPercent());//设置动画
        anim.setInterpolator(new LinearInterpolator());
        anim.setDuration(2000);
        anim.start();

        project_schedul_crpv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anim.start();
            }
        });
    }
}
