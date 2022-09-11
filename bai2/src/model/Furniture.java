package model;

import abstract_class.Thing;

public class Furniture extends Thing {
    // thuộc tính
    private int serial;
    private String name;
    private String producer;
    private String type;

    // constructor
    public Furniture() {
    }

    public Furniture(int serial, String name, String producer, String type) {
        this.serial = serial;
        this.name = name;
        this.producer = producer;
        this.type = type;
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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return "Furniture{" +
                "serial=" + serial +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Furniture{" +
//                "serial=" + serial +
//                ", name='" + name + '\'' +
//                ", producer='" + producer + '\'' +
//                ", type='" + type + '\'' +
//                '}';
//    }
}
