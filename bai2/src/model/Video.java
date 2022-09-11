package model;

import abstract_class.Thing;

public class Video extends Thing {
    // thuộc tính
    private int serial;
    private String name;
    private Double length;
    private String quality;

    // constructor
    public Video() {
    }

    public Video(int serial, String name, Double length, String quality) {
        this.serial = serial;
        this.name = name;
        this.length = length;
        this.quality = quality;
    }

    // getter, setter
    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public String getDescription() {
        return "Video{" +
                "serial=" + serial +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", quality='" + quality + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Video{" +
//                "serial=" + serial +
//                ", name='" + name + '\'' +
//                ", length=" + length +
//                ", quality='" + quality + '\'' +
//                '}';
//    }
}
