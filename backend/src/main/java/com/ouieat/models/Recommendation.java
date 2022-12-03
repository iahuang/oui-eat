package com.ouieat.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("recommendations")
public class Recommendation {

    private String userId;
    private int rating;
    private String restaurantId;
    private String review;
    private String postDate;

    private boolean recommends;

    public Recommendation(
        String userId,
        String postDate,
        int rating,
        String restaurantId,
        String review,
        boolean recommends
    ) {
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.review = review;
        this.rating = rating;
        this.postDate = postDate;
        this.recommends = recommends;
    }

    public String getUserId() {
        return this.userId;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return this.review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getRestaurantId() {
        return this.restaurantId;
    }

    public String getDate() {
        return this.postDate;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public boolean isRecommends() {
        return recommends;
    }

    public void setRecommends(boolean recommends) {
        this.recommends = recommends;
    }
}