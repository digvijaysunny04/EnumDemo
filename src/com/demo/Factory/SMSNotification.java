package com.demo.Factory;

public class SMSNotification implements Notification1 {

    @Override
    public void notify1() {
        System.out.println("SMS");
    }
}
