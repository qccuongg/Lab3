/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CDinfo {

    private String CDid;
    private String CDcollection;
    private String CDtype;
    private String CDtitle;
    private double CDprice;
    private int CDyearOfRealease;

    public CDinfo(String CDid, String CDcollection, String CDtype, String CDtitle, double CDprice, int CDyearOfRealease) {
        this.CDid = CDid;
        this.CDcollection = CDcollection;
        this.CDtype = CDtype;
        this.CDtitle = CDtitle;
        this.CDprice = CDprice;
        this.CDyearOfRealease = CDyearOfRealease;
    }

    public static void setSc(Scanner sc) {
        CDinfo.sc = sc;
    }

    public void setCDid(String CDid) {
        this.CDid = CDid;
    }

    public void setCDcollection(String CDcollection) {
        this.CDcollection = CDcollection;
    }

    public void setCDtype(String CDtype) {
        this.CDtype = CDtype;
    }

    public void setCDtitle(String CDtitle) {
        this.CDtitle = CDtitle;
    }

    public void setCDprice(double CDprice) {
        this.CDprice = CDprice;
    }

    public void setCDyearOfRealease(int CDyearOfRealease) {
        this.CDyearOfRealease = CDyearOfRealease;
    }

    public static Scanner getSc() {
        return sc;
    }

    public String getCDid() {
        return CDid;
    }

    public String getCDcollection() {
        return CDcollection;
    }

    public String getCDtype() {
        return CDtype;
    }

    public String getCDtitle() {
        return CDtitle;
    }

    public double getCDprice() {
        return CDprice;
    }

    public int getCDyearOfRealease() {
        return CDyearOfRealease;
    }
    private static Scanner sc = new Scanner(System.in);

    public CDinfo() {
    }

    public boolean addCD() {
        boolean flag = true;
        while (flag) {
            System.out.println("Enter CD's id: ");
            CDid = sc.nextLine();
            System.out.println("Enter CD's collection: ");
            CDcollection = sc.nextLine();
            System.out.println("Enter CD's type: ");
            CDtype = sc.nextLine();
            System.out.println("Enter CD's title: ");
            CDtitle = sc.nextLine();
            System.out.println("Enter CD's price: ");
            CDprice = sc.nextDouble();
            System.out.println("Enter CD's year of realease: ");
            CDyearOfRealease = sc.nextInt();
            sc.nextLine();
            System.out.println();
            System.out.println("Do you want to continue to add CD(Y/N): ");
            String ans = sc.nextLine();
            if (ans.equals("N")) {
                flag = false;
                System.out.println();
            }
        }
        return true;
        
    }
    public void outputCD() {
        System.out.print("ID: " + CDid);
        System.out.println();
        System.out.print("Collection: " + CDcollection);
        System.out.println();
        System.out.print("Type: " + CDtype);
        System.out.println();
        System.out.print("Title: " + CDtitle);
        System.out.println();
        System.out.print("Price: " + CDprice);
        System.out.println();
        System.out.print("Year of realease: " + CDyearOfRealease);
        System.out.println();
    }
    
    public void edit() {
        System.out.println("Enter new collection: ");
        String newCollection = sc.nextLine();
        System.out.println("Enter new type: ");
        String newType = sc.nextLine();
        System.out.println("Enter new title: ");
        String newTitle = sc.nextLine();
        System.out.println("Enter new price: ");
        double newPrice = sc.nextDouble();
        System.out.println("Enter new year of realease: ");
        int newYearOfRealease = sc.nextInt();
    }
}
