/**
 * Created by abduarrahman on 01,February,2023
 */

package id.teknografer.hackerranksolutionkotlin.problem_solving

import java.util.*

object SolveMeFirst {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        val num1 = sc.nextInt()
        val num2 = sc.nextInt()
        val sum = solveMeFirst(num1, num2)
        println(sum)
    }

    private fun solveMeFirst(a: Int, b: Int): Int {
        return (a + b)
    }
}

