package com.example.ui_expenser;

public class MessageModelClass {
    String body="";
    String date="";
    String avail="";
    String type="";
    String deborcredamt="";
    String acc="";

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAvail() {
        return avail;
    }

    public void setAvail(String avail) {
        this.avail = avail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeborcredamt() {
        return deborcredamt;
    }

    public void setDeborcredamt(String deborcredamt) {
        this.deborcredamt = deborcredamt;
    }

    public MessageModelClass() {
    }

    public MessageModelClass(String body, String date, String avail, String type, String deborcredamt,String acc) {
        this.body = body;
        this.date = date;
        this.avail = avail;
        this.type = type;
        this.deborcredamt = deborcredamt;
        this.acc=acc;
    }

}
