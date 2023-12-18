package com.in28minutes.springboot.learnspringboot;

public class Course {

    private final Integer id;
    private final String name;
    private final String author;

    public Course(final Integer id, final String name, final String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }


    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Course{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", author='" + author + '\'' +
            '}';
    }

}
