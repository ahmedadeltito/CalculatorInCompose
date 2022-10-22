package com.plcoding.calculatorprep

import androidx.compose.ui.test.performClick

/**
 * A Robot that interacts with the [CalculatorRobot].
 */
object CalculatorRobot {

    /**
     * Executes actions within the scope of the [CalculatorRobot].
     */
    operator fun invoke(action: CalculatorRobot.() -> Unit) {
        action(CalculatorRobot)
    }

    /**
     * Clicks on any number button.
     */
    fun performClickOnNumberButton(number: Int) {
        CalculatorPage.buttonNumber(number = CalculatorAction.Number(number = number)).performClick()
    }

    /**
     * Clicks on the calculate button.
     */
    fun performClickOnCalculateButton() {
        CalculatorPage.buttonAction(action = CalculatorAction.Calculate).performClick()
    }

    /**
     * Clicks on the operate button like add, multiply, etc.
     */
    fun performClickOnOperationButton(operation: CalculatorOperation) {
        CalculatorPage.buttonOperation(operation = operation).performClick()
    }
}