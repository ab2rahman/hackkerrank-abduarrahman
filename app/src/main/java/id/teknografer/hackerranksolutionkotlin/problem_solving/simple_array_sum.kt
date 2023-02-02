/**
 * Created by abduarrahman on 01,February,2023
 */

package id.teknografer.hackerranksolutionkotlin.problem_solving

object SimpleArraySum {
    @JvmStatic
    fun main(args: Array<String>) {

        val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

        val result = simpleArraySum(ar)

        println(result)
    }

    private fun simpleArraySum(ar: Array<Int>): Int {
        // Write your code here
        return ar.sum()
    }
}
