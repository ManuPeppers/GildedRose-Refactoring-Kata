package com.gildedrose;

public class Sulfuras {

   private final int sellin;

   private final int quality = 80;

   private String name;


    public Sulfuras(String name,int sellin) {
        this.sellin = sellin;
        this.name = name;
    }

    public int getSellin() {
        return sellin;
    }

    public int getQuality() {
        return quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
