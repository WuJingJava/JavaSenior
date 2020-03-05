package com.liujiexin.java.base.concept;

/**
 * @Program: JavaSenior
 * @description : java初始化顺序
 * @author: Liu Jiexin
 * @Date: 2020-03-05 15:25
 * @Version 1.0
 */
public class JavaInitializeSequence {
    
    
    /**
    * @Author Liu Jiexin
    * @Description
    * @Date  2020/3/5 15:22
    * @Param [a]
    * @return int
    **/
    public int As(Integer a){

        JavaInitializeSequence1 javaInitializeSequence1 = new JavaInitializeSequence1();
        javaInitializeSequence1.IntToStrings(12);

        System.out.println(a+10);
        return a + 10;
    }
}