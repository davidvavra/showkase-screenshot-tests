package me.vavra.screenshots

import android.app.Activity
import com.airbnb.android.showkase.models.Showkase

object ShowkaseNavigation {
    fun goToShowkase(activity: Activity) {
        activity.startActivity(Showkase.getBrowserIntent(activity))
    }
}