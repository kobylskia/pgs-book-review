package pgs.soft.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Aleksander on 04.07.2017.
 */

@Controller
public class ViewController {

    @GetMapping("/")
    public String index(){
        return "home";
    }
}
