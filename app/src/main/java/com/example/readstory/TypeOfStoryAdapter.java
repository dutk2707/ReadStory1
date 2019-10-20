package com.example.readstory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TypeOfStoryAdapter extends RecyclerView.Adapter<TypeOfStoryAdapter.TypeStoryViewHoder> {
    ArrayList<TypeOfStory> typeOfStoryArrayList;
    OnClickListener callBack;
    public TypeOfStoryAdapter(ArrayList<TypeOfStory> typeOfStoryArrayList, OnClickListener callBack) {
        this.typeOfStoryArrayList = typeOfStoryArrayList;
        this.callBack = callBack;
    }

    @NonNull
    @Override
    public TypeStoryViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.type_of_story, parent, false);
        return new TypeStoryViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TypeOfStoryAdapter.TypeStoryViewHoder holder, int position) {
        final TypeOfStory typeOfStory = typeOfStoryArrayList.get(position);
        holder.imageViewTypeStory.setImageResource(typeOfStory.getImageTypeStory());
        holder.textViewTypeStory.setText(typeOfStory.getNameTypeStory());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callBack.onTypeStoryClick(typeOfStory.nameTypeStory);
            }
        });
    }

    @Override
    public int getItemCount() {
        return typeOfStoryArrayList.size();
    }

    public class TypeStoryViewHoder extends RecyclerView.ViewHolder{
        ImageView imageViewTypeStory;
        TextView textViewTypeStory;
        public TypeStoryViewHoder(@NonNull View itemView) {
            super(itemView);
            imageViewTypeStory = itemView.findViewById(R.id.ivTypeStory);
            textViewTypeStory = itemView.findViewById(R.id.tvTypeStory);
        }
    }
    interface OnClickListener {
            void onTypeStoryClick(String nameTypeStory);
            void onNameStoryClick(String storyContent);
    }
}
