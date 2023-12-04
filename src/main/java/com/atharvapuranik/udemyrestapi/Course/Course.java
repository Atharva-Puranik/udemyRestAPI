package com.atharvapuranik.udemyrestapi.Course;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "author")
    String author;

    public Course(int id, String Name, String Author) {
        this.id = id;
        this.name = Name;
        this.author = Author;
    }
    public Course(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String Author) {
        this.author = Author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", Author='" + author + '\'' +
                '}';
    }
}
