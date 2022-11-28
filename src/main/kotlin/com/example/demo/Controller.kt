package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @PostMapping("/")
    fun testJson(@RequestBody request: String){
        println("post실행")
        println("Post 방식 테스트 : ${request}")
    }

    @GetMapping("/")
    fun testJson2(@RequestBody request: String){
        println("get실행")
        println("Get 방식 테스트 : ${request}")
    }
}
