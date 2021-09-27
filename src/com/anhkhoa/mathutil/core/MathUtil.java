/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhkhoa.mathutil.core;

/**
 *
 * @author DELL
 */
public class MathUtil {

   //viết hàm tính giai thừa n! 1,2,3,4,5,...n
   //0! = 1! - 1
   //21! tràn kiểu long
   //<0 ! lp tính được, ko có giai thừa âm
   public static long getFactorial(int n) {
       //trả về dữ liệu sai
           
           if(n < 0 || n > 20){
             throw new IllegalArgumentException("n must be betwween 0..20");
           }
           
           if(n == 0){
               return 1;
           } 
           
           long product = 1;
           for (int i = 1; i <= n; i++) {
               product *= i;
             }
       
       return product;
       
   }
    
}

//TTD- Test Driven Development(test tư duy)
//Test first development
//khi viết code ta phải lưu ý ngay viết testcase/tình huống test
//app/hàm phải được đề cập ngay
//test ngay những gì ta sẽ viết ra, test trước khi hoàn thiện code
//có 3 màu: xanh, đỏ
