package com.example.formulasforphysics

import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.*
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class Test7ClassFormulas {
  @get:Rule
  val activityRule = ActivityScenarioRule(MainActivity::class.java)

  @Test
  fun open7Formulas() {
    onView(
      withId(R.id.seven_class)
    ).perform(click())
    onView(
      withId(R.id.formula_7_class)
    ).perform(click())
  }

  @Test
  fun list7Formulas() {
    onView(
      withId(R.id.seven_class)
    ).perform(click())
    onView(
      withId(R.id.formula_7_class)
    ).perform(click())
    onData(anything()).inAdapterView(
      withId(R.id.recycler_view7_formulas)
    ).atPosition(12).perform(scrollTo())
  }
}