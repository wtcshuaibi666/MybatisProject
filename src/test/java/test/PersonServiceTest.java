package test;

import com.student.entity.Person1;
import com.student.service.PersonService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.List;

public class PersonServiceTest {
    private static PersonService personService;
    @BeforeClass
    public static void before(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        personService = ctx.getBean("PersonService",PersonService.class);

    }
    @Test
    public void getAllPerson(){
        List<Person1> person = personService.getAllPerson();

    }
    @Test
    public void queryPersonById(){
        personService.queryPersonById(1);
    }
    @Test
    public void addPerson(){
        Person1 person = new Person1(11,"小米","50464648446","java",20180505,"xx大学","1564","www.jnshu.com","dfsdfsdf","小龙",15645646,464644);
    }
    @Test
public void deletePerson(){
        personService.deletePerson(55);

}
@Test
public void  updatePerson(){
        Person1 person = new Person1(15,"daij","26443534","java",20180122,"dag大学","6468","www.jneshu.com","dasdafa","fsdjfi",214451,15331313);
        personService.updatePerson(person);
}

}
