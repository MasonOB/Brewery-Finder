package com.techelevator.model;

import javax.validation.constraints.NotBlank;

public class Brewery {
    @NotBlank
    private int breweryId;
    @NotBlank
    private int brewerId;
    @NotBlank
    private String name;
    @NotBlank
    private String phoneNumber;
    private String emailAddress;
    @NotBlank
    private String address;
    private String history;
    @NotBlank
    private String openHours;
    private String image;
    @NotBlank
    private String breweryType;

    public int getBreweryId() {
        return breweryId;
    }

    public void setBreweryId(int breweryId) {
        this.breweryId = breweryId;
    }

    public int getBrewerId() {
        return brewerId;
    }

    public void setBrewerId(int brewerId) {
        this.brewerId = brewerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBreweryType() {
        return breweryType;
    }

    public void setBreweryType(String breweryType) {
        this.breweryType = breweryType;
    }

    public Brewery(int breweryId, int brewerId, String name,
                   String phoneNumber, String emailAddress,
                   String address, String history,
                   String openHours, String image,
                   String breweryType) {
        this.breweryId = breweryId;
        this.brewerId = brewerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        this.history = history;
        this.openHours = openHours;
        this.image = image;
        this.breweryType = breweryType;
    }

    public Brewery(int breweryId, int brewerId, String name,
                   String phoneNumber,
                   String address,
                   String openHours,
                   String breweryType) {
        this.breweryId = breweryId;
        this.brewerId = brewerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.openHours = openHours;
        this.breweryType = breweryType;
    }

    public Brewery() {

    }
}