package pl.mtoolconnect.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mtoolconnect.Model.RaspberryGpioPinsListener;

@Controller
public class RPiRestController {
    @Autowired
    private RaspberryGpioPinsListener raspberryGpioPinsListener;

@GetMapping("/")
public String getData(Model model){

    model.addAttribute("state",raspberryGpioPinsListener);
   return "index";

}
}
