package model;

import javax.persistence.*;

/**
 * Created by 전소연 on 11/16/2017.
 */
@Entity
@Table(name = "course")
public class Course {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    public Course() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

