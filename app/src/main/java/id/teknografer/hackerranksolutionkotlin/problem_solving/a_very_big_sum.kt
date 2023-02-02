/**
 * Created by abduarrahman on 02,February,2023
 */

package id.teknografer.hackerranksolutionkotlin.problem_solving

object AVeryBigSum {
    @JvmStatic
    fun main(args: Array<String>) {

        val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

        val result = aVeryBigSum(ar)

        println(result)
    }

    private fun aVeryBigSum(ar: Array<Long>): Long {
        // Write your code here
        var sum:Long = 0
        for (element in ar) {
            sum += element
        }
        return sum
    }
}