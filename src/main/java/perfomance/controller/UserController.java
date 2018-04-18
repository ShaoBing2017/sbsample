package perfomance.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import perfomance.model.User;
import perfomance.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/insert")
	public int insert(String name, int age, String password, long setdate) {
		User user = new User();
		// user.setId(id);
		user.setName(name);
		user.setAge(age);
		user.setPassword(password);
		user.setSetdate(new Timestamp(setdate));
		return userService.insert(user);
	}

	@GetMapping("/delete")
	public void insert(int id) {
		userService.delete(id);
	}

	@GetMapping("/update")
	public void insert(int id, String name, int age, String password, long setdate, long defaultdate) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setAge(age);
		user.setPassword(password);
		user.setSetdate(new Timestamp(setdate));
		user.setDefaultdate(new Timestamp(defaultdate));
		userService.update(user);
	}

	@GetMapping("/updateName")
	public void updateName() {
		userService.updateName();
	}

	@GetMapping("/select")
	public List<User> select() {
		return userService.select();
	}

	@GetMapping("/get")
	public List<User> getUser() {
		return userService.getUser();
	}

	@GetMapping("/getone")
	public User gteone(int id) {
		return userService.getone(id);
	}

	@GetMapping("/getall")
	public List<User> getall() {
		return userService.getall();
	}

}
