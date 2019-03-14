package com.springtest.HelloWorld

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorld {
    @GetMapping("/")
      fun blog(model: Model): String {
       return "Hello World!!!"
      }
}
