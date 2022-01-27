package me.vavra.screenshots

import android.widget.TextView
import androidx.test.platform.app.InstrumentationRegistry
import com.facebook.testing.screenshot.Screenshot
import com.facebook.testing.screenshot.ViewHelpers
import org.junit.Test

class ViewFacebookTests {

    @Test
    fun doScreenshot() {
        val view = TextView(InstrumentationRegistry.getInstrumentation().context)
        view.text = "Hello from XML!"

        ViewHelpers.setupView(view)
            .setExactWidthDp(300)
            .layout()
        Screenshot.snap(view).record()
    }
}