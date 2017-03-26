package com.example.kimja.third_homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.chickandspa:
                Intent intent = new Intent(Main3Activity.this,
                        MainActivity.class);
                startActivity(intent);
                break;
            case R.id.calculator:
                Intent intent2 = new Intent(Main3Activity.this,
                        Main2Activity.class);
                startActivity(intent2);
        }

        return super.onOptionsItemSelected(item);
    }
}
