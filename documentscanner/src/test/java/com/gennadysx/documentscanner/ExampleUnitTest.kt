package com.gennadysx.documentscanner

import com.gennadysx.documentscanner.constants.ResponseType
import org.junit.Test

import org.junit.Assert.*

/**
 * Unit test to make sure ResponseType constants are the right value
 */
class ResponseTypeUnitTest {
    @Test
    fun constantValue_isCorrect() {
        assertEquals(ResponseType.BASE64, "base64")
    }
}