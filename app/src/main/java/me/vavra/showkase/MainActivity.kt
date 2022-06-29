package me.vavra.showkase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import me.vavra.feature.FeatureGreeting
import me.vavra.feature.theme.ShowkaseTheme
import me.vavra.screenshots.ShowkaseNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowkaseTheme {
                Surface(
                    color = MaterialTheme.colors.background,
                ) {
                    Column(
                        modifier = Modifier.padding(24.dp)
                    ) {
                        FeatureGreeting()
                        Spacer(modifier = Modifier.height(24.dp))
                        Button(onClick = { ShowkaseNavigation.goToShowkase(this@MainActivity) }) {
                            Text("Showkase browser")
                        }
                    }
                }
            }
        }
    }
}