/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author ADMIN
 */
public abstract class Employee {
    private String employeeID;
    private String employeeName;
    private int yearOfBirth;
    private String address;
    private String phone;

    // Getters
    public String getEmployeeID() { return employeeID; }
    public String getEmployeeName() { return employeeName; }
    public int getYearOfBirth() { return yearOfBirth; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }

    // Setters
    public void setEmployeeID(String employeeID) { this.employeeID = employeeID; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
    public void setYearOfBirth(int yearOfBirth) { this.yearOfBirth = yearOfBirth; }
    public void setAddress(String address) { this.address = address; }
    public void setPhone(String phone) { this.phone = phone; }

    abstract String getInfo();
    abstract float getPayment();
}
