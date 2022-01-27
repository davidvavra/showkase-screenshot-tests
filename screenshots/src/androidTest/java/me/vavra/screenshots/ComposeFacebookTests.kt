package me.vavra.screenshots

import android.graphics.Bitmap
import android.widget.ImageView
import androidx.test.platform.app.InstrumentationRegistry
import com.airbnb.android.showkase.annotation.ShowkaseScreenshot
import com.airbnb.android.showkase.screenshot.testing.ShowkaseScreenshotTest
import com.airbnb.android.showkase.screenshot.testing.ShowkaseScreenshotType
import com.facebook.testing.screenshot.Screenshot
import com.facebook.testing.screenshot.ViewHelpers

@ShowkaseScreenshot(rootShowkaseClass = ShowkaseRoot::class)
abstract class ComposeFacebookTests : ShowkaseScreenshotTest {

    override fun onScreenshot(
        id: String,
        name: String,
        group: String,
        styleName: String?,
        screenshotType: ShowkaseScreenshotType,
        screenshotBitmap: Bitmap
    ) {
        val view = ImageView(InstrumentationRegistry.getInstrumentation().context)
        view.setImageBitmap(screenshotBitmap)
        ViewHelpers.setupView(view).setExactWidthPx(screenshotBitmap.width).setExactHeightPx(screenshotBitmap.height).layout()
        Screenshot.snap(view).setName("$group - $name").record()
    }
}