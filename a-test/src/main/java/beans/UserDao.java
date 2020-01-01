package beans;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

	public void printName() {

		System.out.println("张三");
	}
}
