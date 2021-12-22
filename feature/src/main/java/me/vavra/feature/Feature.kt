package me.vavra.feature

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import me.vavra.feature.theme.ShowkaseTheme

@Composable
fun FeatureGreeting() {
    Text(text = "Hello from feature module!")
}

@Preview(name = "Feature module greeting", group = "Greetings")
@Composable
fun DefaultPreview() {
    ShowkaseTheme {
        FeatureGreeting()
    }
}