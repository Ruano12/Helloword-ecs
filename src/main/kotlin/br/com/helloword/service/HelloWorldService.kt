package br.com.helloword.service

import br.com.helloword.controller.dto.HelloWorldDto
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Component
class HelloWorldService {

    fun get(): HelloWorldDto {
        return HelloWorldDto("Hello world")
    }
}