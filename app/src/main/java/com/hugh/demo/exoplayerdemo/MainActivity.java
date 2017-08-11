package com.hugh.demo.exoplayerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by hugh on 17/3/24.
 */

public class MainActivity extends Activity implements View.OnClickListener {

    @BindView(R.id.tv_play)
    protected TextView tvPlay;
    @BindView(R.id.tv_custom_play)
    protected TextView tvPlayCustom;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tv_play, R.id.tv_custom_play})
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_play) {
            SimplePlayActivity.launch(this);
        } else if (v.getId() == R.id.tv_custom_play) {
        }
    }
}
