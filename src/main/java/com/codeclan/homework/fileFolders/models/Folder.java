package com.codeclan.homework.fileFolders.models;

import javax.persistence.*;

@Entity
@Table(name="folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    public Folder(String title, Long id) {
        this.title = title;
        this.id = id;
    }

    public Folder() {}


}
