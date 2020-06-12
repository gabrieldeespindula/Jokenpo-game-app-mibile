package com.gabrieldeespindula.jokenpo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class KwwActivity extends AppCompatActivity implements View.OnClickListener {
    public static ArrayList<String> pc() {
        ArrayList<String> pcplay = new ArrayList<>();
        pcplay.add(0, "stone");
        pcplay.add(1, "paper");
        pcplay.add(2, "scissors");
        return pcplay;
    }
    ArrayList<String> pcplay = pc();

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

        this.mViewHolder.winlose.setText("");

        this.mViewHolder.stone.setOnClickListener(this);
        this.mViewHolder.paper.setOnClickListener(this);
        this.mViewHolder.scissors.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Random r = new Random();
        String pcchoose = pcplay.get(r.nextInt(pcplay.size()));
        if ("stone".equals(pcchoose)){
            this.mViewHolder.pcchoice.setImageResource(R.drawable.stone);
        }if ("paper".equals(pcchoose)){
            this.mViewHolder.pcchoice.setImageResource(R.drawable.paper);
        }if ("scissors".equals(pcchoose)) {
            this.mViewHolder.pcchoice.setImageResource(R.drawable.scissors);
        }if (v.getId()==R.id.stone_button){
            this.mViewHolder.youchoice.setImageResource(R.drawable.stone);
        } else if (v.getId()==R.id.paper_button){
            this.mViewHolder.youchoice.setImageResource(R.drawable.paper);
        } else {
            this.mViewHolder.youchoice.setImageResource(R.drawable.scissors);
        }

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
