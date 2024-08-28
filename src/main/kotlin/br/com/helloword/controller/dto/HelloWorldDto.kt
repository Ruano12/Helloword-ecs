package br.com.helloword.controller.dto

class HelloWorldDto {

    private var name:String? = null

    constructor(name: String) {
        this.name = name
    }

    fun getName(): String? = this.name
}