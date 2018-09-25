package com.student.service;

import com.student.dao.UserDao;
import com.student.entity.Person1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonService {

    @Autowired
   private UserDao userDao;

    public List<Person1>getAllPerson(){
        return userDao.getAllPerson();
    }
    public void queryPersonById(int id){
        userDao.queryPersonById(id);
    }
    public void addPerson(Person1 person){
        userDao.addPerson(person);
    }
    public void deletePerson(int id){
        userDao.deletePerson(id);
    }
    public void updatePerson(Person1 person){
        userDao.updatePerson(person);
    }

}
