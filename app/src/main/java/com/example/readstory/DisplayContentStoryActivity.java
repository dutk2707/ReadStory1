package com.example.readstory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayContentStoryActivity extends AppCompatActivity {
    TextView tvDisplayContentStory;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_content_story);
        initView();
    }
    public void initView(){
        tvDisplayContentStory = (TextView) findViewById(R.id.tvContentStory);
        Intent intent = getIntent();
        Log.d("CONTENT_STORY", intent.getStringExtra(CONST.CONTENT));
        tvDisplayContentStory.setText(intent.getStringExtra(CONST.CONTENT) +"");
    }
}
