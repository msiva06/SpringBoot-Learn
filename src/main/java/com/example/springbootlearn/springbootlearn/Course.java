package com.example.springbootlearn.springbootlearn;

public class Course {
    private int id;
    private String title;

    public Course(int id, String title) {
        this.id = id;
        this.title = title;
    }
    
    @Override
    public String toString() {
        return "Course [id=" + id + ", title=" + title + "]";
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    
}
