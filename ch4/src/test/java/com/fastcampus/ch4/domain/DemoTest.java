//package com.fastcampus.ch4.domain;
//
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.web.servlet.MockMvc;
//
//@WebMvcTest // controller만 test
//public class DemoTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void testHello() throws Exception {
//        mockMvc.perform(get("/hello").param("name","둘리"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("Hello : 둘리"))
//                .andDo(print());
//    }
//}