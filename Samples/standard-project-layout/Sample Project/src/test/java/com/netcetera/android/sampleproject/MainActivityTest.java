package com.netcetera.android.sampleproject;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowActivity;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    private Button button;
    private EditText x;
    private EditText y;
    private TextView sumTextView;

    @Before
    public void setUp() throws Exception {
        MainActivity mainActivity = Robolectric.buildActivity(MainActivity.class).create().get();
        button = (Button) mainActivity.findViewById(R.id.button);
        x = (EditText) mainActivity.findViewById(R.id.editTextX);
        y = (EditText) mainActivity.findViewById(R.id.editTextY);
        sumTextView = (TextView) mainActivity.findViewById(R.id.textViewSum);
    }

    @Test
    public void shouldAdd() {
        // given
        x.setText("4");
        y.setText("3");

        // when
        button.performClick();

        // then
        Assert.assertEquals("7", sumTextView.getText().toString());
    }

}
