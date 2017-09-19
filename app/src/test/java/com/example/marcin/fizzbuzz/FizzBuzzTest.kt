package com.example.marcin.fizzbuzz

import org.junit.Before
import org.junit.Test

/**
 * Created by Marcin on 19.09.2017.
 */
class FizzBuzzTest {

    lateinit var fizzBuzz : FizzBuzz


    @Before
    fun setUp(){
        fizzBuzz = FizzBuzz()
    }

    @Test
    fun haveMethodsGetNumber(){
        fizzBuzz.getNumber()
    }

    @Test
    fun haveMethodsFizzOrBuzz(){
        val str = fizzBuzz.fizzOrBuzz(fizzBuzz.getNumber())
    }

}

class FizzBuzz {

    fun getNumber() : Int {
        return 0
    }

    fun fizzOrBuzz(number: Int) : String{
        return ""
    }

}
