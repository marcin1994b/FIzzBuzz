package com.example.marcin.fizzbuzz


import junit.framework.Assert
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
    fun isReturningFizzWhenNumberDivideBy3(){
        Assert.assertEquals("Fizz", fizzBuzz.fizzOrBuzz(3))
    }

}

class FizzBuzz {

    fun fizzOrBuzz(number: Int) : String{
        return "Fizz"
    }

}
