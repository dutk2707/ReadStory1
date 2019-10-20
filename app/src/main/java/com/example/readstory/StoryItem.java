package com.example.readstory;

public class StoryItem {
    private String nameStoryItem;
    private String nameTypeStoryItem;
    private String storyContent;

    public StoryItem(String nameStoryItem, String nameTypeStoryItem, String storyContent) {
        this.nameStoryItem = nameStoryItem;
        this.nameTypeStoryItem = nameTypeStoryItem;
        this.storyContent = storyContent;
    }

    public String getNameStoryItem() {
        return nameStoryItem;
    }

    public void setNameStoryItem(String nameStoryItem) {
        this.nameStoryItem = nameStoryItem;
    }

    public String getNameTypeStoryItem() {
        return nameTypeStoryItem;
    }

    public void setNameTypeStoryItem(String nameTypeStoryItem) {
        this.nameTypeStoryItem = nameTypeStoryItem;
    }

    public String getStoryContent() {
        return storyContent;
    }

    public void setStoryContent(String storyContent) {
        this.storyContent = storyContent;
    }
}
