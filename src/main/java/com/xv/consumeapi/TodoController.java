package com.xv.consumeapi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TodoController {

    @RequestMapping("/hello")
    //@ResponseBody
    private String hello() {
        return "hello";
    }

    @RequestMapping("/todos/{id}")
    @ResponseBody
    private ModelAndView getUser(@PathVariable Integer id, Model model)   {
        String uri = "https://jsonplaceholder.typicode.com/todos/" + id;
        RestTemplate restTemplate = new RestTemplate();

        User user = restTemplate.getForObject(uri, User.class);

        ModelAndView modelAndView = new ModelAndView("user");
        modelAndView.addObject("user", user);

        return modelAndView;
    }

    @RequestMapping("/todos/{id}/prev")
    public String getPrevTodo(@PathVariable Integer id) {
        int prevId = id - 1;
        return "redirect:/todos/" + prevId;
    }

    @RequestMapping("/todos/{id}/next")
    public String getNextTodo(@PathVariable Integer id) {
        int nextId = id + 1;
        return "redirect:/todos/" + nextId;
    }
}

