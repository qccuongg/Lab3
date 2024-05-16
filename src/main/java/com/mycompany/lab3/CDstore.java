/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CDstore {
    private ArrayList<CDinfo> CDlist;
    public static Scanner sc = new Scanner(System.in);

    public CDstore() {
        this.CDlist = new ArrayList<>();
    }
    
    public void inputCD() {
        CDinfo newCD = new CDinfo();
        newCD.addCD();
        CDlist.add(newCD);
    }
    
    static Comparator<CDinfo> searchForTitle = new Comparator<CDinfo>() {
        @Override
        public int compare(CDinfo o1, CDinfo o2) {
            return o1.getCDtitle().compareTo(o2.getCDtitle());
        }
    };
    
    
    public void searchCDtitle () {
        System.out.println("Enter CD's title you want to find: ");
        String searchString = sc.nextLine();
        int index = Collections.binarySearch(CDlist, new CDinfo("", "", "", searchString, 0, 0),searchForTitle);
        if (index != -1) {
            System.out.println();
            CDlist.get(index).outputCD();
        }
        else
            System.out.println("Not found");
    }
    
    static Comparator<CDinfo> searchForCollection = new Comparator<CDinfo>() {
        @Override
        public int compare(CDinfo o1, CDinfo o2) {
            return o1.getCDtitle().compareTo(o2.getCDtitle());
        }
    };
    
    public void searchCDcollection () {
        System.out.println("Enter CD's collection you want to find: ");
        String searchString = sc.nextLine();
        int index = Collections.binarySearch(CDlist, new CDinfo("", searchString, "", "", 0, 0),searchForCollection);
        if (index != -1) {
            System.out.println();
            CDlist.get(index).outputCD();
        }
        else
            System.out.println("Not found");
    }
    
    static Comparator<CDinfo> searchForType = new Comparator<CDinfo>() {
        @Override
        public int compare(CDinfo o1, CDinfo o2) {
            return o1.getCDtitle().compareTo(o2.getCDtitle());
        }
    };
    
    public void searchCDtype () {
        System.out.println("Enter CD's type you want to find: ");
        String searchString = sc.nextLine();
        int index = Collections.binarySearch(CDlist, new CDinfo("", "", searchString, "", 0, 0),searchForType);
        if (index != -1) {
            System.out.println();
            CDlist.get(index).outputCD();
        }
        else
            System.out.println("Not found");
    }
    
    static Comparator<CDinfo> searchForID = new Comparator<CDinfo>() {
        @Override
        public int compare(CDinfo o1, CDinfo o2) {
            return o1.getCDtitle().compareTo(o2.getCDtitle());
        }
    };
    
    public void deleteCD () {
        System.out.println("Enter the id of CD you want to delete: ");
        String searchString = sc.nextLine();
        int index = Collections.binarySearch(CDlist, new CDinfo(searchString, "", "", "", 0, 0),searchForID);
        CDlist.remove(index);
    }
    
    public void editCD () {
        System.out.println("Enter the ID of CD you want to edit: ");
        String editID = sc.nextLine();
        CDinfo newCD = null;
        for (int i = 0; i < CDlist.size(); i++) 
            if (CDlist.get(i).getCDid().equals(editID))
                newCD = CDlist.get(i);
        if (newCD != null) {
            newCD.edit();
        }
    }
    
    public void displayCD () {
        for (int i = 0; i < CDlist.size(); i++)
            System.out.print(CDlist.get(i) + "\n");
    }
    
    public void sortYearAscending(){
            CDlist.sort(new Comparator<CDinfo>() {
                @Override
                public int compare(CDinfo o1, CDinfo o2) {
                    return Integer.compare(o1.getCDyearOfRealease(), o2.getCDyearOfRealease());
                }
            });
    }
}
