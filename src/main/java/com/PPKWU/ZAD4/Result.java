package com.PPKWU.ZAD4;

public class Result {

    private String name;
    private String email;
    private String phone;
    private String website;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override public String toString() {
        return "Result{"
               + "name='"
               + name
               + '\''
               + ", email='"
               + email
               + '\''
               + ", phone='"
               + phone
               + '\''
               + ", website='"
               + website
               + '\''
               + ", address='"
               + address
               + '\''
               + '}';
    }


}
