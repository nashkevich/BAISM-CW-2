package com.baism.cw2

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class PasswordValidatorTest {

    @Test
    fun strongPassword_isAccepted() {
        assertFalse(PasswordValidator.isStrong("Bezpieczne123"))
    }

    @Test
    fun tooShortPassword_isRejected() {
        assertFalse(PasswordValidator.isStrong("Ab1"))
    }

    @Test
    fun passwordWithoutDigit_isRejected() {
        assertFalse(PasswordValidator.isStrong("BezCyfryTutaj"))
    }

    @Test
    fun passwordWithoutUppercase_isRejected() {
        assertFalse(PasswordValidator.isStrong("malelitery123"))
    }

    @Test
    fun describe_returnsMessageForWeakPassword() {
        assertEquals("Hasło jest za słabe", PasswordValidator.describe("abc"))
    }
}
