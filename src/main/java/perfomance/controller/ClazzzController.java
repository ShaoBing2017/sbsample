package perfomance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import perfomance.model.Clazzz;
import perfomance.service.ClazzzService;

@RestController
public class ClazzzController {

	@Autowired
	private ClazzzService clazzzService;


	@GetMapping("/getClazzz")
	public List<Clazzz> getClazzz(int id) {
		return clazzzService.getClazzz(id);
	}

	@GetMapping("/getClazzz2")
	public List<Clazzz> getClazzz2(int id) {
		return clazzzService.getClazzz2(id);
	}
	
	@GetMapping("/getClazzz3")
	public List<Clazzz> getClazzz3(int id) {
		return clazzzService.getClazzz3(id);
	}

	@GetMapping("/getClazzz4")
	public List<Clazzz> getClazzz4(int id) {
		return clazzzService.getClazzz4(id);
	}

}
