package com.gabrieldeespindula.jokenpo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.classic = findViewById(R.id.classic_button);
        this.mViewHolder.kww = findViewById(R.id.kww_button);
        this.mViewHolder.infinite = findViewById(R.id.infinite_button);
        this.mViewHolder.mode = findViewById(R.id.mode_button);

    }

    private static class ViewHolder {
        Button classic;
        Button kww;
        Button infinite;
        Button mode;
    }
}
