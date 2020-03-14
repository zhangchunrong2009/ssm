package com.ssm.demo.entity;

public class Person {
    private long id;
    private String name;
    private String email;
    private int status;

    //getter  setter
    public long getId(){return id;}
    public void setId(long id){this.id = id;}

    public String getName(){return name;}
    public void setName(String name ){this.name = name;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public int getStatus(){return status;}
    public void setStatus(int status){this.status = status;}

    @Override
    public String toString(){
        return this.getId() + "---" + this.getName() + "---" +
                this.getEmail() + "---" + this.getStatus();
    }
}