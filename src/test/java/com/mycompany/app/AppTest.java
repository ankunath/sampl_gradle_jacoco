package com.mycompany.app;

import junit.framework.*;
/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
      try {
        App x = new App();
        x.add(1,2);
        assertTrue(true);
      } catch (Exception ex) {
        assertTrue(false);
      }
    }
}
