/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Training.SmallestSubstring;
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
public class SmallestSubstringTest {

    SmallestSubstring sub = new SmallestSubstring();
    
    @Test
    public void smallestSubstring() {
        
        String words[] = {"but", "put", "big", "pot", "pog", "dog", "lot"};
        assertEquals(5, sub.shortestWordEditPath("bit", "dog", words));
    }

    @Test
    public void secondTest() {
        String word[] = {"kel", "eln", "nme", "pot", "man", "dog", "lot"};
        assertEquals(4, sub.shortestWordEditPath("kil", "man", word));
    }
}
