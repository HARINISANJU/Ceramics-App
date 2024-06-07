package com.example.myapplication17;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        Button bt=findViewById(R.id.button35);
        Button button1=findViewById(R.id.button36);
        Button button=findViewById(R.id.btf3);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView4, Fragment1.class,null).setReorderingAllowed(true)
                        .addToBackStack("name").commit();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView4, Fragment2.class,null).setReorderingAllowed(true)
                        .addToBackStack("name").commit();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView4, Fragment3.class,null).setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
    }
}