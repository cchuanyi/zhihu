package com.ccy.zhihu.ui.home.adapter;

import com.ccy.zhihu.entity.commonEntity.TopStoriesEntity;
import com.ccy.zhihu.ui.drawer.DisplaybleItem;

import java.util.ArrayList;
import java.util.List;

public class HomeHeaderItem implements DisplaybleItem {
    private List<TopStoriesEntity> topStories;
    private List<String> images;
    private List<String> titles;
    private List<Integer> ids;

    public HomeHeaderItem(List<TopStoriesEntity> topStories) {
        this.topStories = topStories;
        initData();
    }

    private void initData() {
        images = new ArrayList<>();
        titles = new ArrayList<>();
        ids = new ArrayList<>();

        for (TopStoriesEntity topStory : topStories) {
            images.add(topStory.getImage());
            titles.add(topStory.getTitle());
            ids.add(topStory.getId());
        }
    }

    public List<TopStoriesEntity> getTopStories() {
        return topStories;
    }

    public List<String> getImages() {
        return images;
    }

    public List<String> getTitles() {
        return titles;
    }

    public List<Integer> getIds() {
        return ids;
    }
}
