package com.gildedrose;

import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest {


    @Test
    public void qualityAndSellInBehaveAsExpected() throws Exception {
        Item[] items = createItems();
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertTheFollowing("Antique table", items[0].name, 9, items[0].sellIn, 19, items[0].quality);
        assertTheFollowing("Antique chair", items[1].name, 9, items[1].sellIn, 0, items[1].quality);
        assertTheFollowing("Aged Brie", items[2].name, 1, items[2].sellIn, 1, items[2].quality);
        assertTheFollowing("Sulfuras, Hand of Ragnaros", items[3].name, 0, items[3].sellIn, 50, items[3].quality);
        assertTheFollowing("Backstage passes to a Metallica concert", items[4].name, 14, items[4].sellIn, 21, items[4].quality);
        assertTheFollowing("Backstage passes to a Metallica concert", items[5].name, 9, items[5].sellIn, 50, items[5].quality);
        assertTheFollowing("Backstage passes to a Metallica concert", items[6].name, 4, items[6].sellIn, 50, items[6].quality);
        assertTheFollowing("Backstage passes to a Metallica concert", items[7].name, -1, items[7].sellIn, 0, items[7].quality);
    }

    private Item[] createItems() {
        return new Item[] {
                new Item("Antique table", 10, 20),
                new Item("Antique chair", 10, 0),
                new Item("Aged Brie", 2, 0),
                new Item("Sulfuras, Hand of Ragnaros", 0, 50),
                new Item("Backstage passes to a Metallica concert", 15, 20),
                new Item("Backstage passes to a Metallica concert", 10, 48),
                new Item("Backstage passes to a Metallica concert", 5, 47),
                new Item("Backstage passes to a Metallica concert", 0, 15)};
    }

    private void assertTheFollowing(String expectedName, String name, int expectedSellIn, int sellIn, int expectedQuality, int quality) {
        Assert.assertEquals(expectedName, name);
        Assert.assertEquals(expectedSellIn, sellIn);
        Assert.assertEquals(expectedQuality, quality);
    }
}
