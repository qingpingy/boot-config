package com.example.demo02.test;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: qpyue
 * @Date: 2020/07/14/08/59/16
 * @Description: TODO
 */
public class Test01 {


    @Test
    public void test01(){

        SimpleDateFormat sdft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String format = sdft.format(new Date());

        System.out.println(format);


    }
}
