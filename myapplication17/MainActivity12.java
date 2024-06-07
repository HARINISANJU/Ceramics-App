package com.example.myapplication17;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        Button btn = findViewById(R.id.button22);
        registerForContextMenu(btn);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        createMenu(menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        createMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        return menuChoice(item);
    }

    private void createMenu(Menu menu) {
        MenuItem mnu1 = menu.add(0, 0, 0, "About the product");
        mnu1.setAlphabeticShortcut('a');

        MenuItem mnu2 = menu.add(0, 1, 1, "History on ceramica");
        mnu2.setAlphabeticShortcut('b');

        MenuItem mnu3 = menu.add(0, 2, 2, "More Options");
        mnu3.setAlphabeticShortcut('c');

        MenuItem mnu4 = menu.add(0, 3, 3, "View more");
        mnu4.setAlphabeticShortcut('d');

        menu.add(0, 4, 4, "Item-5");
        menu.add(0, 5, 5, "Item-6");
        menu.add(0, 6, 6, "Item-7");
    }

    private boolean menuChoice(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
                Toast.makeText(this, "Be ready", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), MainActivity15.class);
                startActivity(i);
                return true;
            case 1:
                Toast.makeText(this, "You clicked on Silicone mold", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), MainActivity10.class);
                startActivity(intent);
                return true;
            case 2:
                Toast.makeText(this, "You clicked on More Options", Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(getApplicationContext(), MainActivity13.class);
                startActivity(intent1);
                return true;
            case 3:
                Toast.makeText(this, "You clicked on View more", Toast.LENGTH_LONG).show();
                return true;
            case 4:
                Toast.makeText(this, "You clicked on Item-5", Toast.LENGTH_LONG).show();
                return true;
            case 5:
                Toast.makeText(this, "You clicked on Item-6", Toast.LENGTH_LONG).show();
                return true;
            case 6:
                Toast.makeText(this, "You clicked on Item-7", Toast.LENGTH_LONG).show();
                return true;
        }
        return false;
    }
}
