package com.student.entity;
import com.student.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {


//    private ApplicationContext applicationContext;
    //static {
//        创建spring容器

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
        PersonService personService =(PersonService)ctx.getBean(PersonService.class);

        Person1 person = new Person1();
        person.setName("xiom");
        person.setQq("4544464");
        person.setType("java");
        person.setEntranceTime(20180504);
        person.setSchool("xx大学");
        person.setOnlineNum("45454");
        person.setDailylink("www.jnshu.com");
        person.setWish("飞得更高");
        person.setBro("dasdf");
        person.setCreate_at(245245);
        person.setUpdate_at(5354);
        personService.addPerson(person);

        System.out.println(person);
    }

}

//  for 循环
//        for (int i = 0; i < 100; i++) {
//
//        }
//        for (int j = 1; j <= 1000000; j++) {
//         Person1 person = new Person1();
//        person.setName("xiom");
//        person.setQq("4544464");
//        person.setType("java");
//        person.setEntranceTime(20180504);
//        person.setSchool("xx大学");
//        person.setOnlineNum("45454");
//        person.setDailylink("www.jnshu.com");
//        person.setWish("飞得更高");
//        person.setBro("dasdf");
//        person.setCreate_at(245245);
//        person.setUpdate_at(5354);
//        personService.addPerson(person);
//        }
//
//
//        long EndTime = System.currentTimeMillis();
//        System.out.println("100万条数据插入花费时间 : " + (EndTime - StartTime) / 1000 + " s");
//        System.out.println("插入完成");
//        }
//        }