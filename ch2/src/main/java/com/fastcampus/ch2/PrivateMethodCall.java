package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {
    public static void main(String[] args) throws Exception{
//        Hello hello = new Hello();
//        hello.main(); // Hello 클래스의 main 메서드가 private이라서 외부호출 불가

        //Reflection API를 사용 - 클래스 정보를 얻고 다룰 수 있는 강력한 기능제공
        // java.lang.reflect패키지를 제공

        // Hello클래스의 Class객체를 얻어온다
        Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
        Hello hello = (Hello) helloClass.newInstance(); // Class 객체가 가진 정보로 객체 생성
        Method main = helloClass.getDeclaredMethod("main");
        main.setAccessible(true); // private인 main을 호출 가능하게 함
        main.invoke(hello);
    }

}
