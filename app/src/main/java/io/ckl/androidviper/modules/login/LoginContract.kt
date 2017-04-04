package io.ckl.androidviper.modules.login

interface LoginContract {

    interface View {
        fun showMessage(message: String)
    }

    interface Presenter {
        fun onLoginClicked(username: String, password: String)
    }

    interface Interactor {
        fun performLogin(username: String, password: String)
    }

    interface InteractorOutput {
        fun onLoginSucceeded()
        fun onLoginFailed(message: String?)
    }

    interface Router {
        fun presentDashboard()
    }
}
