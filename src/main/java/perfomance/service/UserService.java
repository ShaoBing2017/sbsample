package perfomance.service;

import java.util.List;

import perfomance.model.User;

public interface UserService {
	
	public int insert(User user); 
	
	public void delete(int id); 
	
	public void update(User user); 
	
	public User getone(int id);
	
	public List<User>  getall();

	
	
	
		
	void updateName();  
	
	public List<User> select();  
	
	public List<User> getUser();

}