package com.example.kimja.third_homework;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.kimja.third_homework.R.id.imageView2;
import static com.example.kimja.third_homework.R.id.showbtn;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    TextView textView;
    ImageView imageView;
    Bitmap bitmap;
    int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메뉴를 눌러보세요.");
        init();
    }

    public void init(){
        linearLayout = (LinearLayout)findViewById(R.id.linearLayout);
        textView = (TextView)findViewById(R.id.textView);
        imageView = (ImageView)findViewById(R.id.imageView2);







    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.setred:
                linearLayout.setBackgroundColor(Color.RED);
                break;
            case R.id.setblue:
                linearLayout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.setyellow:
                linearLayout.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.turn30:
                if(count==12) count = 0;
                imageView.setRotation(30*count);
                count++;
                break;
            case R.id.showbtn:
                if (item.isChecked()){
                    textView.setVisibility(View.INVISIBLE);
                    item.setChecked(false);
                } else {

                    textView.setVisibility(View.VISIBLE);
                    item.setChecked(true);
                }
                break;

            case R.id.x2btn:
                if (item.isChecked()){

                    item.setChecked(false);
                } else {

                    item.setChecked(true);
                }
                break;
            case R.id.selchiken:
                if (item.isChecked()){

                } else {
                    textView.setText("겁나 맛있는 치킨");
                    imageView.setVisibility(View.VISIBLE);
                    imageView.setRotation(0);
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.chiken));
                    item.setChecked(true);
                }
                break;
            case R.id.selspa:
                if (item.isChecked()){

                } else {
                    textView.setText("새콤한 스파게티");
                    imageView.setVisibility(View.VISIBLE);
                    imageView.setRotation(0);
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.spa));
                    item.setChecked(true);
                }
        }

        return super.onOptionsItemSelected(item);
    }


}
