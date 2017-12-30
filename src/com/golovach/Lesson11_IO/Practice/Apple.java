package com.golovach.Lesson11_IO.Practice;

import java.util.Arrays;

public class Apple implements Fruit {
    private int waight;
    private String color;
    private SUPP[] supliers;

    public Apple(int waight, String color, SUPP[] supliers) {
        this.waight = waight;
        this.color = color;
        this.supliers = supliers;
    }

    public int getWeight() {
        return waight;
    }

    public void setWaight(int waight) {
        this.waight = waight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SUPP[] getSupliers() {
        return supliers;
    }

    public void setSupliers(SUPP[] supliers) {
        this.supliers = supliers;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "waight=" + waight +
                ", color='" + color + '\'' +
                ", supliers=" + Arrays.toString(supliers) +
                '}';
    }

    enum SUPP {Columbia, America}
}
