package com.dyyy;

//**************** Model Class for each users necessary characteristics and login info **************** 

enum Role{
    admin,
    client;
}

public class DyvvyUser{

    public String firstName;
    public String lastName;
    public String userN;
    public String passW;
    public Role userRole;
    public int secKey;

    public DyvvyUser(String firstName, String lastName, String userN, String passW, Role userRole, int secKey){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userN = userN;
        this.passW = passW;
        this.userRole = userRole;
        this.secKey = secKey;
    }

    public String getFirst(){
        return firstName;
    }


    public String getLast(){
        return lastName;
    }

    public String getUserN(){
        return userN;
    }

    public String getPassW(){
        return passW;
    }

    public Role getRole(){
        return userRole;
    }
    
    public int getSecKey(){
        return secKey;
    }

    public void setFirst(String firstName) {
        this.firstName = firstName;
    }

    public void setLast(String lastName) {
        this.lastName = lastName;
    }

    public void setUserN(String userN) {
        this.userN = userN;
    }

    public void setPassW(String passW) {
        this.passW = passW;
    }

    public void setRole(Role userRole) {
        this.userRole = userRole;
    }
    
}