 package com.example.hp.magicball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button askButton = (Button)findViewById(R.id.askButton);
        final ImageView answerImage = (ImageView)findViewById(R.id.answerImage);
        final int[] answers= {
                        R.drawable.img0,
                        R.drawable.img1,
                        R.drawable.img2,
                        R.drawable.img3,
                        R.drawable.img4,
                        R.drawable.img5,
                        R.drawable.img6 };
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rndGenegartor = new Random();
                int Number = rndGenegartor.nextInt(7);
                answerImage.setImageResource(answers[Number]);  }
        });
    }
}
