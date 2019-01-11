package cn.jackielee.base;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lxb on 19/01/07.
 */
@Slf4j
@RestController
public class IndexController {

    @RequestMapping(value = "/",method = {RequestMethod.GET,RequestMethod.POST})
    public String start(){
        log.info("hello JackieLee! web app is started!");
        return "hello JackieLee! web app is started! ";
    }

    @RequestMapping(value = "index",method = {RequestMethod.GET,RequestMethod.POST})
    public String index(){
        log.info("hello JackieLee! web app is started!");
        return "hello JackieLee! web app is started!";
    }
}
