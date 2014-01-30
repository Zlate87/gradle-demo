package com.netcetera.android.sampleproject;

import junit.framework.Assert;

import org.junit.Test;

public class CalculatorUtilTest {

    @Test
    public void shouldAdd() {
        Assert.assertEquals(7, CalculatorUtil.add(4, 3));
    }
}
