/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Interface.BinarySearchIntr;
import Service.BinarySearchService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dotmons
 */
public class BinarySearchTest {

    BinarySearchIntr binSeah = new BinarySearchService();
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void binarySearch() {
        ArrayList<Integer> myList = new ArrayList<>(
                Arrays.asList(0, 3, 4, 7, 9, 11, 34, 46, 57, 65)
        );

        int bina = 4;

        //assertEquals(binSeah.binarySearch(myList, bina), bina);
        assertEquals(binSeah.binaryDOtunSearch(myList, bina), bina);
    }
}
