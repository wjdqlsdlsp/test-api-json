package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @PostMapping("/test")
    fun testJson(@RequestBody request: String){
        println("Post 방식 테스트 : ${request}")
    }

    @GetMapping("/test")
    fun testJson2(@RequestBody request: String){
        println("Get 방식 테스트 : ${request}")
    }
}