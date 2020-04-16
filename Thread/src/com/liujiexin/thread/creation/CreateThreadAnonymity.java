package com.liujiexin.thread.creation;

/**
 * @Program: JavaSenior
 * @Description: 匿名内部类实现线程
 * @Author: Liu Jiexin
 * @Date: 2020-04-16 08:56
 * @Version 1.0
 */
public class CreateThreadAnonymity {


    public static void main(String[] args) {


        new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + ":"+ i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    if(i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + ":"+ i);
                    }
                }
            }
        }.start();
    }
}