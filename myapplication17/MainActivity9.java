package com.example.myapplication17;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class MainActivity9 extends AppCompatActivity {
    private ImageSwitcher imageSwitcher;
    private Button bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        imageSwitcher= (ImageSwitcher) findViewById(R.id.imageswitcher);
        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
        bt1=findViewById(R.id.button2);
        bt2=findViewById(R.id.button) ;
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView mv=new ImageView(getApplicationContext());
                mv.setScaleType(ImageView.ScaleType.FIT_CENTER);
                mv.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,ActionBar.LayoutParams.WRAP_CONTENT));
                return mv;
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity9.this, "SILICONE MOLD CLAY POT", Toast.LENGTH_SHORT).show();
                imageSwitcher.setImageResource(R.drawable.img_9);

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity9.this,"CLAY EXTRUDERS",Toast.LENGTH_LONG).show();
                imageSwitcher.setImageResource(R.drawable.img_11);
            }
        });

    }
}