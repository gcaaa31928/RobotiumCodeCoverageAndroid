package com.example.red.myapplication.test;

import com.example.red.myapplication.MainActivity;
import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


public class UIRecordingCoverage extends ActivityInstrumentationTestCase2<MainActivity> {
  	private Solo solo;
  	
  	public UIRecordingCoverage() {
		super(MainActivity.class);
  	}

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
  	}
  
	public void testRun() {
        //Wait for activity: 'com.example.red.myapplication.MainActivity'
		solo.waitForActivity(com.example.red.myapplication.MainActivity.class, 2000);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 1));
        //Click on Settings
		solo.clickInList(1, 0);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Click on Import FrameLayout
		solo.clickInRecyclerView(1, 0);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Click on Gallery FrameLayout
		solo.clickInRecyclerView(2, 0);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Click on Slideshow FrameLayout
		solo.clickInRecyclerView(3, 0);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Click on Tools FrameLayout
		solo.clickInRecyclerView(4, 0);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Click on Share FrameLayout
		solo.clickInRecyclerView(7, 0);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Click on Send FrameLayout
		solo.clickInRecyclerView(8, 0);
        //Click on ImageView
		solo.clickOnView(solo.getView(com.example.red.myapplication.R.id.fab));
        //Press menu back key
		solo.goBack();
	}
}
