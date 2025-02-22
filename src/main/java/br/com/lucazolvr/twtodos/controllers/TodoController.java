package br.com.lucazolvr.twtodos.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import br.com.lucazolvr.twtodos.models.Todo;
import br.com.lucazolvr.twtodos.repositories.TodoRepository;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @GetMapping("/")
    public ModelAndView List(){
        return new ModelAndView(
            "todo/list",
             Map.of("todos", todoRepository.findAll()));

    }

    @GetMapping("/create")
    public ModelAndView create() {
        return new ModelAndView("todo/form", Map.of("todo", new Todo()));
    }
    
    @PostMapping("/create")
    public String create(Todo todo) {
        todoRepository.save(todo);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable long id) {
        var todo = todoRepository.findById(id);
    }
    

}
    
    
