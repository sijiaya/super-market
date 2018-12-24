package com.soft1841.sm.entity;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class Seller {
    private final SimpleLongProperty id = new SimpleLongProperty();
    private final SimpleLongProperty workId = new SimpleLongProperty();
    private final SimpleStringProperty password = new SimpleStringProperty();
    private final SimpleStringProperty name = new SimpleStringProperty();
    private final SimpleStringProperty avatar = new SimpleStringProperty();
    private final SimpleStringProperty address = new SimpleStringProperty();


    public Seller() {
    }

    public long getId() {
        return id.get();
    }

    public SimpleLongProperty idProperty() {
        return id;
    }

    public void setId(long id) {
        this.id.set(id);
    }

    public long getWorkId() {
        return workId.get();
    }

    public SimpleLongProperty workIdProperty() {
        return workId;
    }

    public void setWorkId(long workId) {
        this.workId.set(workId);
    }

    public String getPassword() {
        return password.get();
    }

    public SimpleStringProperty passwordProperty() {
        return password;
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getAvatar() {
        return avatar.get();
    }

    public SimpleStringProperty avatarProperty() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar.set(avatar);
    }

    public String getAddress() {
        return address.get();
    }

    public SimpleStringProperty addressProperty() {
        return address;
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", workId=" + workId +
                ", password=" + password +
                ", name=" + name +
                ", avatar=" + avatar +
                ", address=" + address +
                '}';
    }
}
