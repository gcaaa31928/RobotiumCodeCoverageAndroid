package com.example.red.myapplication;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

/**
 * Created by wuxian on 15/5/6.
 */
public class UITestingLowCoverage extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    public UITestingLowCoverage() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());
    }

    public void testStartClose() throws Exception {
        Thread.sleep(1000);
    }

    public void testBack() throws Exception {
        solo.goBack();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();

    }

}