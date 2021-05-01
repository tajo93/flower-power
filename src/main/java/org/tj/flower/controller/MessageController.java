package org.tj.flower.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.tj.flower.model.Message;
import org.tj.flower.service.MessageService;

@RestController
@RequestMapping("msg")
public class MessageController {

    private final MessageService msgService;

    @Autowired
    public MessageController(MessageService msgService) {
        this.msgService = msgService;
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void sendMessage(@RequestBody Message msg) {
        msgService.sendMessage(msg);
    }
}
