package com.book.domain;

public class Book {

    private long id;
    private String version;
    
    public Book(long id, String version) {
        this.id = id;
        this.version = version;
    }
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
}
