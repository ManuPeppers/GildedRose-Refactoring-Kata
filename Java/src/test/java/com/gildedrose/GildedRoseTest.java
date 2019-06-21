package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void decreaseSellinAndQUality() {
        Item[] items = new Item[] { new Item("Item1", 10, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(new Item("Item1",9,9).toString(), items[0].toString());
    }

    @Test
    public void decreaseSellinAndQualityAgedBrie(){
        Item[] items = new Item[]{new Item("Aged Brie",2,0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(new Item("Aged Brie",1,1).toString(), items[0].toString());
    }

    @Test
    public void decreaseSellinAndQualitySulfuras(){
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros",2,80)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(new Item("Sulfuras, Hand of Ragnaros",2,80).toString(), items[0].toString());
    }


    @Test
    public void decreaseSellinAndQualityBackstageByTwo(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",10,20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(new Item("Backstage passes to a TAFKAL80ETC concert",9,22).toString(), items[0].toString());
    }

    @Test
    public void decreaseSellinAndQualityBackstageByThree(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",5,20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(new Item("Backstage passes to a TAFKAL80ETC concert",4,23).toString(), items[0].toString());
    }

    @Test
    public void decreaseSellinAndQualityBackstage(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",15,20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(new Item("Backstage passes to a TAFKAL80ETC concert",14,21).toString(), items[0].toString());
    }

    @Test
    public void decreaseSellinAndQualityNotMoreThanFifty(){
        Item[] items = new Item[]{new Item("Aged Brie",13,50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(new Item("Aged Brie",12,50).toString(), items[0].toString());
    }

    @Test
    public void QualityNotOverflowingFifty(){
        Item[] items = new Item[]{new Item("Aged Brie",0,49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(new Item("Aged Brie",-1,50).toString(), items[0].toString());
    }

    @Test
    public void decreaseSellinAndQualityBSampleItemQualityNotNegative(){
        Item[] items = new Item[]{new Item("Sample StandardItem",4,0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(new Item("Sample StandardItem",3,0).toString(), items[0].toString());
    }

    @Test
    public void decreaseSellinAndQualityExpiredSellinDate(){
        Item[] items = new Item[]{new Item("Sample StandardItem",0,20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(new Item("Sample StandardItem",-1,18).toString(), items[0].toString());
    }

    @Test
    public void decreaseSellinAndQualityExpiredSellinDateQualityNotMinusZero(){
        Item[] items = new Item[]{new Item("Aged Brie",-1,47)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(new Item("Aged Brie",-2,49).toString(), items[0].toString());
    }

    @Test
    public void decreaseSellinAndQualityBackStageExpiredSellinDateQuality(){
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",-1,47)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(new Item("Backstage passes to a TAFKAL80ETC concert",-2,0).toString(), items[0].toString());
    }

}
