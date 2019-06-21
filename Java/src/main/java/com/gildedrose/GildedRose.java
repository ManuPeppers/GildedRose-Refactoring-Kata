package com.gildedrose;

import static java.lang.Integer.min;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {

            if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                backStage(items[i]);
            } else if (items[i].name.equals("Aged Brie")) {
                agedBrie(items[i]);
            } else if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                normal(items[i]);
            }
        }
    }

    private void normal(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }

    private void agedBrie(Item item) {
        if (item.quality < 50) {
            item.quality = min(item.quality + 1, 50);
        }
        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            item.quality = min(item.quality + 1, 50);
        }
    }

    private void backStage(Item item) {
        if (item.quality < 50) {

            if (item.sellIn < 6) {
                item.quality = min(item.quality + 3, 50);
            }
            else if (item.sellIn < 11) {
                item.quality = min(item.quality + 2,50);
            } else
                item.quality = min(item.quality + 1, 50);

            item.sellIn = item.sellIn - 1;
        }
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}