package com.gildedrose;


import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

    @Test
    public void update_test() {
        String[] names=
                new String[]{
                        "foo",
                        "Aged Brie",
                        "Backstage passes to a TAFKAL80ETC concert",
                        "Sulfuras, Hand of Ragnaros"
        };
        Integer[] sellIns = new Integer[]{-1,0,11};
        Integer[] qualities= new Integer[]{0,1,49,50};
        CombinationApprovals.verifyAllCombinations(this::getUpdateItemResult,names,sellIns,qualities);
    }
    private String getUpdateItemResult(String name, int sellIn, int quality) {
        Item[] items = new Item[]{new Item(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }
}