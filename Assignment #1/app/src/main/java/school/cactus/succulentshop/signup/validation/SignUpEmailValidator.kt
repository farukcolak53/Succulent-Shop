package school.cactus.succulentshop.signup.validation

import school.cactus.succulentshop.R
import school.cactus.succulentshop.validation.Validator

class SignUpEmailValidator: Validator {
    override fun validate(field: String) = when {
        field.isEmpty() -> R.string.signup_email_error
        !(field.contains('.') and field.contains('@'))  -> R.string.signup_invalid_email_error
        field.length <= 5 -> R.string.signup_invalid_email_error
        field.length >= 50 -> R.string.signup_invalid_email_error
        else -> null
    }
}