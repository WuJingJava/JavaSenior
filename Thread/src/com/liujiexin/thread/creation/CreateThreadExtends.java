package com.liujiexin.thread.creation;

/**
 * @Program: JavaSenior
 * @Description: 实现线程的方式一—继承
 * 1、创建一个继承于Thread 的类的子类
 * 2、重写Thead 类的run()
 * 3、创建Tread类的子类的对象
 * 4、通过此对象调用start()
 *
 *
 * strat()的方法作用
 *  1：启动当前线程
 *  2：调用当前线程的run()
 *
 *  直接调用run()没有启动线程，只是调用线程类的run()方法
 *
 *
 * @Author: Liu Jiexin
 * @Date: 2020-03-24 08:50
 * @Version 1.0
 */


class ThreadTest extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":"+ i);
            }
        }
    }

}


public class CreateThreadExtends extends Thread{
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();

        threadTest.start();

        //问题一：不能直接通过run()方法启动方式线程
        //threadTest.run();

//        问题二： 再启动一个线程，遍历100以内的偶数，不能直接通过start的方法再次调用，会抛异常IllegalThreadStateException
        //由于线程已经启动，当前状态是已启动

//        threadTest.start();

//        需要再启动一个线程 需要再创建一个对象
        ThreadTest threadTest2 = new ThreadTest();
        threadTest2.start();

        System.out.println("hello");

        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                System.out.println("main******************************"+i);
            }
        }
    }
}


