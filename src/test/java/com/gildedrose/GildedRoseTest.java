package com.gildedrose;


import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

    @Test
    public void update_test() {
        String[] names=new String[]{"foo"};
        Integer[] sellIns = new Integer[]{0};
        Integer[] qualities= new Integer[]{0};
        CombinationApprovals.verifyAllCombinations(this::getUpdateItemResult,names,sellIns,qualities);
    }

    private String getUpdateItemResult(String name, int sellIn, int quality) {
        Item[] items = new Item[]{new Item(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }

}