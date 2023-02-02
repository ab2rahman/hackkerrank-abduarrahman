/**
 * Created by abduarrahman on 02,February,2023
 */

package id.teknografer.hackerranksolutionkotlin.problem_solving

object CompareTheTriplets {
    @JvmStatic
    fun main(args: Array<String>) {

        val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
        
        val result = compareTriplets(a, b)

        println(result.joinToString(" "))
    }

    private fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
        var x = 0
        var y = 0

        for(element in 0 .. a.size) {
            if(a[element]>b[element]) {
                x += 1
            } else if(b[element]>a[element]) {
                y += 1
            }
        }

        return arrayOf(x,y)
    }

}