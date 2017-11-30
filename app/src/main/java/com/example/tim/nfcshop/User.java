package com.example.tim.nfcshop;

/**
 * Created by Gurt on 29.11.17.
 */

public class User {
    int userId;
    String meno;
    int kredit;
    int isAdmin;

    public User(String meno, int kredit, int isAsmin) {
        this.meno = meno;
        this.kredit = kredit;
        this.isAdmin = isAsmin;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public int getKredit() {
        return kredit;
    }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }
}
