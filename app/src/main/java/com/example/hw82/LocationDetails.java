package com.example.hw82;

public class LocationDetails {
    private String topic;
    private String text;
    public LocationDetails(String topic,String text){
        this.topic=topic;
        this.text=text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
