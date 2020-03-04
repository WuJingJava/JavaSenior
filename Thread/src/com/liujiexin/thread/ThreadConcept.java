package com.liujiexin.thread;

/**
 * @Description: 多线程的创建
 *  方式一：继承于Thread
 *      1.创建一个继承Thread类的子类
 *      2.重写Thread的run()
 *      3.创建Thread 类的子类对象
 *      4.通过此对象调用 start()
 * @Param: $params$
 * @return: $returns$
 * @Author: 张鹏
 * @Date: $date$

 */
public class ThreadConcept {
   Aa aa =  new Aa();
}


class Aa extends Thread{
    @Override
    public  void run(){

    }
}















