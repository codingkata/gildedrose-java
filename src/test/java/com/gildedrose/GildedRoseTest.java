package com.gildedrose;


import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

public class GildedRoseTest {

    @Test
    public void foo() throws Exception {
        CombinationApprovals.verifyAllCombinations(
                this::getUpdateResult,
                new String[]{"foo","Aged Brie","Backstage passes to a TAFKAL80ETC concert","Sulfuras, Hand of Ragnaros"},
                new Integer[]{-1,0,11},
                new Integer[]{0,1,49,50});
    }

    String getUpdateResult(String name, int sellIn, int quality) {
        Item[] items = new Item[] { new Item(name, sellIn, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }
}