package com.example.localtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: yuyuanyuanb
 * @description:
 * @data: 2021/11/26 13:53
 **/
@Controller
@RequestMapping("localTest")
public class LocalTestController {

    @GetMapping("localTestMethod")
    public void test() {
        for (int i = 1; i <= 9; i++) {//行
            for (int j = 1; j <= i; j++) {//列
                System.out.print(j + "*" + i + "=" + i * j + "\t");//乘法表的格式
            }
            System.out.println();//输出换行
        }

    }
}
