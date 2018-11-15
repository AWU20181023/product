package com.gree.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 260152(AWU) on 2018/10/31 7:56.
 */
@RestController
public class ServerController {

    @GetMapping("msg")
    public String msg() {
        return "this is prduction' msg";
    }
}
