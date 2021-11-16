package com.connexion;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class OurConnextion {


    public static DataSource getMySQLDataSource(){
        Properties props = new Properties();
        MysqlDataSource mysqlDataSource = null;
        FileInputStream files = null;
        try {
            files = new FileInputStream("src/main/resources/database.propreties");
            props.load(files);
            mysqlDataSource = new MysqlDataSource();
            mysqlDataSource.setURL(props.getProperty("url"));
            mysqlDataSource.setUser(props.getProperty("user"));
            mysqlDataSource.setPassword(props.getProperty("password"));
        }catch (IOException ie){
            ie.printStackTrace();
        }

        return mysqlDataSource;
    }



}
