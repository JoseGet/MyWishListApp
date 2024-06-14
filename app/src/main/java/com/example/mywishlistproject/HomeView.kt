package com.example.mywishlistproject

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.mywishlistproject.data.DummyWish
import com.example.mywishlistproject.data.Wish

@Composable
fun HomeView(){
    val context = LocalContext.current
    Scaffold (
        topBar = {AppBarView(title = "WishList", {
            Toast.makeText(context, "Button Clicked", Toast.LENGTH_LONG).show()
        })},
        floatingActionButton = {
            androidx.compose.material.FloatingActionButton(
                onClick = {
                    Toast.makeText(context, "Floating Button Clicked", Toast.LENGTH_LONG).show()
                },
                modifier = Modifier.padding(all = 20.dp),
                backgroundColor = Color.Black
            ){
                Icon(imageVector = Icons.Default.Add, contentDescription = null, tint = Color.White)
            }
        }
    ){

        LazyColumn (modifier = Modifier
            .fillMaxSize()
            .padding(it))
        {
            items(DummyWish.wishList){
                wish -> WishItem(wish = wish) {

            }

            }
        }

    }


}

@Composable
fun WishItem(wish: Wish, onClick: () -> Unit){
    androidx.compose.material.Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 8.dp, end = 8.dp)
            .clickable {
                onClick()
            },
        backgroundColor = Color.White,
        elevation = 10.dp
    ){
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = wish.title, fontWeight = FontWeight.ExtraBold)
            Text(text = wish.description)
        }
    }
}
