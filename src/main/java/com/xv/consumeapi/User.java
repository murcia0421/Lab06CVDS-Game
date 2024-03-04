package com.xv.consumeapi;

public class User {
    private Integer userid;
    private Integer id;
    private String title;
    private boolean completed = false;

    /*private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;*/

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setUserid(Integer userid) {this.userid = userid;}

    public Integer getUserid() {return userid;}

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCompleted(boolean completed) {this.completed = completed;}

    public boolean getCompleted() {return completed;}
    /*
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }*/


}
