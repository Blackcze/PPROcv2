package com.example.cv2.model;

public class car {
    private String spz;
    private String color;
    private float tankVolume;
    private int numberOfSeats;

    public car(String spz, String color, float tankVolume, int numberOfSeats) {
        this.spz = spz;
        this.color = color;
        this.tankVolume = tankVolume;
        this.numberOfSeats = numberOfSeats;
    }

    public void setSpz(String spz) {
        this.spz = spz;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setTankVolume(float tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpz() {
        return spz;
    }

    public String getColor() {
        return color;
    }

    public float getTankVolume() {
        return tankVolume;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void remove(int id) {

    }
}
