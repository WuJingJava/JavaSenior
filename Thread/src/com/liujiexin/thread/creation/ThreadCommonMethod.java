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
 * 6：yield() : 释放当前cpu的执行权
 * 7：join():在线程a中调用线程b的join()，此时线程a就进入阻塞状态，直到线程b完全执行完以后，线程a才结束阻塞状态
 * 8：stop()：已过时，结束线程
 * 9：sleep(long millis): 休眠(阻塞)
 *
 * @Author: Liu Jiexin
 * @Date: 2020-04-16 09:00
 * @Version 1.0
 */

class MyThread extends  Thread
{
    private static final  int forMax = 100;

    @Override
    public void run() {
        for(int i = 0; i < forMax; i++){

            try {
                sleep(1000*3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            if(i % 20 == 0){
                //线程阻塞
                yield();
            }
        }
    }

    public  MyThread(String name){
        super(name);
    }

}

/**
 * thread 常用方法
 * @author ljx
 */
public class ThreadCommonMethod {
    private static final  int forMax = 100;

    public static void main(String[] args) {
        MyThread thread = new MyThread("我的线程");
        ///通过对象设置线程名称 thread.setName("我的线程");
        thread.start();

        //设置主线程的名称
        Thread.currentThread().setName("主线程");
        for(int i = 0; i < forMax; i++){
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
            if(i == 20){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}