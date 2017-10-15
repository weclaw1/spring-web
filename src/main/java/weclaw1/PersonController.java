package weclaw1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

    @RequestMapping("/person")
    public String greeting(@RequestParam(value="name", required=true) String name, 
                           @RequestParam(value="surname", required=true) String surname,
                           @RequestParam(value="age", required=true) int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("surname", surname);
        model.addAttribute("age", age);
        return "person";
    }

}