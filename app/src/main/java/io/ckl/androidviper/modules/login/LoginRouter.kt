package io.ckl.androidviper.modules.login

import android.app.Activity
import android.content.Intent
import io.ckl.androidviper.modules.dashboard.DashboardActivity

class LoginRouter(var activity: Activity?): LoginContract.Router {

    override fun presentDashboard() {
        val intent = Intent(activity, DashboardActivity::class.java)
        activity?.startActivity(intent)
    }
}
