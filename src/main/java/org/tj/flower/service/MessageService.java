package org.tj.flower.service;

import org.springframework.stereotype.Service;
import org.tj.flower.model.Message;

@Service
public class MessageService {

    public void sendMessage(Message msg) {
        System.out.println(msg.getText());
    }

}
