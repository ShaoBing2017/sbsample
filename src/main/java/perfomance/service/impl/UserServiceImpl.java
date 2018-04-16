package perfomance.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import perfomance.dao.UserDao;
import perfomance.model.User;
import perfomance.service.UserService;

@Service  
public class UserServiceImpl implements UserService {  
  
    @Autowired  
    private UserDao userDao;  
      
//    @Transactional(propagation = Propagation.REQUIRED)  
    public void updateName() {  
          
        Map<String, Object> paramMap = new HashMap<String, Object>();  
        paramMap.put("id", 1);  
        paramMap.put("name", "tuozixuan4");  
        int i = userDao.updateName(paramMap);  
        System.out.println("############################################" + i);
          
        paramMap = new HashMap<String, Object>();  
        paramMap.put("id", 1);  
        paramMap.put("name", "tuozixuan5");  
        i =  userDao.updateName(paramMap);  
        System.out.println("############################################" + i);
    }

//    @Transactional(propagation = Propagation.REQUIRED)  
	public List<User> select() {
        return userDao.select();  
		
	}

//    @Transactional(propagation = Propagation.REQUIRED)  
    public List<User> getUser() {
    	return userDao.getUser();  
	}


}  
