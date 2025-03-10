package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        tailrec fun fibHelper(a: Int, b: Int, count: Int): Int {
            return if (count == 0) a
            else fibHelper(b, a + b, count - 1)
        }
        return fibHelper(0, 1, n)
    }
}