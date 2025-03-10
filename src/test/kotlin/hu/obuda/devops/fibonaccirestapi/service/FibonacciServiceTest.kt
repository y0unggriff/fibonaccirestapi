package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall0() {
        // given

        // when
        val result: Int = underTest.fibonacci(0)
        // then
        Assertions.assertEquals(0, result)
    }

    @Test
    fun shouldReturn1WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn1WhenCall2() {
        // given

        // when
        val result: Int = underTest.fibonacci(2)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn2WhenCall3() {
        // given

        // when
        val result: Int = underTest.fibonacci(3)
        // then
        Assertions.assertEquals(2, result)
    }
}