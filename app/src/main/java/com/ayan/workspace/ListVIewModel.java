package com.ayan.workspace;

public class ListVIewModel {

    String name,phoneNumber;

    public ListVIewModel(String name, String phoneNumber) {
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
    }
}
