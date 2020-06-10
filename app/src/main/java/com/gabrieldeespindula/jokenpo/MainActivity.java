package com.gabrieldeespindula.jokenpo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.classic = findViewById(R.id.classic_button);
        this.mViewHolder.kww = findViewById(R.id.kww_button);
        this.mViewHolder.infinite = findViewById(R.id.infinite_button);
        this.mViewHolder.mode = findViewById(R.id.mode_button);

        this.mViewHolder.classic.setOnClickListener(this);
        this.mViewHolder.kww.setOnClickListener(this);
        this.mViewHolder.infinite.setOnClickListener(this);
        this.mViewHolder.mode.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.classic_button){
            Intent classic = new Intent(this, ClassicActivity.class);
            startActivity(classic);
        } else if (v.getId()==R.id.kww_button){
            Intent kww = new Intent(this, KwwActivity.class);
            startActivity(kww);
        } else if (v.getId()==R.id.infinite_button){
            Intent infinite = new Intent(this, InfiniteActivity.class);
            startActivity(infinite);
        } else {
            Intent mode = new Intent(this, ModeActivity.class);
            startActivity(mode);
        }

    }

    private static class ViewHolder {
        Button classic;
        Button kww;
        Button infinite;
        Button mode;
    }
}
