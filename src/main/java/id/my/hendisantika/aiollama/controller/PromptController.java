package id.my.hendisantika.aiollama.controller;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : ai-ollama
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 19/01/25
 * Time: 22.14
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class PromptController {
    private final ChatModel chatModel;

    public PromptController(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/ask")
    public String ask(@RequestParam(name = "prompt") String prompt) {
        return chatModel.call(prompt);
    }
}
