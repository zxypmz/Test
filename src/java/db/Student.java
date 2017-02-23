/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
public class Student{
    //学号
    private String id;
    //姓名
    private String name;
    //年龄
    private int age;
    //性别
    private int sex;
    //专业
    private String major;
    //学院
    private String college;
    //简介
    private String introduction;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }

    public String getMajor() {
        return major;
    }

    public String getCollege() {
        return college;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
    
}
