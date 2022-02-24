package com.example.minorproject.Models;

public class StudentModel {
    String Name, Enroll, Email, Password, userID, profilePic;

    public StudentModel(String name, String enroll, String email, String password, String userID, String profilePic) {
        Name = name;
        Enroll = enroll;
        Email = email;
        Password = password;
        this.userID = userID;
        this.profilePic = profilePic;
    }

    public StudentModel(String name, String enroll, String email, String password, String userID) {
        Name = name;
        Enroll = enroll;
        Email = email;
        Password = password;
        this.userID = userID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEnroll() {
        return Enroll;
    }

    public void setEnroll(String enroll) {
        Enroll = enroll;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}
