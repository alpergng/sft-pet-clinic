package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ag on 22.7.2019
 */

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index(){

        return "index";
    }
}
