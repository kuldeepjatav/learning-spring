package com.kuldeep.lil.sbet.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "STAFF")
public class Staff {
    @Id
    @Column(name = "EMPLOYEE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long staffId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "POSITION")
    private String position;

    public Staff(long staffId, String firstName, String lastName, String position) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public Staff() {
    }

    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
