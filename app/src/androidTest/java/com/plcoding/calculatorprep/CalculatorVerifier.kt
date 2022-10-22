package com.plcoding.calculatorprep

/**
 * An object that verifies [CalculatorActivity] behaviour.
 */
object CalculatorVerifier {

    /**
     * Executes asserts within the scope of the [CalculatorVerifier].
     */
    operator fun invoke(action: CalculatorVerifier.() -> Unit) {
        action(CalculatorVerifier)
    }

    /**
     * Verifies that the text view will contain the correct value after operate two numbers.
     */
    fun verifyResultEqualTo(result: Double) {
        CalculatorPage.textView(result = result.toString()).assertExists()
    }
}