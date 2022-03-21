package me.vavra.showkase

import android.graphics.Bitmap
import com.airbnb.android.showkase.annotation.ShowkaseScreenshot
import com.airbnb.android.showkase.screenshot.testing.ShowkaseScreenshotTest
import com.airbnb.android.showkase.screenshot.testing.ShowkaseScreenshotType
import com.karumi.shot.ScreenshotTest

@ShowkaseScreenshot(rootShowkaseClass = ShowkaseRoot::class)
abstract class ComposeTests : ShowkaseScreenshotTest, ScreenshotTest {

    override fun onScreenshot(
        id: String,
        name: String,
        group: String,
        styleName: String?,
        screenshotType: ShowkaseScreenshotType,
        screenshotBitmap: Bitmap
    ) {
        compareScreenshot(screenshotBitmap, "$group - $name")
    }
}