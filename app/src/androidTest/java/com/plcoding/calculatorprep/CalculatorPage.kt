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
        androidComposeTestRule.onNodeWithText(text = result)

    /**
     * Matcher for the view with the any number from 0 to 9.
     */
    fun buttonNumber(number: CalculatorAction.Number): SemanticsNodeInteraction =
        with(androidComposeTestRule) {
            when (number.number) {
                1 -> onNodeWithText(text = activity.getString(R.string.number_one))
                2 -> onNodeWithText(text = activity.getString(R.string.number_two))
                3 -> onNodeWithText(text = activity.getString(R.string.number_three))
                4 -> onNodeWithText(text = activity.getString(R.string.number_four))
                5 -> onNodeWithText(text = activity.getString(R.string.number_five))
                6 -> onNodeWithText(text = activity.getString(R.string.number_six))
                7 -> onNodeWithText(text = activity.getString(R.string.number_seven))
                8 -> onNodeWithText(text = activity.getString(R.string.number_eight))
                9 -> onNodeWithText(text = activity.getString(R.string.number_nine))
                0 -> onNodeWithText(text = activity.getString(R.string.number_zero))
                else -> throw java.lang.UnsupportedOperationException("This number is not support!")
            }
        }

    /**
     * Matcher for the view with any operation like add, subtract,multiply and divide.
     */
    fun buttonOperation(operation: CalculatorOperation): SemanticsNodeInteraction =
        with(androidComposeTestRule) {
            when (operation) {
                CalculatorOperation.Add -> onNodeWithText(text = activity.getString(R.string.add))
                CalculatorOperation.Divide -> onNodeWithText(text = activity.getString(R.string.divide))
                CalculatorOperation.Multiply -> onNodeWithText(text = activity.getString(R.string.multiply))
                CalculatorOperation.Subtract -> onNodeWithText(text = activity.getString(R.string.subtract))
            }
        }

    /**
     * Matcher for the view with any action like equal, delete and clear.
     */
    fun buttonAction(action: CalculatorAction): SemanticsNodeInteraction =
        with(androidComposeTestRule) {
            when (action) {
                CalculatorAction.Calculate -> onNodeWithText(text = (activity.getString(R.string.calculate)))
                CalculatorAction.Clear -> onNodeWithText(text = (activity.getString(R.string.clear)))
                CalculatorAction.Delete -> onNodeWithText(text = (activity.getString(R.string.delete)))
                else ->
                    throw java.lang.UnsupportedOperationException("This action is not support!")
            }
        }
}