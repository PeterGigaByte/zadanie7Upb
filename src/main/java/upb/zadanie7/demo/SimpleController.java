package upb.zadanie7.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/login")
public class SimpleController {
    @GetMapping
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }
    @PostMapping
    public String login(@RequestParam String username,@RequestParam String password){
        if(username.equals("username")&&password.equals("password")){
            return "OK PRIHLASENY";
        }else{
            return "WRONG PASSWORD OR NAME!!";
        }

    }
}
