package com.bezkoder.springjwt.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(	name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 20)
    private String name;

    @NotBlank
    @Size(max = 520)
    private String link;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @JsonManagedReference
    @OneToMany(  mappedBy = "room",
        cascade = CascadeType.ALL,
        orphanRemoval = true)
    private List<Sensor>  sensors = new ArrayList<>();

    public Room() {
    }

    public Room(@NotBlank @Size(max = 20) String name,
        @NotBlank  String link, User user, List<Sensor> sensors) {
        this.name = name;
        this.link = link;
        this.user = user;
        this.sensors = sensors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}