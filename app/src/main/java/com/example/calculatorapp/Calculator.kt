package com.example.calculatorapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorapp.ui.theme.LightGray
import com.example.calculatorapp.ui.theme.Orange

@Composable
fun Calculator(
    buttonSpacing : Dp = 6.dp,
    state : CalculatorState,
    modifier: Modifier = Modifier,
    onAction: (CalculatorAction) -> Unit
){
    Box(modifier = Modifier) {
        Column (modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ){
            Text(
                text = state.number1 + (state.operation ?:"") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )

            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "√",
                    modifier =Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.operation(CalculatorOperation.sqrt))
                    }

                )


                CalculatorButton(
                    symbol = "AC",
                    modifier =Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.clear)
                    }

                )

                CalculatorButton(
                    symbol = "Del",
                    modifier =Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.decimal)
                    }

                )

                CalculatorButton(
                    symbol = "%",
                    modifier =Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.operation(CalculatorOperation.percentage))
                    }

                )

                CalculatorButton(
                    symbol = "/",
                    modifier =Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.operation(CalculatorOperation.divide))
                    }

                )
            }

            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {

                CalculatorButton(
                    symbol = "1/x",
                    modifier =Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.operation(CalculatorOperation.reciprocal))
                    }

                )

                CalculatorButton(
                    symbol = "7",
                    modifier =Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(7))
                    }

                )
                CalculatorButton(
                    symbol = "8",
                    modifier =Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(8))
                    }

                )

                CalculatorButton(
                    symbol = "9",
                    modifier =Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(9))
                    }

                )

                CalculatorButton(
                    symbol = "x",
                    modifier =Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.operation(CalculatorOperation.multiply))
                    }

                )
            }

            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "^2",
                    modifier =Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.operation(CalculatorOperation.raiseToPower2))
                    }

                )


                CalculatorButton(
                    symbol = "4",
                    modifier =Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(4))
                    }

                )
                CalculatorButton(
                    symbol = "5",
                    modifier =Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(5))
                    }

                )

                CalculatorButton(
                    symbol = "6",
                    modifier =Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(6))
                    }

                )

                CalculatorButton(
                    symbol = "-",
                    modifier =Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.operation(CalculatorOperation.subtract))
                    }

                )
            }

            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {

                CalculatorButton(
                    symbol = "π",
                    modifier =Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.operation(CalculatorOperation.Pi))
                    }

                )

                CalculatorButton(
                    symbol = "1",
                    modifier =Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(1))
                    }

                )
                CalculatorButton(
                    symbol = "2",
                    modifier =Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(2))
                    }

                )

                CalculatorButton(
                    symbol = "3",
                    modifier =Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(3))
                    }

                )

                CalculatorButton(
                    symbol = "+",
                    modifier =Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.operation(CalculatorOperation.add))
                    }

                )
            }

            Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "e",
                    modifier =Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.operation(CalculatorOperation.exponential))
                    }

                )

                CalculatorButton(
                    symbol = "0",
                    modifier =Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.Number(0))
                    }

                )
                CalculatorButton(
                    symbol = ".",
                    modifier =Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.decimal)
                    }

                )

                CalculatorButton(
                    symbol = "=",
                    modifier =Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorAction.calculate)
                    }

                )

            }


        }


    }
}

























