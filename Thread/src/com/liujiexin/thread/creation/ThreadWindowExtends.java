package com.liujiexin.thread.creation;


/**
 * @deprecated  实例 ：卖票
 * @author ljx
 */
public class ThreadWindowExtends {
    public static void main(String[] args) {
        CreateThreadExtends1 threadWindow1 = new CreateThreadExtends1();
        CreateThreadExtends1 threadWindow2 = new CreateThreadExtends1();
        CreateThreadExtends1 threadWindow3 = new CreateThreadExtends1();

        threadWindow1.setName("窗口1");
        threadWindow2.setName("窗口2");
        threadWindow3.setName("窗口3");

        threadWindow1.start();
        threadWindow2.start();
        threadWindow3.start();

    }
}


class CreateThreadExtends1 extends Thread{
    private  static  int ticket = 100;
    @Override
    public void run() {
        while (true){
            if (ticket > 0){
                 System.out.println(getName() + "卖票 ，票号为：" + ticket);
                 ticket--;
            }else{
                break;
            }

        }
    }
}


