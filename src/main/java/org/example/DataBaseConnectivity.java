package org.example;

public class DataBaseConnectivity {
    public static void main(String[] args) {
        JDBCExample jdbcExample = new JDBCExample();
        jdbcExample.createTable();
        jdbcExample.createEmployee(new Employee(1,"Sample1",25));
        jdbcExample.createEmployee(new Employee(2,"Sample2",30));
        jdbcExample.createEmployee(new Employee(3,"Sample3",18));
        jdbcExample.readEmployee();
    }
}