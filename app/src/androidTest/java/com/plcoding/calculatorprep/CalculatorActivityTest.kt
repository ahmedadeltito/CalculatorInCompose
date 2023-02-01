package com.plcoding.calculatorprep

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@OptIn(ExperimentalComposeUiApi::class)
@RunWith(AndroidJUnit4::class)
class CalculatorActivityTest {

    @get:Rule
    val androidComposeTestRule = createAndroidComposeRule<CalculatorActivity>()
    // use createAndroidComposeRule<YourActivity>() if you need access to an activity

    @Before
    fun setup() {
        // androidComposeTestRule.setContent {
        //     CalculatorMainView(viewModel = viewModel)
        // }
        CalculatorPage.androidComposeTestRule = androidComposeTestRule
    }

    // Test Case :
    // Given 1 + 2
    // When the calculator is open
    // Then 3 will be shown
    @Test
    fun givenOneAndTwo_whenOperationIsAdding_thenTheResultIsThree_robotDesignPattern() {
        CalculatorRobot {
            performClickOnNumberButton(number = 1)
            performClickOnOperationButton(operation = CalculatorOperation.Add)
            performClickOnNumberButton(number = 2)
            performClickOnCalculateButton()
            performClickOnOperationButton(operation = CalculatorOperation.Subtract)
            performClickOnNumberButton(number = 1)
            performClickOnCalculateButton()
        }
        CalculatorVerifier {
            verifyResultEqualTo(result = 2.0)
        }
    }
}