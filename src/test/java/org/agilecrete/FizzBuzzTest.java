package org.agilecrete;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest {

    private FizzBuzz fb = null;

    @Before
    public void setup(){
        fb = new FizzBuzz();
    }

    @Test
    public void junitWorks(){
        Assert.assertTrue(true);
    }

    @Test
    public void whenInputIsTwo_itWillReturnTwo(){
        Assert.assertEquals("2", fb.convert(2));
    }

    @Test
    public void whenInputIsThree_itWillReturnFizz(){
        Assert.assertEquals(FizzBuzz.FIZZ, fb.convert(3));
    }

    @Test
    public void whenInputIsSix_itWillReturnFizz(){
        Assert.assertEquals(FizzBuzz.FIZZ, fb.convert(6));
    }

    @Test
    public void whenInputIsTen_itWillReturnBuzz(){
        Assert.assertEquals(FizzBuzz.BUZZ, fb.convert(10));
    }

    @Test
    public void whenInputIsFifteen_itWillReturnFizzBuzz(){
        Assert.assertEquals(FizzBuzz.FIZZ + FizzBuzz.BUZZ, fb.convert(15));
    }


}
