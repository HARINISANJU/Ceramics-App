package com.example.myapplication17;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity14 extends AppCompatActivity {
    EditText name,contact,dob;
    Button insert,update,delete,view;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        name=findViewById(R.id.name);
        contact=findViewById(R.id.phoneno);
        dob=findViewById(R.id.Dob);
        insert=findViewById(R.id.ins);
        update=findViewById(R.id.update);
        delete=findViewById(R.id.del);
        view=findViewById(R.id.view);
        DB=new DBHelper(this);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameTXT=name.getText().toString();
                String contactTXT=contact.getText().toString();
                String dobTXT=dob.getText().toString();
                Boolean checkinsertdata=DB.insertuserdata(nameTXT,contactTXT,dobTXT);
                if(checkinsertdata==true)
                    Toast.makeText(getApplicationContext(), "New Entry inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "New ENtry NOt Inserted", Toast.LENGTH_SHORT).show();
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameTXT=name.getText().toString();
                String contactTXT=contact.getText().toString();
                String dobTXT=dob.getText().toString();
                Boolean checkupdatedata=DB.insertuserdata(nameTXT,contactTXT,dobTXT);
                if(checkupdatedata==true)
                    Toast.makeText(getApplicationContext(), " Entry udated", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "ENtry NOt updated", Toast.LENGTH_SHORT).show();

            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameTXT=name.getText().toString();
                Boolean checkdeletedata=DB.deleteuserdata(nameTXT);
                if(checkdeletedata==true)
                    Toast.makeText(getApplicationContext(), " Entry deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), " Entry NOt deleted", Toast.LENGTH_SHORT).show();
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res=DB.getdata();
                if(res.getCount()==0){
                    Toast.makeText(getApplicationContext(),"No Entry Exists",Toast.LENGTH_LONG);
                    return;
                }
                StringBuffer buffer=new StringBuffer();
                while (res.moveToNext()){
                    buffer.append(res.getString(0)+"\n");
                    buffer.append(res.getString(1)+"\n");
                    buffer.append(res.getString(2)+"\n");
                }
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity14.this);
                builder.setCancelable(true);
                builder.setTitle("USER DETAILS");
                builder.setMessage(buffer.toString());
                builder.show();

            }
        });

    }
}