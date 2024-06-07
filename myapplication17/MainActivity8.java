package com.example.myapplication17;
import static com.example.myapplication17.R.id.button10;
import static com.example.myapplication17.R.id.button21;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity8 extends AppCompatActivity {
    int x,y;
    String op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Intent i=getIntent();
        Button b1=(Button) findViewById(R.id.bt6);
        Button b2=(Button) findViewById(R.id.button7);
        Button b3=(Button) findViewById(R.id.button8);
        Button b4=(Button) findViewById(R.id.button9);
        Button b5=(Button) findViewById(button10);
        Button b6=(Button)findViewById(R.id.button11);
        Button b7=(Button) findViewById(R.id.button12);
        Button b8=(Button) findViewById(R.id.button13);
        Button b9=(Button)findViewById(R.id.button14);
        Button b10=(Button) findViewById(R.id.button15);
        Button button=(Button)findViewById(R.id.button);
        Button b11=(Button)findViewById(R.id.button17);
        Button  b12=(Button)findViewById(R.id.button18);
        Button b13=(Button)findViewById(R.id.button6);
        TextView textView=(TextView) findViewById(R.id.textView9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=String.valueOf(textView.getText());
                textView.setText(str+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=String.valueOf(textView.getText());
                textView.setText(str+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=String.valueOf(textView.getText());
                textView.setText(str+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=String.valueOf(textView.getText());
                textView.setText(str+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=String.valueOf(textView.getText());
                textView.setText(str+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=String.valueOf(textView.getText());
                textView.setText(str+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=String.valueOf(textView.getText());
                textView.setText(str+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=String.valueOf(textView.getText());
                textView.setText(str+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=String.valueOf(textView.getText());
                textView.setText(str+"9");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=String.valueOf(textView.getText());
                textView.setText(str+"0");
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=Integer.valueOf(String.valueOf(textView.getText()));
                textView.setText("");
                op="+";
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=Integer.valueOf(String.valueOf(textView.getText()));
                textView.setText("");
                op="-";
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=Integer.valueOf(String.valueOf(textView.getText()));
                textView.setText("");
                op="*";
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=Integer.valueOf(String.valueOf(textView.getText()));
                textView.setText("");
                op="/";
            }
        });
        Button button21=(Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y=Integer.valueOf(String.valueOf(textView.getText()));
                textView.setText("");
                switch (op)
                {
                    case "+":
                        textView.setText(String.valueOf(x+y));
                        Toast.makeText(MainActivity8.this, "ESTIMATED PRICE"+(x+y),Toast.LENGTH_LONG).show();
                        break;
                    case "-":
                        textView.setText(String.valueOf(x-y));
                        Toast.makeText(MainActivity8.this,"ESTIMATED PRICE"+(x-y),Toast.LENGTH_LONG).show();
                        break;
                    case "*":
                        textView.setText(String.valueOf(x*y));
                        Toast.makeText(MainActivity8.this,"ESTIMATED PRICE"+(x*y),Toast.LENGTH_LONG).show();
                        break;
                    case"/":
                        textView.setText(String.valueOf(x/y));
                        Toast.makeText(MainActivity8.this,"ESTIMATED PRICE"+(x/y),Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
    }
}