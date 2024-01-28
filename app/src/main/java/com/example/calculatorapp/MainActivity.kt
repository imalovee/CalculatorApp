package com.example.calculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculatorapp.ui.theme.CalculatorAppTheme
import com.example.calculatorapp.ui.theme.LightGray
import com.example.calculatorapp.ui.theme.MediumGray
import com.example.calculatorapp.ui.theme.Orange
import com.example.calculatorapp.ui.theme.PurpleGrey40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorAppTheme {
                val viewModel = viewModel<CalculatorViewmodel>()
                val state = viewModel.state
                val buttonSpacing = 6.dp
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(PurpleGrey40)
                        .padding(10.dp)
                ) {
                    Column (modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter),
                        verticalArrangement = Arrangement.spacedBy(buttonSpacing)
                    ){
                        Text(
                            text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
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
                                    viewModel.onAction(CalculatorAction.operation(CalculatorOperation.sqrt))
                                }

                            )


                            CalculatorButton(
                                symbol = "AC",
                                modifier =Modifier
                                    .background(Orange)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel.onAction(CalculatorAction.clear)
                                }

                            )

                            CalculatorButton(
                                symbol = "Del",
                                modifier =Modifier
                                    .background(Orange)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel.onAction(CalculatorAction.decimal)
                                }

                            )

                            CalculatorButton(
                                symbol = "%",
                                modifier =Modifier
                                    .background(Orange)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel.onAction(CalculatorAction.operation(CalculatorOperation.percentage))
                                }

                            )

                            CalculatorButton(
                                symbol = "/",
                                modifier =Modifier
                                    .background(Orange)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel. onAction(CalculatorAction.operation(CalculatorOperation.divide))
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
                                    viewModel. onAction(CalculatorAction.operation(CalculatorOperation.reciprocal))
                                }

                            )

                            CalculatorButton(
                                symbol = "7",
                                modifier =Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel. onAction(CalculatorAction.Number(7))
                                }

                            )
                            CalculatorButton(
                                symbol = "8",
                                modifier =Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel.onAction(CalculatorAction.Number(8))
                                }

                            )

                            CalculatorButton(
                                symbol = "9",
                                modifier =Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel. onAction(CalculatorAction.Number(9))
                                }

                            )

                            CalculatorButton(
                                symbol = "x",
                                modifier =Modifier
                                    .background(Orange)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel.onAction(CalculatorAction.operation(CalculatorOperation.multiply))
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
                                    viewModel. onAction(CalculatorAction.operation(CalculatorOperation.raiseToPower2))
                                }

                            )


                            CalculatorButton(
                                symbol = "4",
                                modifier =Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel. onAction(CalculatorAction.Number(4))
                                }

                            )
                            CalculatorButton(
                                symbol = "5",
                                modifier =Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel. onAction(CalculatorAction.Number(5))
                                }

                            )

                            CalculatorButton(
                                symbol = "6",
                                modifier =Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel. onAction(CalculatorAction.Number(6))
                                }

                            )

                            CalculatorButton(
                                symbol = "-",
                                modifier =Modifier
                                    .background(Orange)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel. onAction(CalculatorAction.operation(CalculatorOperation.subtract))
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
                                    viewModel. onAction(CalculatorAction.operation(CalculatorOperation.Pi))
                                }

                            )

                            CalculatorButton(
                                symbol = "1",
                                modifier =Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel. onAction(CalculatorAction.Number(1))
                                }

                            )
                            CalculatorButton(
                                symbol = "2",
                                modifier =Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel. onAction(CalculatorAction.Number(2))
                                }

                            )

                            CalculatorButton(
                                symbol = "3",
                                modifier =Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel. onAction(CalculatorAction.Number(3))
                                }

                            )

                            CalculatorButton(
                                symbol = "+",
                                modifier =Modifier
                                    .background(Orange)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel.  onAction(CalculatorAction.operation(CalculatorOperation.add))
                                }

                            )
                        }

                        Row(modifier = Modifier
                            .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalculatorButton(
                                symbol = "^",
                                modifier =Modifier
                                    .background(Orange)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel. onAction(CalculatorAction.operation(CalculatorOperation.exponent))
                                }

                            )

                            CalculatorButton(
                                symbol = "e",
                                modifier =Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel. onAction(CalculatorAction.operation(CalculatorOperation.exponential))
                                }

                            )

                            CalculatorButton(
                                symbol = "0",
                                modifier =Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel. onAction(CalculatorAction.Number(0))
                                }

                            )
                            CalculatorButton(
                                symbol = ".",
                                modifier =Modifier
                                    .background(Color.DarkGray)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel.  onAction(CalculatorAction.decimal)
                                }

                            )

                            CalculatorButton(
                                symbol = "=",
                                modifier =Modifier
                                    .background(Orange)
                                    .aspectRatio(1f)
                                    .weight(1f),
                                onClick = {
                                    viewModel. onAction(CalculatorAction.calculate)
                                }

                            )

                        }


                    }
                }

            }
        }
    }
}
