package perfomance;


import java.sql.Timestamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args )    { 
//		Timestamp ts = new Timestamp(System.currentTimeMillis()); 
		System.out.println("now is :::::::::::::::::::::::" + System.currentTimeMillis());
        SpringApplication.run(Application.class, args);  
    }  

}
