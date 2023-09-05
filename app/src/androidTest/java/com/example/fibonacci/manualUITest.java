package com.example.fibonacci;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class manualUITest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testEditTextAndTextView() {
        // Ingresar "10" en el EditText
        Espresso.onView(ViewMatchers.withId(R.id.number)).perform(ViewActions.typeText("10"), ViewActions.closeSoftKeyboard());


        Espresso.onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.description)).check(ViewAssertions.matches(ViewMatchers.withText("Resultado: 55")));
    }
}
