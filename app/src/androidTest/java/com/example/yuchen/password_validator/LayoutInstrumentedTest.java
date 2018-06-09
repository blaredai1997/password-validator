package com.example.yuchen.password_validator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.action.ViewActions.click;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class LayoutInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> menuActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    /* Espresso test cases of stage 3
     * Android Instrumented Test
     */
    @Test
    public void testStage3_Case1() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.yuchen.password_validator", appContext.getPackageName());
    }

    @Test
    public void testStage3_Case2() {
        onView(withId(R.id.editText));
    }

    @Test
    public void testStage3_Case3() {
        onView(withId(R.id.button));
    }

    @Test
    public void testStage3_Case4() {
        onView(withId(R.id.textView));
    }

    @Test
    public void testStage3_Case5() {
        onView(withId(R.id.button)).perform(click());
    }

    @Test
    public void testStage3_Case6() {
        onView(withId(R.id.textView)).check(matches(isDisplayed()));
    }

    @Test
    public void testStage3_Case7() {
        onView(withId(R.id.editText)).check(matches(isDisplayed()));
    }
}