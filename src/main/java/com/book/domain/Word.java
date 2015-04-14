package com.book.domain;

public class Word {
    private String version;
    private String text;
    public Word(String text, String version) {
        this.text = text;
        this.version = version;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}
