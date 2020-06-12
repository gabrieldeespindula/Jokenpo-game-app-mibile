package com.gabrieldeespindula.jokenpo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class KwwActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        this.mViewHolder.scoreboard = findViewById(R.id.scoreboard);
        this.mViewHolder.winlose = findViewById(R.id.result);
        this.mViewHolder.pcchoice = findViewById(R.id.image_pc);
        this.mViewHolder.youchoice = findViewById(R.id.image_you);
        this.mViewHolder.stone = findViewById(R.id.stone_button);
        this.mViewHolder.paper = findViewById(R.id.paper_button);
        this.mViewHolder.scissors = findViewById(R.id.scissors_button);

        this.mViewHolder.stone.setOnClickListener(this);
        this.mViewHolder.paper.setOnClickListener(this);
        this.mViewHolder.scissors.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }

    private static class ViewHolder{
        TextView scoreboard;
        TextView winlose;
        ImageView pcchoice;
        ImageView youchoice;
        Button stone;
        Button paper;
        Button scissors;
    }
}
