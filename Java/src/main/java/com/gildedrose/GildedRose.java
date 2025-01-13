package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for (Item item : items) {
            item.sellIn = item.sellIn - 1;
            item.quality = item.quality - 1;


            if (item.name.equals("Aged Brie") && item.sellIn <= 0) {
                item.quality+=2;
            }
            if(item.name.contains("Conjured")){
                item.quality--;
            }
            if(item.name.equals("Backstage passes to a TAFKAL80ETC concert") && item.sellIn > 10 ){
                item.quality++;
            }
            if(item.name.equals("Backstage passes to a TAFKAL80ETC concert") && item.sellIn <= 10 && item.sellIn > 5){
                item.quality += 3;
            }
            if(item.name.equals("Backstage passes to a TAFKAL80ETC concert") && item.sellIn <= 5 && item.sellIn > 0) {
                item.quality += 4;
            }
            if(item.name.equals("Backstage passes to a TAFKAL80ETC concert") && item.sellIn <= 0){
                item.quality = 0;
            }
            if (item.quality > 50){
                item.quality = 50;
            }
            if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn = item.sellIn +1;
                item.quality = 80;
            }
            if (item.quality < 0){
                item.quality = 0;
            }
            }


        }
        /*for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie") && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) { //It is not brie or concert
                if (items[i].quality > 0) { //quality is more than 0
                     if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) { //and it isn't the hammer
                        items[i].quality = items[i].quality - 1; //reduce the quality by 1
                    }
                }
            } else {
                if (items[i].quality < 50) { //if it is one of those items and is less than 50
                    items[i].quality = items[i].quality + 1; //increase the quality

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) { //if it's the ticket
                        if (items[i].sellIn < 11) { //and the concert is less than 11 days
                            if (items[i].quality < 50) { //and the value is less than 50
                                items[i].quality = items[i].quality + 1; //increase the quality again
                            }
                        }

                        if (items[i].sellIn < 6) { // if the concert is in less than 6 days
                            if (items[i].quality < 50) { //and less than 50
                                items[i].quality = items[i].quality + 1; //increase a third time
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) { //if the item is not the hammer
                items[i].sellIn = items[i].sellIn - 1; //decrease the sell by date
            }

            if (items[i].sellIn < 0) { //if the sell by date is passed
                if (!items[i].name.equals("Aged Brie")) { //and it isn't the cheese
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) { // or the concert
                        if (items[i].quality > 0) { // if the item is more than 0
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) { // but not the hammer
                                items[i].quality = items[i].quality - 1; //remove 1 additional quality
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality; //if it is the concert, go to zero
                    }
                } else { // if it's the cheese
                    if (items[i].quality < 50) { //and the quality is less than 50
                        items[i].quality = items[i].quality + 1; // increase by one
                    }
                }
            }
        }
    }*/


    }
//}
