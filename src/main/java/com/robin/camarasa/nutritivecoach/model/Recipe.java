package com.robin.camarasa.nutritivecoach.model;

import javax.persistence.*;

@Entity
@SuppressWarnings("serial")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long type;

    @SuppressWarnings("unused")
    public Recipe() {
    }

    public Recipe(String name, Long type, Long id) {
        this.name = name;
        this.type = type;
        this.id = id;
    }

    public Recipe(String name, Long type) {
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public Long getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(Long type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "id : " + this.id + "\n" +
                "name : " + this.getName() + "\n" +
                "type : " + this.getType() + "\n";
    }
}
