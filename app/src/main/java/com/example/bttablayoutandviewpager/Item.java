package com.example.bttablayoutandviewpager;

// Model class cho dữ liệu
public class Item {
    private String title;
    private String description;
    private String date;
    private String price;
    private String rating;
    private String category;
    private String likes;
    private int imageResource;

    public Item(String title, String description, String date, String price,
                String rating, String category, String likes, int imageResource) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.price = price;
        this.rating = rating;
        this.category = category;
        this.likes = likes;
        this.imageResource = imageResource;
    }

    // Getters
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getDate() { return date; }
    public String getPrice() { return price; }
    public String getRating() { return rating; }
    public String getCategory() { return category; }
    public String getLikes() { return likes; }
    public int getImageResource() { return imageResource; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setDate(String date) { this.date = date; }
    public void setPrice(String price) { this.price = price; }
    public void setRating(String rating) { this.rating = rating; }
    public void setCategory(String category) { this.category = category; }
    public void setLikes(String likes) { this.likes = likes; }
    public void setImageResource(int imageResource) { this.imageResource = imageResource; }
}