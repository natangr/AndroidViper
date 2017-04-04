package io.ckl.androidviper.modules.login

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import io.ckl.androidviper.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity(), LoginContract.View {

    var presenter: LoginContract.Presenter? = LoginPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginButton.setOnClickListener { presenter?.onLoginClicked(usernameEditText.text.toString(), passwordEditText.text.toString()) }
    }

    override fun showMessage(message: String) {
        AlertDialog.Builder(this)
                .setTitle("Yo")
                .setMessage(message)
                .setNeutralButton("Ok") { dialog, _ -> dialog?.dismiss() }
                .show()
    }
}
