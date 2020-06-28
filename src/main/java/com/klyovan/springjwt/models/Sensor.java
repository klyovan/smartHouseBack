package com.klyovan.springjwt.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(	name = "sensor")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 20)
    private String name;

    @NotBlank
    @Size(max = 100)
    private String link;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private Room room;

    @NotBlank
    private String topic;

    @NotBlank
    private String msgOn;

    @NotBlank
    private String msgOff;


    public Sensor() {
    }

    public Sensor(@NotBlank @Size(max = 20) String name,
        @NotBlank @Size(max = 100) String link, Room room, @NotBlank String topic, @NotBlank String msgOn,
        @NotBlank String msgOff) {
        this.name = name;
        this.link = link;
        this.room = room;
        this.topic = topic;
        this.msgOn = msgOn;
        this.msgOff = msgOff;
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMsgOn() {
        return msgOn;
    }

    public void setMsgOn(String msgOn) {
        this.msgOn = msgOn;
    }

    public String getMsgOff() {
        return msgOff;
    }

    public void setMsgOff(String msgOff) {
        this.msgOff = msgOff;
    }
}