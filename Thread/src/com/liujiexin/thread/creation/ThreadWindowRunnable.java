package com.liujiexin.thread.creation;

/**
 * 实现runnable 接口方法
 * 1：创建一个实现runnable的接口的类
 * 2：实现runnable类的中的抽象方法run()
 * 3:创建实现类的对象
 * 4：将此对象作为参数传入Thread类的构造器中，创建Thread类的对象
 * 5：通过Thread类的对象调用start()
 *
 *  比较创建线程的两种方式
 *      开发中优先选择实现runnable接口方式
 *      原因：
 *          1：实现的方式没有类的单继承的局限性
 *          2：实现方式更适合来处理多个线程有共享数据的情况
 *      联系
 *          Thread 类同样实现runnable的
 *
 * @deprecated  实例 ：卖票
 * @author ljx
 */
public class ThreadWindowRunnable {
    public static void main(String[] args) {
        CreateExtendsRunnable1 createExtendsRunnable1 = new CreateExtendsRunnable1();
        Thread thread = new Thread(createExtendsRunnable1);
        thread.start();

        Thread thread1 = new Thread(createExtendsRunnable1);
        thread1.start();

    }
}


class CreateExtendsRunnable1 implements Runnable{
    private  static  int ticket = 100;
    @Override
    public void run() {
        while (true){
            if (ticket > 0){
                 System.out.println( Thread.currentThread().getName()+"卖票 ，票号为：" + ticket);
                 ticket--;
            }else{
                break;
            }

        }
    }
}


