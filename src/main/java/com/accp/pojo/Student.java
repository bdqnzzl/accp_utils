package com.accp.pojo;

import com.nexus.pojo.NexusUser;

public class Student {
    private String stuName;
    private String stuAge;

    public static void main(String[] args) {
        NexusUser user = new NexusUser();
        user.setName("123");
        System.out.println(user.getName());
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }
}
