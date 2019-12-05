package com.example.smartparking;

import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class LogInTest {

    @Rule
    public ActivityTestRule<LogIn> logInActivityTestRule = new ActivityTestRule<LogIn>(LogIn.class);
    public String username = "abc";
    public String password = "abc";

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testUserInputScenario(){

        Espresso.onView(withId(R.id.username)).perform(typeText(username)); //input username in the username edit text
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.password)).perform(typeText(password));   //input password
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.button)).perform(click());  //perform login button click
    }

    @After
    public void tearDown() throws Exception {
    }
}
