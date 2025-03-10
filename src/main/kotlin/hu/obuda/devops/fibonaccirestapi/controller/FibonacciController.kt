package hu.obuda.devops.fibonaccirestapi.controller

import hu.obuda.devops.fibonaccirestapi.service.FibonacciService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class FibonacciController @Autowired constructor(private val fibonacciService: FibonacciService) {

    @GetMapping("/fibonacci")
    fun fibonacci(@RequestParam n: Int): Int? {
        // Check if n is greater than 46
        if (n > 46) {
            return null // Return null for invalid input
        }

        // Calculate and return the Fibonacci number
        return fibonacciService.fibonacci(n)
    }
}