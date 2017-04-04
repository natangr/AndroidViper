package io.ckl.androidviper.modules.login

import android.app.Activity

class LoginPresenter(var view: LoginContract.View?): LoginContract.Presenter, LoginContract.InteractorOutput {

    var interactor: LoginContract.Interactor? = LoginInteractor(this)
    var router: LoginContract.Router? = LoginRouter(view as? Activity)

    override fun onLoginClicked(username: String, password: String) {
        interactor?.performLogin(username, password)
    }

    override fun onLoginSucceeded() {
        router?.presentDashboard()
    }

    override fun onLoginFailed(message: String?) {
        val errorMessage = message ?: "Something went wrong."
        view?.showMessage(errorMessage)
    }
}
