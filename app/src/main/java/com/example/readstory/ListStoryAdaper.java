package com.example.readstory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListStoryAdaper extends RecyclerView.Adapter<ListStoryAdaper.ListStoryViewHolder> {
    ArrayList<StoryItem> storyItemArrayList;
    TypeOfStoryAdapter.OnClickListener callback;

    public ListStoryAdaper(ArrayList<StoryItem> storyItemArrayList, TypeOfStoryAdapter.OnClickListener callback) {
        this.storyItemArrayList = storyItemArrayList;
        this.callback = callback;
    }

    @NonNull
    @Override
    public ListStoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_story, parent, false);
        return new ListStoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListStoryAdaper.ListStoryViewHolder holder, int position) {
        final StoryItem storyItem = storyItemArrayList.get(position);
        holder.tvStoryName.setText(storyItem.getNameStoryItem());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.onNameStoryClick(storyItem.getStoryContent());
            }
        });
    }

    @Override
    public int getItemCount() {
        return storyItemArrayList.size();
    }

    public class ListStoryViewHolder extends RecyclerView.ViewHolder{
        TextView tvStoryName;
        public ListStoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvStoryName = itemView.findViewById(R.id.tvStoryName);
        }
    }
}
