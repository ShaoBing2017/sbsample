package perfomance.model;

import java.sql.Timestamp;

public class User {
	
	private Integer id;
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String name;
    private Integer age;
    private String password;
    public Timestamp getSetdate() {
		return setdate;
	}

	public void setSetdate(Timestamp setdate) {
		this.setdate = setdate;
	}

	private Timestamp setdate;
	

	private Timestamp defaultdate;

    public Timestamp getDefaultdate() {
		return defaultdate;
	}

	public void setDefaultdate(Timestamp defaultdate) {
		this.defaultdate = defaultdate;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
