package br.com.lucazolvr.twtodos.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.lucazolvr.twtodos.repositories.TodoRepository;

@Controller
public class HomeController {

    private final TodoRepository todoRepository;

    public HomeController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @GetMapping("/")
    public ModelAndView home(){
        var ModelAndView = new ModelAndView("home");
        ModelAndView.addObject("nome", "Lucas");
        var alunos = List.of("sore", "caichoeira de arari",  "cameta");
        ModelAndView.addObject("alunos", alunos);


        var todos = todoRepository.findAll();
        System.out.println(todos);

        return ModelAndView;
    }
    
}
