package org.sang.vhr.controller;

import org.sang.vhr.bean.ChatResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class WsController {
    @Autowired
    SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/ws/chat")
    public void handleChat(Principal principal, String msg) {
        String destUser = msg.substring(msg.lastIndexOf(";") + 1, msg.length());
        String message = msg.substring(0, msg.lastIndexOf(";"));
        messagingTemplate.convertAndSendToUser(destUser, "/queue/chat", new ChatResp(message, principal.getName()));
    }

    @MessageMapping("/ws/nf")
    @SendTo("/topic/nf")
    public String handleNF() {
        return "系统消息";
    }
}