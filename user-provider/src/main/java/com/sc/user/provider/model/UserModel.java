package com.sc.user.provider.model;

public class UserModel {
    private String name;
    private  Integer age;
    private  String id;
     public UserModel(String id,String name,Integer age){
         this.name=name;
         this.age=age;
         this.id=id;
     }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}