package com.gildedrose;

public class AttributesCalculator {

    Item[] items;

    public AttributesCalculator(Item[] items) {
        this.items = items;
    }

    public void SellinMinusOne(){
        for(Item item:items){
            item.sellIn-=1;
        }
    }

    public void QualityMinusOne(){
        for(Item items:items){
            items.quality-=1;
        }
    }

}
