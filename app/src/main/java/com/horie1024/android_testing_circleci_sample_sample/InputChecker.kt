package com.horie1024.android_testing_circleci_sample_sample

class InputChecker {
    fun isValid(text: String?): Boolean {
        if (text == null) return false                                 // …(1)
        return text.length >= 3 && text.matches(Regex("[a-zA-Z0-9]+")) // …(2)
    }
}