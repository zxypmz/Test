/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class zxy {
    public static void main(String[] args){
       // Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/test", "root", "jfy");
       StudentManager.addStudent("04", "李四", 20, 1, "adf", "asd", "fd");
    }
}
