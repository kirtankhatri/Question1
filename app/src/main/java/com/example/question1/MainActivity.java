package com.example.question1;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    View targetElement;
    Button upBtn,downBtn,leftBtn,rightBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        targetElement = findViewById(R.id.targetElement);
        upBtn = findViewById(R.id.upBtn);
        downBtn = findViewById(R.id.downBtn);
        leftBtn = findViewById(R.id.leftBtn);
        rightBtn = findViewById(R.id.rightBtn);

        upBtn.setOnClickListener((e)->{
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up_animation);
            targetElement.startAnimation(animation);
        });
        downBtn.setOnClickListener((e)->{
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down_animation);
            targetElement.startAnimation(animation);
        });
        leftBtn.setOnClickListener((e)->{
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left_animation);
            targetElement.startAnimation(animation);
        });
        rightBtn.setOnClickListener((e)->{
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right_animation);
            targetElement.startAnimation(animation);
        });
    }



}