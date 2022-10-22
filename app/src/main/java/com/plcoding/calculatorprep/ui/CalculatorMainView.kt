package com.plcoding.calculatorprep.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.calculatorprep.CalculatorAction
import com.plcoding.calculatorprep.CalculatorButton
import com.plcoding.calculatorprep.CalculatorOperation
import com.plcoding.calculatorprep.CalculatorViewModel
import com.plcoding.calculatorprep.R
import com.plcoding.calculatorprep.ui.theme.LightGray
import com.plcoding.calculatorprep.ui.theme.MediumGray
import com.plcoding.calculatorprep.ui.theme.Orange

@Composable
fun CalculatorMainView(viewModel: CalculatorViewModel) {
    val state = viewModel.state
    val buttonSpacing = 8.dp
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing),
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 1
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorOperationButton(
                    symbol = stringResource(R.string.clear),
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Clear)
                    }
                )
                CalculatorOperationButton(
                    symbol = stringResource(R.string.delete),
                    color = LightGray,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Delete)
                    }
                )
                CalculatorOperationButton(
                    symbol = stringResource(R.string.divide),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                    }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorNumberButton(
                    symbol = stringResource(R.string.number_seven),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number(7))
                    }
                )
                CalculatorNumberButton(
                    symbol = stringResource(R.string.number_eight),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number(8))
                    }
                )
                CalculatorNumberButton(
                    symbol = stringResource(R.string.number_nine),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number(9))
                    }
                )
                CalculatorOperationButton(
                    symbol = stringResource(R.string.multiply),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                    }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorNumberButton(
                    symbol = stringResource(R.string.number_four),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number(4))
                    }
                )
                CalculatorNumberButton(
                    symbol = stringResource(R.string.number_five),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number(5))
                    }
                )
                CalculatorNumberButton(
                    symbol = stringResource(R.string.number_six),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number(6))
                    }
                )
                CalculatorOperationButton(
                    symbol = stringResource(R.string.subtract),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                    }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorNumberButton(
                    symbol = stringResource(R.string.number_one),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number(1))
                    }
                )
                CalculatorNumberButton(
                    symbol = stringResource(R.string.number_two),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number(2))
                    }
                )
                CalculatorNumberButton(
                    symbol = stringResource(R.string.number_three),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number(3))
                    }
                )
                CalculatorOperationButton(
                    symbol = stringResource(R.string.add),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                    }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorNumberButton(
                    symbol = stringResource(R.string.number_zero),
                    modifier = Modifier
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number(0))
                    }
                )
                CalculatorNumberButton(
                    symbol = stringResource(R.string.decimal),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorOperationButton(
                    symbol = stringResource(R.string.calculate),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Calculate)
                    }
                )
            }
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun CalculatorOperationButton(
    symbol: String,
    color: Color = Orange,
    modifier: Modifier,
    onClick: () -> Unit,
) {
    CalculatorButton(
        symbol = symbol,
        color = color,
        modifier = modifier
    ) {
        onClick.invoke()
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun CalculatorNumberButton(
    symbol: String,
    modifier: Modifier,
    onClick: () -> Unit,
) {
    CalculatorButton(
        symbol = symbol,
        color = MediumGray,
        modifier = modifier
    ) {
        onClick.invoke()
    }
}