package perfomance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import perfomance.dao.ClazzzDao;
import perfomance.model.Clazzz;
import perfomance.service.ClazzzService;

@Service
public class ClazzzServiceImpl implements ClazzzService {

	@Autowired
	private ClazzzDao clazzzDao;

	@Override
	public List<Clazzz> getClazzz(int id) {
		return clazzzDao.getClazzz(id);
	}
	
	@Override
	public List<Clazzz> getClazzz2(int id) {
		return clazzzDao.getClazzz2(id);
	}
	
	@Override
	public List<Clazzz> getClazzz3(int id) {
		return clazzzDao.getClazzz3(id);
	}
	
	@Override
	public List<Clazzz> getClazzz4(int id) {
		return clazzzDao.getClazzz4(id);
	}
}
