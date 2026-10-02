// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    val num1=args[0].toDouble()
    val num2=args[1].toDouble()
    val num3=args[2].toDouble()

    val s=(num1+num2+num3)/2
    val A=sqrt(s*(s-num1)*(s-num2)*(s-num3)
    println("Area = " + "%.5f".format(A))
}