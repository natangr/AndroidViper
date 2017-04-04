package io.ckl.androidviper.modules.login

class LoginInteractor(var output: LoginContract.InteractorOutput?): LoginContract.Interactor {

    override fun performLogin(username: String, password: String) {
        // Here is where you should handle the API event. You could use an ApiDataManager helper to create the request. This way you keep all the API code centralized.
        if (username == "natan" && password == "good") {
            output?.onLoginSucceeded()
        } else {
            output?.onLoginFailed("Wrong credentials.")
        }
    }
}
