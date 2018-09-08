package com.horie1024.android_testing_circleci_sample_sample

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class InputCheckerTest {

    lateinit var target: InputChecker

    @Before
    fun setUp() {
        target = InputChecker()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun isValid_givenLessThan3_returnsFalse() {
        val actual = target.isValid("ab")
        assertThat(actual, `is`(false))
    }

    @Test
    fun isValid_givenAlphabetic_returnsTrue() {
        val actual = target.isValid("abc")
        assertThat(actual, `is`(true))
    }

    @Test
    fun isValid_givenNumeric_returnsTrue() {
        val actual = target.isValid("123")
        assertThat(actual, `is`(true))
    }

    @Test
    fun isValid_givenAlphaNumeric_returnsTrue() {
        val actual = target.isValid("abc123")
        assertThat(actual, `is`(true))
    }

    @Test
    fun isValid_givenInvalidCharacter_returnsFalse() {
        val actual = target.isValid("abc@123")
        assertThat(actual, `is`(false))
    }
}