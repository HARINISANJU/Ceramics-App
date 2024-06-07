package com.example.myapplication17;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return menuChoice(item);
    }

    private void CreateMenu(Menu menu) {
        MenuItem m = menu.add(0, 0, 0, "contact");
        m.setAlphabeticShortcut('a');

        MenuItem m2 = menu.add(0, 1, 1, "msg");
        m2.setAlphabeticShortcut('b');

        menu.add(0, 2, 2, "view here");
        menu.add(0, 3, 3, "more options");
        menu.add(0, 4, 4, "list of options");
    }

    private boolean menuChoice(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
                Toast.makeText(this, "You Clicked contact", Toast.LENGTH_SHORT).show();
                return true;
            case 1:
                Toast.makeText(this, "You Clicked msg", Toast.LENGTH_LONG).show();
                return true;
            case 2:
                Toast.makeText(this, "You clicked view more", Toast.LENGTH_LONG).show();
                return true;
            case 3:
                Toast.makeText(this,"You clicked more options",Toast.LENGTH_LONG).show();
                return true;
        }
        return false;
    }
}
