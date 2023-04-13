package com.metatest.grid

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text


@Composable
fun Gridcel() { // début fonction Gridcel

    Card( // début head de Card
        elevation = 16.dp, // pas oublier virgule
        modifier = Modifier.padding(8.dp)

    ) // fin head de Card

    { // début body Card

        Box ( // start of Box, head, arguments
            modifier = Modifier
                .requiredSize(180.dp, 180.dp)
                .padding(8.dp)
          ) // end of Box
        { // body of Box
            Image(
                painter = painterResource(R.drawable.greeksalad),
                contentDescription = "Greek Salad"

            )

            Text( // début head de Text
                text ="Greek Salad",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.fillMaxWidth() // mettre une fonction en tant qu'argument car cette fonction a un return
                    .padding(4.dp).background(Color.White).align(Alignment.TopStart)   // alignment.TopStart // aligne le texte en haut à gauche

                ) // fin de head de Text

            Text( // début head de Text


                text = "$12.99",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.background(Color.White).padding(
                    start = 4.dp, end = 4.dp
                ).align(Alignment.BottomEnd)   // alignment.Bottom End // aligne le texte en bas à droite




                 ) // fin de head de Text



        }


    }     // fin body Card

} // fin fonction Gridcel