package gymhum.de;
import java.lang.reflect.Array;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gymhum.de.model.Option;

@Controller
public class SpielController {

    public SpielController(){
       
    }

    //New test
   
    @GetMapping("/spiel")
    public String showSpiel(@RequestParam(name="activePage", required = false, defaultValue = "spiel") String activePage, Model model){ 
        model.addAttribute("activePage", "spiel");
        return "index.html";
    }

    @GetMapping("/pfad1")
    public String pfad1(@RequestParam(name="activePage", required = false, defaultValue = "pfad1") String activePage, Model model){
        model.addAttribute("activePage", "pfad1");
        return "index.html";
    }
    @GetMapping("/pfad2")
    public String pfad2(@RequestParam(name="activePage", required = false, defaultValue = "pfad2") String activePage, Model model){
        model.addAttribute("activePage", "pfad2");
        return "index.html";
    }

    @GetMapping("/ending1")
    public String showEnding1(@RequestParam(name="activePage", required = false, defaultValue = "ending1") String activePage, Model model){ 
        model.addAttribute("activePage", "ending1");
        return "index.html";
    }

    @GetMapping("/ending2")
    public String showEnding2(@RequestParam(name="activePage", required = false, defaultValue = "ending2") String activePage, Model model){ 
        model.addAttribute("activePage", "ending2");
        return "index.html";
    }

    @GetMapping("/ending3")
    public String showEnding3(@RequestParam(name="activePage", required = false, defaultValue = "ending3") String activePage, Model model){ 
        model.addAttribute("activePage", "ending3");
        return "index.html";
    }

    @GetMapping("/secret")
    public String showSecret(@RequestParam(name="activePage", required = false, defaultValue = "secret") String activePage, Model model){ 
        model.addAttribute("activePage", "secret");
        return "index.html";
    }

    @GetMapping("/resetgame")
    public String show(@RequestParam(name="activePage", required = true, defaultValue = "resetgame") String activePage, Model model){ 
        model.addAttribute("activePage", "resetgame");
        return "redirect:/spiel";
    }


} 
