package perfomance.service;

import java.util.List;

import perfomance.model.User;

public interface UserService {
	void updateName();  
	

	public List<User> select();  
	
	public List<User> getUser();
}
