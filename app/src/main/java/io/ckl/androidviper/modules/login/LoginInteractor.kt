package io.ckl.androidviper.modules.login

class LoginInteractor(var output: LoginContract.InteractorOutput?): LoginContract.Interactor {

    override fun performLogin(username: String, password: String) {
        if (username == "natan" && password == "good") {
            output?.onLoginSucceeded()
        } else {
            output?.onLoginFailed("Wrong credentials.")
        }
    }
}
