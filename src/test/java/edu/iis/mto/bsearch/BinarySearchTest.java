package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void ifItemExistsInSequence() {
        int[] seq = {3};
        int itemToFind = 3;
        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals(0, searchResult.getPosition());
    }

    @Test
    void ifItemNotExistsInSequence() {
        int[] seq = {3};
        int itemToFind = 4;
        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertFalse(searchResult.isFound());
        Assert.assertEquals(-1, searchResult.getPosition());
    }
}
