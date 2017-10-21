package com.example.mtavarez.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    protected fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val person = Person("Mary", null, 25)


        var map = mapOf<Int, String>(1 to "Hello", 2 to "Time")

        var set = hashSetOf<Int>(1, 2, 3, 4, 5)
        set.min()
        set.max()


        var regularList = listOf<String>("Beach", "Yesterday", "TY");

        regularList.forEach {
            print(getActivityName(it.length))
        }


        regularList.last()
        regularList.first()
        regularList.binarySearch("")
        regularList.distinct()

        regularList.forEach { it.length }

        var one = ArrayList<String>()
        one.add("Fun")
        one.add("Like")

        var mutableList = mutableListOf<Int>(1, 2, 59, 7)

        mutableList.add(9)
        mutableList.removeAt(2)
        mutableList.remove(7)
        val filteredList = mutableList.filter { it % 2 == 0 }
        print(filteredList.toString())

        var num = 0
        while (num < 10){
            println("Number: " + num)
            num++
        }

        (1 .. 100)
                .filter { it % 2 == 0 }
                .forEach { println("Even Number: " + it) }

    }

    fun getActivityName(length: Int) = {
        when (length) {
            3 -> "Volleyball"
            2 -> "Shopping"
            else -> "Swimming"
        }
    }
}
