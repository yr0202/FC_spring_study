package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
    int iv = 10;
    static int cv = 20;

    @RequestMapping("/hello")
    private void main() {
        System.out.println("Hello World yuram");
        System.out.println("private hello world");
        System.out.println(iv);
        System.out.println(cv);
    }
    public static void main2(){
        System.out.println(cv);
//        System.out.println(iv); //에러
    }
}
