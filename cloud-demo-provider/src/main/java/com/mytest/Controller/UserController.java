package com.mytest.Controller;

import com.mytest.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @GetMapping(value = "/getUser/{userName}")
    public User getUser(@PathVariable String userName){
       User user1=new User();
       user1.setUserName(userName);
       user1.setPassword("123");

        return  user1;
    }
    @GetMapping(value = "/getUserName")
    public String getUserName(){
        return  "jxs";
    }
}
