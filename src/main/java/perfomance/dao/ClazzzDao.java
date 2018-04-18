package perfomance.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import perfomance.model.Clazzz;

@Mapper
public interface ClazzzDao {
	
	public List<Clazzz> getClazzz(int id);
	
	public List<Clazzz> getClazzz2(int id);
	
	public List<Clazzz> getClazzz3(int id);
	
	public List<Clazzz> getClazzz4(int id);
	
}
