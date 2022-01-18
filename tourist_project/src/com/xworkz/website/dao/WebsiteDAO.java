package com.xworkz.website.dao;

import com.xworkz.website.entity.WebsiteEntity;

public interface WebsiteDAO {
    public void save(WebsiteEntity entity);
    
    WebsiteEntity getByNameGoogle();
    WebsiteEntity getByLikeUrlX();
    WebsiteEntity getByMinSince();
    WebsiteEntity getByMaxSince();
    WebsiteEntity getBySecondMinSince();
    WebsiteEntity getBySecondMaxSince();
    
}
