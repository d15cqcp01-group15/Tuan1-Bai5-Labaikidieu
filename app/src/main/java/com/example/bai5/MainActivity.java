package com.example.bai5;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int[][] textureArrayWin = {
            {R.drawable.r1, R.drawable.r2, R.drawable.r3, R.drawable.r4},
            {R.drawable.b1,R.drawable.b2, R.drawable.b3, R.drawable.b4},
            {R.drawable.c1, R.drawable.c2, R.drawable.c3,R.drawable.c4},
            {R.drawable.ch1, R.drawable.ch2,R.drawable.ch3,R.drawable.ch4}
    };
    TextView txtScore;
    ImageView img1, img2, img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtScore = findViewById(R.id.txtScore);
        img2 = findViewById(R.id.img2);
        img1 = findViewById(R.id.img1);
        img3 = findViewById(R.id.img3);
    }


    public void xulyChon(View view) {

        int i1, i2, i3;

        i1 = (int )(Math.random() * 4 );
        do{
            i2 = (int )(Math.random() * 4 );
        }while(i2 == i1);

        do{
            i3 = (int )(Math.random() * 4 );
        }while(i3 == i1 || i3 == i2);


        int j1 = (int )(Math.random() * 4 );
        int j2 = (int )(Math.random() * 4 );
        int j3 = (int )(Math.random() * 4 );

        int score = j1 + j2 + j3 + 3;


        img1.setImageResource(this.textureArrayWin[i1][j1]);
        img2.setImageResource(this.textureArrayWin[i2][j2]);
        img3.setImageResource(this.textureArrayWin[i3][j3]);

        txtScore.setText("Score: " + Integer.toString(score) );

    }
}
