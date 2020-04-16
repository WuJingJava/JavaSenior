package com.liujiexin.thread.creation;

/**
 * @Program: JavaSenior
 * @Description: 线程常用方法
 *
 * 1：start() : 启动当前线程，调用当前线程的run()
 * 2：run():通常需要重写Thread类中的此方法，将创建的线程需要执行的操作声明在此方法中
 * 3：currentThread(): 静态方法，放回执行当前代码的线程
 * 4：getName() : 获取当前线程的名称
 * 5：setName(): 设置当前线程的名称
 *
 * @Author: Liu Jiexin
 * @Date: 2020-04-16 09:00
 * @Version 1.0
 */

class MyThread extends  Thread
{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

public class ThreadCommoMethod {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.setName("我的线程");
        thread.start();
    }
}