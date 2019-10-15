package com.example.readstory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TypeOfStoryAdapter extends RecyclerView.Adapter<TypeOfStoryAdapter.MyViewHoder> {
    ArrayList<TypeOfStory> typeOfStoryArrayList;
    public TypeOfStoryAdapter(ArrayList<TypeOfStory> typeOfStoryArrayList){
        this.typeOfStoryArrayList = typeOfStoryArrayList;
    }

    @NonNull
    @Override
    public MyViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.type_of_story, parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull TypeOfStoryAdapter.MyViewHoder holder, int position) {
        TypeOfStory typeOfStory = typeOfStoryArrayList.get(position);
        holder.imageViewTypeStory.setImageResource(typeOfStory.getImageTypeStory());
        holder.textViewTypeStory.setText(typeOfStory.getNameTypeStory());

    }

    @Override
    public int getItemCount() {
        return typeOfStoryArrayList.size();
    }

    public class MyViewHoder extends RecyclerView.ViewHolder{
        ImageView imageViewTypeStory;
        TextView textViewTypeStory;
        public MyViewHoder(@NonNull View itemView) {
            super(itemView);
            imageViewTypeStory = itemView.findViewById(R.id.ivTypeStory);
            textViewTypeStory = itemView.findViewById(R.id.tvTypeStory);
        }
    }
}
