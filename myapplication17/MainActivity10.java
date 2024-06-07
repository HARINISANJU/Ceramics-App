package com.example.myapplication17;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {
    Integer[] imageids = {
            R.drawable.img_8,
            R.drawable.img_7,
            R.drawable.img_6,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Image" + (position + 1) + "Selected", Toast.LENGTH_LONG).show();
            }
        });

    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;

        public ImageAdapter(Context c) {
            context = c;
        }

        @Override
        public int getCount() {
            return imageids.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if (convertView == null) {
                imageView = new ImageView(context);
                imageView.setLayoutParams(new GridView.LayoutParams(600, 600));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(20, 20, 20, 20);
            } else {
                imageView = (ImageView) convertView;
            }
            imageView.setImageResource(imageids[position]);
            return imageView;
        }
    }
}
