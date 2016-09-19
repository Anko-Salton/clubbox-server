package com.clubboxrest.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="\"channel\"")
public class Channel implements Serializable {

	
//	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
//	@Column(name="\"name\"")
    private String name;
//	@Column(name="\"users\"")
    private ArrayList<User> users;
//	@Column(name="\"messages\"")
    private ArrayList<Message> messages;

    public Channel(Integer id, String name, ArrayList<User> users, ArrayList<Message> messages) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.messages = messages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    public String toString() {
        return this.id + " " + this.name;
    }

    public void sendMessage(Message msg) {
        messages.add(msg);
    }

    public Message getLastMessage() {
        int z = messages.size() - 1;
        return messages.get(z);
    }
}

