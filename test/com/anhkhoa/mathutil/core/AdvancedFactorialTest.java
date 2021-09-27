/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhkhoa.mathutil.core;

import static com.anhkhoa.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author DELL
 */

//kỹ thuật tách bộ data

@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
  //data driven testing  
 //ta viết kĩ thuật mới, tách data ra hản các lệnh kiểm tra hàm
 //data này ta có thể đặt ở file .txt, .csv, .excel, database lên
 //input và output/expected là những cặp
 //nhiều cặp cần phải test, do dó data để test sẽ là mảng 2 chiều
 //Mảng 2 chiều này sẽ được nạp từ file .txt, db, ...
 //hoặc ta tạo luôn 1 mảng 2 chiều ngay đây
    @Parameters
 public static Object[][] initDate(){//tên hàm tuỳ ý
     // int a[] = {2, 4, 6 , 8}; khai báo mảng
     return new Integer[][]{
                            {0, 1},
                            {1, 1},
                            {2, 2},
                            {3, 6},
                            {4, 24},
                            {5, 120},
                           };
}   
     //biến là tham số thì tham số hoá
     //ta cần map 2 cái cột vào 2 cái biến
     //để lát ta nhồi(feed) chúng vào hàm checkFactorial
     //ta gọi là testing kiểu tham số hoá
     //parameterized testing
 @Parameter(value = 0)
 public int input;
 //để gán input vào 5 và expected vào 120
 @Parameter(value = 1)
 public long expected;
 //để nó map đúng vào hàm ta thêm @Parameters ở trên hàm
    
 //@Before
 //hàm tải load data vào ram
 //@After
 //đóng data lại
    
    @Test
    public void checkFactorialGivenRightArgumentReturnWell(){
    
  
    } 
    //chạy xong xong là paracel của các framework
}
