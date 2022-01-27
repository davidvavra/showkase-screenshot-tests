package me.vavra.screenshots

import android.graphics.Bitmap
import android.widget.ImageView
import androidx.test.platform.app.InstrumentationRegistry
import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_5
import app.cash.paparazzi.Paparazzi
import com.airbnb.android.showkase.annotation.ShowkaseScreenshot
import com.airbnb.android.showkase.screenshot.testing.ShowkaseScreenshotTest
import com.airbnb.android.showkase.screenshot.testing.ShowkaseScreenshotType
import org.junit.Rule

@ShowkaseScreenshot(rootShowkaseClass = ShowkaseRoot::class)
abstract class ComposePaparazziTests : ShowkaseScreenshotTest {

    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = PIXEL_5
    )

    override fun onScreenshot(
        id: String,
        name: String,
        group: String,
        styleName: String?,
        screenshotType: ShowkaseScreenshotType,
        screenshotBitmap: Bitmap
    ) {
        val view = ImageView(paparazzi.context)
        view.setImageBitmap(screenshotBitmap)
        paparazzi.snapshot(view, name)
    }
}