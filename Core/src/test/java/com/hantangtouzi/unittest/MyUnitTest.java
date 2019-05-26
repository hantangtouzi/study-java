package com.hantangtouzi.unittest;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author WilliamChang.
 * Created on 2019-05-26 19:55:31
 */

public class MyUnitTest {
    @Test
    public void testConcat() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concat("one", "two");

        Assert.assertEquals("onetwo", result);
    }
}
