package com.netcetera.android.sampleproject;

import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.Test;

import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void testInstantiation() {
        Activity activity = new Activity();

        TextView tv = new TextView(activity);
        tv.setText("test");

        assertEquals("test", tv.getText());
    }
}
