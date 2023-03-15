/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sumof2number.SumOf2Number;

/**
 *
 * @author phuc
 */
public class SumOf2NumberTest {
    
    public SumOf2NumberTest() {
    }
    private SumOf2Number test;
    @Before
    public void setUp() throws Exception {
	test = new SumOf2Number();
    }

    @After
    public void tearDown() throws Exception {
	test = null;
    }

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    @Test
    public void test1(){
        String n1="1234",n2="2939"; 
        assertEquals("4173",test.findSum(n1, n2));
    }
}
