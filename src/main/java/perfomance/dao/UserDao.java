package perfomance.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import perfomance.model.User;

@Mapper
public interface UserDao {
	
	public int insert(User user);
	
	public void delete(int id);
	
	public void update(User user);
	
	public User getone(int id); 
	
	public List<User> getall(); 
	
	
	public int updateName(Map<String, Object> paramMap);
	

	

	public List<User> select();

	public List<User> getUser();
}
