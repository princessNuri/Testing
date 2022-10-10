package com.example.testing

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math:Math?=null
    var devide:Math?=null

    @Before
    fun install(){
        math= Math()
    }

    @Test
    fun simpleAddCase(){
        assertEquals("4",math?.add("2","2"))
    }
    @Test
    fun emptyAddCase(){
        assertEquals("Вы не заполнили поля",math?.add("2",""))
    }
    @Test
    fun letterAddCase(){
        assertEquals("Буквы не складываются",math?.add("2","2sdfg"))
    }
    @Test
    fun dotAddCase(){
        assertEquals("4.0",math?.add("2.0","2.0"))
    }
    @Test
    fun negativeAddCase(){
        assertEquals("Нельзя закидывать отрицательное",math?.add("2","-2"))
    }
    @Test
    fun simpleDivide(){
        assertEquals("3",math?.divide("6","2"))
    }
    @Test
    fun divideOnZero(){
        assertEquals("Делить на ноль нельзя",math?.divide("6","0"))
    }

    @After
    fun detach(){
        math= null
    }
}