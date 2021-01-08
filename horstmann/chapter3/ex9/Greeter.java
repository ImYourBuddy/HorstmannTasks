package com.mycompany.horstmann.chapter3.ex9;

public class Greeter implements Runnable{
    private int n;
    private String target;

    public Greeter(int n, String target) {
        this.n = n;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello, " + target);
        }
    }

    public static void main(String[] args) {
        Greeter greeterFirst = new Greeter(3, "John");
        Greeter greeterSecond = new Greeter(10, "Marie");
        Thread firstThread = new Thread(greeterFirst);
        Thread secondThread = new Thread(greeterSecond);
        firstThread.start();
        secondThread.start();
    }
}
