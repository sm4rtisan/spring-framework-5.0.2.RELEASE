package test;

import beans.LoginDao;
import beans.PackageConfig;
import beans.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

//		test1();
		test2();
	}

	public static void test1() {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(UserDao.class);
		annotationConfigApplicationContext.refresh();
		UserDao userDao = (UserDao) annotationConfigApplicationContext.getBean("userDao");
		userDao.printName();
	}


	public static void test2() {

		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(PackageConfig.class);
		LoginDao loginDao = annotationConfigApplicationContext.getBean(LoginDao.class);
		loginDao.login();
	}

	public static void test3() {

		// ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");
		// 第九次后置处理器（销毁的时候调用）
		// annotationConfigApplicationContext.close();
	}

}
