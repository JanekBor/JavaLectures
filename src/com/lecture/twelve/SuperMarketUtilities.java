package com.lecture.twelve;

public class SuperMarketUtilities {

    public boolean duplicateChecker(String incomingItem, String[] existingItemList) {
        for (String item : existingItemList) {
            if(incomingItem.equalsIgnoreCase(item)){
                return true;
            }
        }
        return false;
    }


}