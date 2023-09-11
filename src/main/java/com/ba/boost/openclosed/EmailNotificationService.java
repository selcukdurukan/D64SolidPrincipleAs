package com.ba.boost.openclosed;

public class EmailNotificationService implements INotificationService{
    @Override
    public void send(String message) {
        System.out.println("Mesaj gönderildi: " +message );
    }
}
