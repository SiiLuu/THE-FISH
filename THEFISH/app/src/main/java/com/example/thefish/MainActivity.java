package com.example.thefish;

import android.view.View;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void page1 (View view) {
        startActivity(new Intent(this, page_2.class));
    }
    public void page2 (View view) {
        startActivity(new Intent(this, page_3.class));
    }
    public void page3 (View view) {
        startActivity(new Intent(this, page_4.class));
    }
    public void page4 (View view) {
        startActivity(new Intent(this, page_5.class));
    }
    public void page5 (View view) {
        startActivity(new Intent(this, page_6.class));
    }
    public void page6 (View view) {
        startActivity(new Intent(this, page_7.class));
    }
    public void page7 (View view) {
        startActivity(new Intent(this, page_8.class));
    }
    public void page8 (View view) {
        startActivity(new Intent(this, page_9.class));
    }
    public void page9 (View view) {
        startActivity(new Intent(this, page_10.class));
    }
    public void page10 (View view) {
        startActivity(new Intent(this, page_11.class));
    }
    public void page11 (View view) {
        startActivity(new Intent(this, page_12.class));
    }
    public void page12 (View view) {
        startActivity(new Intent(this, page_13.class));
    }
}