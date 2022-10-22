package com.plcoding.calculatorprep

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.rules.ActivityScenarioRule

/**
 * A Page for the [CalculatorActivity].
 */
@OptIn(ExperimentalComposeUiApi::class)
object CalculatorPage {

    internal lateinit var androidComposeTestRule:
        AndroidComposeTestRule<ActivityScenarioRule<CalculatorActivity>, CalculatorActivity>

    /**
     * Matcher for the view that shows the result of two numbers.
     */
    fun textView(result: String): SemanticsNodeInteraction =
        androidComposeTestRule.onNodeWithText(result)

    /**
     * Matcher for the view with the any number from 0 to 9.
     */
    fun buttonNumber(number: CalculatorAction.Number): SemanticsNodeInteraction =
        when (number.number) {
            1 -> androidComposeTestRule.onNodeWithText(androidComposeTestRule.activity.getString(R.string.number_one))
            2 -> androidComposeTestRule.onNodeWithText(androidComposeTestRule.activity.getString(R.string.number_two))
            3 -> androidComposeTestRule.onNodeWithText(androidComposeTestRule.activity.getString(R.string.number_three))
            4 -> androidComposeTestRule.onNodeWithText(androidComposeTestRule.activity.getString(R.string.number_four))
            5 -> androidComposeTestRule.onNodeWithText(androidComposeTestRule.activity.getString(R.string.number_five))
            6 -> androidComposeTestRule.onNodeWithText(androidComposeTestRule.activity.getString(R.string.number_six))
            7 -> androidComposeTestRule.onNodeWithText(androidComposeTestRule.activity.getString(R.string.number_seven))
            8 -> androidComposeTestRule.onNodeWithText(androidComposeTestRule.activity.getString(R.string.number_eight))
            9 -> androidComposeTestRule.onNodeWithText(androidComposeTestRule.activity.getString(R.string.number_nine))
            0 -> androidComposeTestRule.onNodeWithText(androidComposeTestRule.activity.getString(R.string.number_zero))
            else -> throw java.lang.UnsupportedOperationException("This number is not support!")
        }

    /**
     * Matcher for the view with any operation like add, subtract,multiply and divide.
     */
    fun buttonOperation(operation: CalculatorOperation): SemanticsNodeInteraction =
        when (operation) {
            CalculatorOperation.Add ->
                androidComposeTestRule.onNodeWithText(androidComposeTestRule.activity.getString(R.string.add))
            CalculatorOperation.Divide ->
                androidComposeTestRule.onNodeWithText(androidComposeTestRule.activity.getString(R.string.divide))
            CalculatorOperation.Multiply ->
                androidComposeTestRule.onNodeWithText(androidComposeTestRule.activity.getString(R.string.multiply))
            CalculatorOperation.Subtract ->
                androidComposeTestRule.onNodeWithText(androidComposeTestRule.activity.getString(R.string.subtract))
        }

    /**
     * Matcher for the view with any action like equal, delete and clear.
     */
    fun buttonAction(action: CalculatorAction): SemanticsNodeInteraction =
        when (action) {
            CalculatorAction.Calculate ->
                androidComposeTestRule.onNodeWithText((androidComposeTestRule.activity.getString(R.string.calculate)))
            CalculatorAction.Clear ->
                androidComposeTestRule.onNodeWithText((androidComposeTestRule.activity.getString(R.string.clear)))
            CalculatorAction.Delete ->
                androidComposeTestRule.onNodeWithText((androidComposeTestRule.activity.getString(R.string.delete)))
            else ->
                throw java.lang.UnsupportedOperationException("This action is not support!")
        }
}