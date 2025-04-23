/**
 * @ClassName HelloController
 * @Auth pengxiaohua
 * @Date 2025/4/17
 * @Description: TODO
 */

package com.xiaohua.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello Xiaohuapeng";
    }
}
