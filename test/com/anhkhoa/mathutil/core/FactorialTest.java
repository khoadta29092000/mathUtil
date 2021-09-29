/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhkhoa.mathutil.core;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author DELL
 */
public class FactorialTest {
    
    @Test
    public void checkFactorialGivenRightArgumentReturnWell(){
        
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        Assert.assertEquals(expected,actual);
        
        Assert.assertEquals(720,MathUtil.getFactorial(6));
        Assert.assertEquals(1,MathUtil.getFactorial(0));
        
        Assert.assertEquals(1,MathUtil.getFactorial(1));
        
    }
    
    //check xem có ngoại lệ không khi người dùng nhập ngu
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException(){
        //ta ko dùng hàm asserEquals(2 value so sanh)
        //ngoại lệ chỉ có thể thấy nó xuất hiện hay ko???
        MathUtil.getFactorial(-5);
        //kì vọng ném về ngoại lệ
        //nhưng nó ko ném về ngoại lệ nên nó là màu đỏ
        //ko chạy đúng theo kì vọng là màu đỏ
        //
    }

        
}


//Quy ước,xanh đỏ:
//1.xanh, là tất cả hàm phải xanh
//2. đỏ, chỉ cần 1 tình huống sài hàm bị đỏ, coi như cả hàm đỏ
//Đỏ: bạn tính toán trong thuật toán/hàm bị sai
//hoặc bạn kì vọng sai
