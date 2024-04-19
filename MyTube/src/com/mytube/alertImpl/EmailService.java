package com.mytube.alertImpl;

import com.mytube.User;
import com.mytube.interfaces.AlertService;

public class EmailService implements AlertService {
    @Override
    public void sendAlert(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}