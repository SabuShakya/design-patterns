package com.sabu.designpatterns.singleton;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/06/27
 */
public class DatabaseConnection {

    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection() {

    }

    public static DatabaseConnection getDatabaseConnection() {
        if (databaseConnection == null) {
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }

    public void query(String sql) {
        System.out.println("Querying Database " + sql);
    }
}
