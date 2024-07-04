package com.itheima.test;

import org.junit.jupiter.api.Test;

public class UploadFileTest {
    @Test
    public void test1(){
        String name = "ererewe.jpg";
        String suffix = name.substring(name.lastIndexOf("."));
        System.out.println(suffix);
    }
}
