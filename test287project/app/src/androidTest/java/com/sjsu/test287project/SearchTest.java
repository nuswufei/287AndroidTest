package com.sjsu.test287project;

/**
 * Created by WU on 1/5/2015.
 *
 *This is for testing Booking app. Initially should be in search activity of Booking andorid app.
 */

import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.test.InstrumentationTestCase;

import org.junit.Before;
import org.junit.Test;

public class SearchTest extends InstrumentationTestCase {
    private UiDevice mDevice;

    @Before
    public void setUp() {
        // Initialize UiDevice instance
        mDevice = UiDevice.getInstance(getInstrumentation());
    }

    @Test
    public void test_APP_GO_AD_T1_Search_Empty_newActivity() throws UiObjectNotFoundException {

        //input search keyword
        UiObject content = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_search"));
        content.clearTextField();
        content.setText("");
        mDevice.waitForIdle(2000);
        //assert result
        UiObject firstItem = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_list_name"));
        assertTrue(firstItem.exists());
    }

    @Test
    public void test_APP_GO_AD_T2_Search_Symbol() throws UiObjectNotFoundException {
        //input search keyword
        UiObject content = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_search"));
        content.clearTextField();
        content.setText("#$%@#!@");
        mDevice.waitForIdle(2000);
        //assert result
        UiObject noResult = mDevice.findObject(new UiSelector().resourceId("com.booking:id/no_result_message"));
        assertTrue(noResult.exists());
    }

    @Test
    public void test_APP_GO_AD_T3_Search_InvalidNumber() throws UiObjectNotFoundException {
        //input search keyword
        UiObject content = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_search"));
        content.clearTextField();
        content.setText("47474447");
        mDevice.waitForIdle(2000);
        //assert result
        UiObject noResult = mDevice.findObject(new UiSelector().resourceId("com.booking:id/no_result_message"));
        assertTrue(noResult.exists());
    }

    @Test
    public void test_APP_GO_AD_T5_Search_InvalidLetters() throws UiObjectNotFoundException {
        //input search keyword
        UiObject content = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_search"));
        content.clearTextField();
        content.setText("aaaaaaa");
        mDevice.waitForIdle(2000);
        //assert result
        UiObject noResult = mDevice.findObject(new UiSelector().resourceId("com.booking:id/no_result_message"));
        assertTrue(noResult.exists());
    }

    @Test
    public void test_APP_GO_AD_T6_Search_InvalidSymbolNumber() throws UiObjectNotFoundException {
        //input search keyword
        UiObject content = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_search"));
        content.clearTextField();
        content.setText("%^#99365");
        mDevice.waitForIdle(2000);
        //assert result
        UiObject noResult = mDevice.findObject(new UiSelector().resourceId("com.booking:id/no_result_message"));
        assertTrue(noResult.exists());
    }

    @Test
    public void test_APP_GO_AD_T7_Search_SymbolLetter() throws UiObjectNotFoundException {
        //input search keyword
        UiObject content = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_search"));
        content.clearTextField();
        content.setText("~@yk");
        mDevice.waitForIdle(2000);
        //assert result
        UiObject firstItem = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_list_name"));
        assertTrue(firstItem.exists());
    }

    @Test
    public void test_APP_GO_AD_T8_Search_NumberSymbolLetter() throws UiObjectNotFoundException {
        //input search keyword
        UiObject content = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_search"));
        content.clearTextField();
        content.setText("a~@9");
        mDevice.waitForIdle(2000);
        //assert result
        UiObject firstItem = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_list_name"));
        assertTrue(firstItem.exists());
    }

    @Test
    public void test_APP_GO_AD_T9_Search_City() throws UiObjectNotFoundException {
        //input search keyword
        UiObject content = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_search"));
        content.clearTextField();
        content.setText("campbell");
        mDevice.waitForIdle(2000);
        //assert result
        UiObject firstItem = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_list_name"));
        assertTrue(firstItem.exists());
    }

    @Test
    public void test_APP_GO_AD_T10_Search_State() throws UiObjectNotFoundException {
        //input search keyword
        UiObject content = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_search"));
        content.clearTextField();
        content.setText("Nevada");
        mDevice.waitForIdle(2000);
        //assert result
        UiObject firstItem = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_list_name"));
        assertTrue(firstItem.exists());
    }

    @Test
    public void test_APP_GO_AD_T11_Search_Country() throws UiObjectNotFoundException {
        //input search keyword
        UiObject content = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_search"));
        content.clearTextField();
        content.setText("Thailand");
        mDevice.waitForIdle(2000);
        //assert result
        UiObject firstItem = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_list_name"));
        assertTrue(firstItem.exists());
    }
    @Test
    public void test_APP_GO_AD_T12_Search_Regioin() throws UiObjectNotFoundException {
        //input search keyword
        UiObject content = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_search"));
        content.clearTextField();
        content.setText("Death Valley");
        mDevice.waitForIdle(2000);
        //assert result
        UiObject firstItem = mDevice.findObject(new UiSelector().resourceId("com.booking:id/disam_list_name"));
        assertTrue(firstItem.exists());
    }

}
