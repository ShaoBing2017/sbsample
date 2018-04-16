package perfomance.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import perfomance.model.User;

@Mapper  
public interface UserDao {
	int updateName(Map<String, Object> paramMap);  
	
	public List<User> select();
	
	public List<User> getUser();
}
