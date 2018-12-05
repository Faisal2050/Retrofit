package com.example.faisal.retro;

import com.google.gson.annotations.SerializedName;

public class ModelClass {
    @SerializedName("Con")
    public String conn;
    @SerializedName("Mysql")
    public String mysql;
    @SerializedName("Status")
    public String status;
    @SerializedName("ahmad")
    public String ahmad;

    public ModelClass(String conn, String mysql, String status, String ahmad) {
        this.conn = conn;
        this.mysql = mysql;
        this.status = status;
        this.ahmad = ahmad;
    }

    public String getConn() {
        return conn;
    }

    public String getMysql() {
        return mysql;
    }

    public String getStatus() {
        return status;
    }

    public String getAhmad() {
        return ahmad;
    }

    public void setConn(String conn) {
        this.conn = conn;
    }

    public void setMysql(String mysql) {
        this.mysql = mysql;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAhmad(String ahmad) {
        this.ahmad = ahmad;
    }
}
