package kz.mussamatdin.springlab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ATM atm = context.getBean("atm",ATM.class);
        atm.run();
        //context.close();
    }
}
