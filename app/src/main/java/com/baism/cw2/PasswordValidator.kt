package com.baism.cw2

/** Prosta walidacja siły hasła – logika testowana w unit testach. */
object PasswordValidator {

    const val MIN_LENGTH = 8

    fun isStrong(password: String): Boolean =
        password.length >= MIN_LENGTH &&
            password.any { it.isDigit() } &&
            password.any { it.isUpperCase() } &&
            password.any { it.isLowerCase() }

    fun describe(password: String): String =
        if (isStrong(password)) "Hasło jest silne" else "Hasło jest za słabe"
}
