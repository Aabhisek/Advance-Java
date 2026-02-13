package com.abhi.prep.java_advance.Multithreading;


class Printer {
    private int n=0;
    public synchronized void printeven() throws InterruptedException{
            while(n<=10){
                while(n%2!=0){
                    wait();
                }
                if(n<=10){
                    System.out.println(Thread.currentThread().getName()+":"+n);
                    n++;
                    notify();
                }

            }
    }public synchronized void printodd() throws InterruptedException{
            while(n<=10){
                while(n%2==0){
                    wait();
                }
                if(n<=10){
                    System.out.println(Thread.currentThread().getName()+":"+n);
                    n++;
                    notify();
                }
            }
    }

}

public class printoddeven {


    public static void main(String[] args) throws InterruptedException {
        Printer printer=new Printer();
        Thread evenThread=new Thread(()->{
            try {
                    printer.printeven();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }});
        Thread oddThread=new Thread(()->{
            try {
                    printer.printodd();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }});

            evenThread.start();
            oddThread.start();
            evenThread.join();
            oddThread.join();
        }
}
