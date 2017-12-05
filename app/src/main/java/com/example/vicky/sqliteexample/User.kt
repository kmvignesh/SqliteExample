package com.example.vicky.sqliteexample

/**
 * Created by VickY on 2017-11-28.
 */

class User{

    var id : Int = 0
    var name : String = ""
    var age : Int = 0

    constructor(name:String,age:Int){
        this.name = name
        this.age = age
    }

    constructor(){
    }

}