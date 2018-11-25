package com.homeshop;

public class Television extends Product {
    private int size;
    private String sLabType;

    public Television(String name, String description, double price, int size, String sLabType) {
        super(name, description, price);
        this.size = size;
        this.sLabType = sLabType;
    }

    public int getSize() {
        return size;
    }

    public String getsLabType() {
        return sLabType;
    }
}