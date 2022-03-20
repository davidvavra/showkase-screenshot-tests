package me.vavra.showkase

import android.widget.TextView
import androidx.test.platform.app.InstrumentationRegistry
import com.karumi.shot.ScreenshotTest
import org.junit.Test

class ViewTests : ScreenshotTest {

    @Test
    fun doScreenshot() {
        val view = TextView(InstrumentationRegistry.getInstrumentation().context)
        view.text = "Hello from XML!"

        compareScreenshot(view, widthInPx = 300)
    }
}