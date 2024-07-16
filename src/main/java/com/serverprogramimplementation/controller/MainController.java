package com.serverprogramimplementation.controller;


import com.serverprogramimplementation.service.StoreService;
import org.apache.catalina.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

     @Controller
    @RequestMapping("/user_api")
     public class MainController {

        @GetMapping("/user")
        private String get_user_api() {
            return "user";
        }

        @GetMapping("/login")
        private String get_login_api() {
            return "login";
        }
    }


