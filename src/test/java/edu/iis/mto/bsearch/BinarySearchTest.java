package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void ifItemExistReturnPosition() {
        int[] seq = {3};
        int itemToFind = 3;
        SearchResult searchResult = BinarySearch.search(itemToFind, seq);
        Assert.assertTrue(searchResult.isFound());
        Assert.assertEquals(0, searchResult.getPosition());
    }
}
