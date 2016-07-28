package springapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/table")
public class TableController {
    @RequestMapping(method = RequestMethod.GET)
    public String printTable(ModelMap model){
        model.addAttribute("message","Hi yo");
        return "table";
    }
}
