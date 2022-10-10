package com.example.testing

import java.lang.NumberFormatException

class Math {

    fun add(a:String,b:String): String{
        var result :String
        if (a.contains("-") || b.contains("-")) {
            result = "Нельзя закидывать отрицательное"
        } else if (a.isEmpty() || b.isEmpty()) {
            result = "Вы не заполнили поля"
        } else if (a.contains(".") || b.contains(".")) {
            result = (a.toFloat() + b.toFloat()).toString()
        } else if (a.contains(Regex("[a-z]"))||b.contains(Regex("[a-z]"))) {
            result = "Буквы не складываются"
        } else {
            result = (a.trim().toInt() + b.trim().toInt()).toString()
        }
        return result
        /*if(a.isEmpty()||b.isEmpty()){
            result="Вы не заполнили поля"
        } else if (a.contains(Regex("[a-z]"))||b.contains(Regex("[a-z]"))) {
            result = "Символ вводить нельзя"
        }else if(a.toInt()<0 || b.toInt()<0){
            result="Нельзя закидывать отрицательное"
        }else if(a.contains(".")||b.contains(".")){
            result=(a.toFloat()+b.toFloat()).toString()
        } else{
            val num1=a.toInt()
            val num2=b.toInt()
            result = (num1+num2).toString()
        }
        return result*/
    }
    fun divide(num1: String, num2: String): String {
        val result:String
        if (num2 == "0") {
            result = "Делить на ноль нельзя"
        } else {
            result = (num1.trim().toInt() / num2.trim().toInt()).toString()
        }
        return result
    }

    fun String.tryParseInt():Boolean{
        return try {
            this.toInt()
            true
        }catch (e:NumberFormatException){
            false
        }

    }
}