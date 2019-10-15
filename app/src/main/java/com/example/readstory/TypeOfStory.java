package com.example.readstory;

public class TypeOfStory {
    private String nameTypeStory;
    private int imageTypeStory;

    public TypeOfStory(){

    }

    public TypeOfStory(String nameTypeStory, int imageTypeStory){
        this.nameTypeStory = nameTypeStory;
        this.imageTypeStory = imageTypeStory;
    }

    public String getNameTypeStory() {
        return nameTypeStory;
    }

    public void setNameTypeStory(String nameTypeStory) {
        this.nameTypeStory = nameTypeStory;
    }

    public int getImageTypeStory() {
        return imageTypeStory;
    }

    public void setImageTypeStory(int imageTypeStory) {
        this.imageTypeStory = imageTypeStory;
    }
}
