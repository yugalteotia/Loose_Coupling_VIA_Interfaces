package com.mytube.alertImpl;

import com.mytube.User;
import com.mytube.interfaces.AlertService;

public class SmsService implements AlertService {
    @Override
    public void sendAlert(User user) {
        System.out.println("Notifying " + user.getContact() + "...");
        System.out.println("Done!\n");
    }
}