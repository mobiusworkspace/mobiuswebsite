package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Training.StringComparison;
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
public class StringTest {

    @Test
    public void testStringComparison() {
        StringComparison compare = new StringComparison();
        boolean result = compare.compareString("Abc", "Abc");
        assertEquals(true, result);
    }

    @Test
    public void testNewStringComparison() {
        StringComparison compare = new StringComparison();
        boolean result = compare.compareString("Àbc", "Abc");
        assertEquals(false, result);
    }
    

}
