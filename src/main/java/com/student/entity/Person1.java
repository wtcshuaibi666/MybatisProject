package com.student.entity;

public class Person1 {
    private int id;
    private String name;
    private String qq;
    private String type;
    private long entranceTime;
    private String school;
    private String onlineNum;
    private String dailylink;
    private String wish;
    private String bro;
    private long create_at;
    private long update_at;

public Person1(){}
public Person1(int id,String name,String qq,String type,long entranceTime,String school,String onlineNum,String dailylink,String wish,String bro,long create_at,long update_at) {}


    public int getId () {
        return id;
    }

    public void setId ( int id){
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getQq () {
        return qq;
    }

    public void setQq (String qq){
        this.qq = qq;
    }

    public String getType () {
        return type;
    }

    public void setType (String type){
        this.type = type;
    }

    public long getEntranceTime () {
        return entranceTime;
    }

    public void setEntranceTime ( long entranceTime){
        this.entranceTime = entranceTime;
    }

    public String getSchool () {
        return school;
    }

    public void setSchool (String school){
        this.school = school;
    }

    public String getOnlineNum () {
        return onlineNum;
    }

    public void setOnlineNum (String onlineNum){
        this.onlineNum = onlineNum;
    }

    public String getDailylink () {
        return dailylink;
    }

    public void setDailylink (String dailylink){
        this.dailylink = dailylink;
    }

    public String getWish () {
        return wish;
    }

    public void setWish (String wish){
        this.wish = wish;
    }

    public String getBro () {
        return bro;
    }

    public void setBro (String bro){
        this.bro = bro;
    }

    public long getCreate_at () {
        return create_at;
    }

    public void setCreate_at ( long create_at){
        this.create_at = create_at;
    }

    public long getUpdate_at () {
        return update_at;
    }

    public void setUpdate_at ( long update_at){
        this.update_at = update_at;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qq='" + qq + '\'' +
                ", type='" + type + '\'' +
                ", entranceTime=" + entranceTime +
                ", school='" + school + '\'' +
                ", onlineNum='" + onlineNum + '\'' +
                ", dailylink='" + dailylink + '\'' +
                ", wish='" + wish + '\'' +
                ", bro='" + bro + '\'' +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                '}';
    }
}
