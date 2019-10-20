package com.example.readstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.readstory.CONST.*;

public class DisplayListStoryActivity<listAllStoryArrayList> extends AppCompatActivity implements TypeOfStoryAdapter.OnClickListener{
    RecyclerView rvStoryItem;
    ArrayList<StoryItem> listAllStoryArrayList;
    ArrayList<StoryItem> listStoryArrayList;
    TextView tvTypeStoryItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_story);
        listAllStoryArrayList = new ArrayList<>();
        listStoryArrayList = new ArrayList<>();
        initView();
    }
        public void initView() {
        rvStoryItem = (RecyclerView) findViewById(R.id.rvStoryName);
        tvTypeStoryItem = (TextView) findViewById(R.id.tvTypeStoryItem);
        Intent intent = getIntent();
        Log.d("DisplayListStory", "NameTitle : " + intent.getStringExtra(TYPE_STORY));
        tvTypeStoryItem.setText(intent.getStringExtra(TYPE_STORY) + "");
        listAllStoryArrayList = new ArrayList<>();
        listStoryArrayList = new ArrayList<>();
            listAllStoryArrayList.add(new StoryItem("Ngôn tình 1.", "Ngôn Tình", "Content ngôn tinh 1" ));
            listAllStoryArrayList.add(new StoryItem("Ngôn tình 2.", "Ngôn Tình","Content ngôn tinh 2"));
            listAllStoryArrayList.add(new StoryItem("Ngôn tình 3.", "Ngôn Tình","Content ngôn tinh 3" ));
            listAllStoryArrayList.add(new StoryItem("Văn Học 1.", "Văn Học", "Content văn học 1"));
            listAllStoryArrayList.add(new StoryItem("Văn Học 2.", "Văn Học", "Content văn học 2"));
            listAllStoryArrayList.add(new StoryItem("Văn Học 3.", "Văn Học", "Content văn học 3"));
            listAllStoryArrayList.add(new StoryItem("Trinh Thám 1.", "Trinh Thám", "Content trinh thám 1"));
            listAllStoryArrayList.add(new StoryItem("Trinh Thám 2.", "Trinh Thám", "Content trinh thám 2"));
            listAllStoryArrayList.add(new StoryItem("Trinh Thám 3.", "Trinh Thám", "Content trinh thám 3"));
            listAllStoryArrayList.add(new StoryItem("Kiếm Hiệp 1.", "Kiếm Hiệp", "Content kiếm hiệp 1"));
            listAllStoryArrayList.add(new StoryItem("Kiếm Hiệp 2.", "Kiếm Hiệp", "Content kiếm hiệp 2"));
            listAllStoryArrayList.add(new StoryItem("Kiếm Hiệp 3.", "Kiếm Hiệp", "Content kiếm hiệp 3"));
            listAllStoryArrayList.add(new StoryItem("Kinh Dị 1.", "Kinh Dị", "Content kinh dị 1"));
            listAllStoryArrayList.add(new StoryItem("Kinh Dị 2.", "Kinh Dị", "Content kinh dị 2"));
            listAllStoryArrayList.add(new StoryItem("Kinh Dị 3.", "Kinh Dị", "Content kinh dị 3"));
            listAllStoryArrayList.add(new StoryItem("Lịch Sử 1.", "Lịch Sử", "Content lịch sử 1"));
            listAllStoryArrayList.add(new StoryItem("Lịch Sử 2.", "Lịch Sử", "Content lịch sử 2"));
            listAllStoryArrayList.add(new StoryItem("Lịch Sử 3.", "Lịch Sử", "Content lịch sử 3"));

        for (int i = 0; i < listAllStoryArrayList.size(); i++) {
            if (listAllStoryArrayList.get(i).getNameTypeStoryItem().equals(intent.getStringExtra(TYPE_STORY))) {
                listStoryArrayList.add(listAllStoryArrayList.get(i));
            }
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvStoryItem.setLayoutManager(linearLayoutManager);
        ListStoryAdaper listStoryAdaper = new ListStoryAdaper(listStoryArrayList, this);
        rvStoryItem.setAdapter(listStoryAdaper);
    }

    @Override
    public void onTypeStoryClick(String nameTypeStory) {

    }

    @Override
    public void onNameStoryClick(String storyContent) {
        Intent intent = new Intent(DisplayListStoryActivity.this, DisplayContentStoryActivity.class);
        intent.putExtra(CONTENT, storyContent);
        Log.d("CONTENT_PUT", storyContent);
        startActivity(intent);
    }
}

