package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        Aditya aditya = (Aditya) context.getBean("aditya");
//        aditya.setMessage("Hello Aditya");
        aditya.showMessage();
        System.out.println(aditya);

    }

}
