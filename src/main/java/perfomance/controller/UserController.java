package perfomance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import perfomance.model.User;
import perfomance.service.UserService;

@RestController
public class UserController {
	
	@Autowired  
    private UserService userService;
	
	@GetMapping("/updateName")  
    public String updateName() {  
        userService.updateName();  
        return "updateName";  
    } 
	
	@GetMapping("/select")  
    public List<User> select() {  
		return userService.select();  
    }  
	

	@GetMapping("/get")  
    public List<User> getUser() {  
        return userService.getUser();  
    }  

}
