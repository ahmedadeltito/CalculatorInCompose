package com.plcoding.calculatorprep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.lifecycle.viewmodel.compose.viewModel
import com.plcoding.calculatorprep.ui.CalculatorMainView
import com.plcoding.calculatorprep.ui.theme.CalculatorPrepTheme

@ExperimentalComposeUiApi
class CalculatorActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorPrepTheme {
                val viewModel = viewModel<CalculatorViewModel>()
                CalculatorMainView(viewModel = viewModel)
            }
        }
    }
}