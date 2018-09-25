package com.student.dao;

import com.student.entity.Person1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    List<Person1> getAllPerson();
    List<Person1> queryPersonById(@Param("id")int id) ;
    int addPerson(Person1 person) ;
    int deletePerson(int id) ;

    int updatePerson(Person1 person) ;
}
