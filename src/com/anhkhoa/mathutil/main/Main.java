/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhkhoa.mathutil.main;

import com.anhkhoa.mathutil.core.MathUtil;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
     
        
        //test manual, đưa data, gọi hàm check, so sánh
        //expected vs input
        //tất cả, đặc biệt phần cmp là phải bằng mắt
        //cho từng tình huống là từng hàm
        System.out.println("0! = 1?" + MathUtil.getFactorial(0));
        System.out.println("1! = 1?" + MathUtil.getFactorial(1));
        System.out.println("2! = 2?" + MathUtil.getFactorial(2));
        System.out.println("3! = 6?" + MathUtil.getFactorial(3));
        
    }
}
