package com.example.readstory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TypeOfStoryAdapter.OnClickListener {
    RecyclerView recyclerViewTypeStory;
    ArrayList<TypeOfStory> typeOfStoryArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        int numberColum = 2;
        recyclerViewTypeStory = (RecyclerView) findViewById(R.id.rvTypeStory);
        typeOfStoryArrayList = new ArrayList<>();
        typeOfStoryArrayList.add(new TypeOfStory("Kiếm Hiệp", R.drawable.kiem_hiep));
        typeOfStoryArrayList.add(new TypeOfStory("Kinh Dị", R.drawable.kinh_di));
        typeOfStoryArrayList.add(new TypeOfStory("Lịch Sử", R.drawable.lich_su));
        typeOfStoryArrayList.add(new TypeOfStory("Ngôn Tình", R.drawable.ngon_tinh));
        typeOfStoryArrayList.add(new TypeOfStory("Trinh Thám", R.drawable.trinh_tham));
        typeOfStoryArrayList.add(new TypeOfStory("Văn Học", R.drawable.van_hoc));

        recyclerViewTypeStory.setLayoutManager(new GridLayoutManager(this, numberColum));
        TypeOfStoryAdapter adapter = new TypeOfStoryAdapter(typeOfStoryArrayList, this);
        recyclerViewTypeStory.setAdapter(adapter);
    }

    @Override
    public void onTypeStoryClick(String nameTypeStory) {
        Intent intent = new Intent(MainActivity.this, DisplayListStoryActivity.class);
        intent.putExtra(CONST.TYPE_STORY, nameTypeStory);
        startActivity(intent);
    }

    @Override
    public void onNameStoryClick(String storyContent) {

    }
}
