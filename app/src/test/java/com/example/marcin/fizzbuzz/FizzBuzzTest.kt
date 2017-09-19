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

    @Test
    fun isReturningBuzzWhenNumberDividedBy5(){
        Assert.assertEquals("Buzz", fizzBuzz.fizzOrBuzz(5))
    }

    @Test
    fun isReturningFizzBuzzWhenNumberDividedBy3And5(){
        Assert.assertEquals("FizzBuzz", fizzBuzz.fizzOrBuzz(15))
    }

    @Test
    fun isReturningFizzFor(){

    }

}

class FizzBuzz {

    fun fizzOrBuzz(number: Int) : String{
        when(number){
            3 -> return "Fizz"
            5 -> return "Buzz"
            15 -> return "FizzBuzz"
        }
        return ""
    }

}
