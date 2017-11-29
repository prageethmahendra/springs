package info.prageeth.components;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Prageeth on 21/5/2017.
 */
@RestController
public class RestHello {

    @RequestMapping("/")
    public String hello()
    {
        return "Hello World";
    }
}
