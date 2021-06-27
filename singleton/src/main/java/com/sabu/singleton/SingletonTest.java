package com.sabu.singleton;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/06/27
 */
public class SingletonTest {

    public static void main(String[] args) {
        DatabaseConnection databaseConnection1 = DatabaseConnection.getDatabaseConnection();
        System.out.println("DatabaseConnection1 ::::" + databaseConnection1);
        databaseConnection1.query("Sample query 1");

        DatabaseConnection databaseConnection2 = DatabaseConnection.getDatabaseConnection();
        System.out.println("DatabaseConnection2 ::::" + databaseConnection2);
        databaseConnection1.query("Sample query 2");
    }
}
