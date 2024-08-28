package br.com.helloword.controller.impl

import br.com.helloword.controller.dto.HelloWorldDto
import br.com.helloword.service.HelloWorldService
import org.springframework.http.HttpEntity
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/hello-world")
class HelloWorldControllerImpl(val helloWorldService: HelloWorldService) {

    @GetMapping
    fun findById(): HttpEntity<HelloWorldDto> {
        var hello:HelloWorldDto = helloWorldService.get()
        return ResponseEntity(hello, HttpStatus.OK)
    }
}