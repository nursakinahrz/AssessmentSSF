package ssf.assessment.day20.models;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class Articles {
    
    private String id;
    private String published_on;
    private String title;
    private String url;
    private String imageurl;
    private String body;
    private String tags;
    private String categories;
    private String feeds;
    

   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublished_on() {
        return published_on;
    }

    public void setPublished_on(String published_on) {
        this.published_on = published_on;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getFeeds() {
        return feeds;
    }

    public void setFeeds(String feeds) {
        this.feeds = feeds;
    }

    public static Articles create(JsonObject jo) {
        Articles articles = new Articles();
        articles.setId(jo.getString("id"));
        articles.setPublished_on(jo.getString("published_on"));
        articles.setTitle(jo.getString("title"));
        articles.setUrl(jo.getString("url"));
        articles.setImageurl(jo.getString("imageurl"));
        articles.setBody(jo.getString("body"));
        articles.setTags(jo.getString("tags"));
        articles.setCategories(jo.getString("categories"));
        articles.setFeeds(jo.getString("feeds"));
        
        return articles;
    }

    public JsonObject toJson() {
        return Json.createObjectBuilder()
            .add("id", id)
            .add("published_on", published_on)
            .add("title", title)
            .add("url", url)
            .add("imageurl", imageurl)
            .add("body", body)
            .add("tags", tags)
            .add("categories", categories)
            .build();
    }



}

