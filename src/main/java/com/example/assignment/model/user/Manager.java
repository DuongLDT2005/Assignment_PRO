package com.example.assignment.model.user;

import java.util.ArrayList;
import java.util.List;

import com.example.assignment.model.product.Inventory;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@DiscriminatorValue("Manager")
public class Manager extends User {
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="staff_id",referencedColumnName="id")
    private List<Staff> staffList;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "inventory_id", referencedColumnName = "id")
    private Inventory inventoryManager;

    //constructor rong~
    public Manager() {
        this.staffList = new ArrayList<>();
        this.inventoryManager = new Inventory();
    }

    //constructor chinh'
    public Manager(String shopName, String email, String name, String password, long phonenumber, String role, boolean status, String username) {
        super(shopName, email, name, password, phonenumber, role, status, username);
        this.staffList = new ArrayList<>();
        this.inventoryManager = new Inventory();
    }

    // //ti nua xoa :v
    // public Manager(Inventory inventoryManager, List<Staff> staffList, String email, String id, String name, String password, long phonenumber, String role, boolean status, String username) {
    //     super(email, id, name, password, phonenumber, role, status, username);
    //     this.inventoryManager = inventoryManager;
    //     this.staffList = staffList;
    // }
    //phuc vu cho viec chuyen giao nguoi manager(khong phai quan tam)
    // public Manager(Inventory inventoryManager, List<Staff> staffList, String email, String name, String password, long phonenumber, String role, boolean status, String username) {
    //     super(email, name, password, phonenumber, role, status, username);
    //     this.inventoryManager = inventoryManager;
    //     this.staffList = staffList;
    // }
    public List<Staff> getStaffList() {
        return staffList;
    }

    public Inventory getInventoryManager() {
        return inventoryManager;
    }

    //can nhac 
    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public void setInventoryManager(Inventory inventoryManager) {
        this.inventoryManager = inventoryManager;
    }

}
