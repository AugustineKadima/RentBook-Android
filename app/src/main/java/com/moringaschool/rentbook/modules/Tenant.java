package com.moringaschool.rentbook.modules;

import java.util.Objects;

public class Tenant {
    String name;
    String email;
    String phone;
    String tenantIdNumber;
    int age;
    boolean gender;
    String occupation;
    boolean hasFamily;
    String tenancyDate;
    int paidDeposit;
    int paidRent;
    int rentBalance;
    String houseNumber;
    String propertyName;

    public Tenant(String name, String email, String phone, String tenantIdNumber, int age, boolean gender, String occupation, boolean hasFamily, String tenancyDate, int paidDeposit, int paidRent, int rentBalance, String houseNumber, String propertyName) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.tenantIdNumber = tenantIdNumber;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.hasFamily = hasFamily;
        this.tenancyDate = tenancyDate;
        this.paidDeposit = paidDeposit;
        this.paidRent = paidRent;
        this.rentBalance = rentBalance;
        this.houseNumber = houseNumber;
        this.propertyName = propertyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTenantIdNumber() {
        return tenantIdNumber;
    }

    public void setTenantIdNumber(String tenantIdNumber) {
        this.tenantIdNumber = tenantIdNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isHasFamily() {
        return hasFamily;
    }

    public void setHasFamily(boolean hasFamily) {
        this.hasFamily = hasFamily;
    }

    public String getTenancyDate() {
        return tenancyDate;
    }

    public void setTenancyDate(String tenancyDate) {
        this.tenancyDate = tenancyDate;
    }

    public int getPaidDeposit() {
        return paidDeposit;
    }

    public void setPaidDeposit(int paidDeposit) {
        this.paidDeposit = paidDeposit;
    }

    public int getPaidRent() {
        return paidRent;
    }

    public void setPaidRent(int paidRent) {
        this.paidRent = paidRent;
    }

    public int getRentBalance() {
        return rentBalance;
    }

    public void setRentBalance(int rentBalance) {
        this.rentBalance = rentBalance;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tenant tenant = (Tenant) o;
        return age == tenant.age && gender == tenant.gender && hasFamily == tenant.hasFamily && paidDeposit == tenant.paidDeposit && paidRent == tenant.paidRent && rentBalance == tenant.rentBalance && name.equals(tenant.name) && email.equals(tenant.email) && phone.equals(tenant.phone) && tenantIdNumber.equals(tenant.tenantIdNumber) && occupation.equals(tenant.occupation) && tenancyDate.equals(tenant.tenancyDate) && houseNumber.equals(tenant.houseNumber) && propertyName.equals(tenant.propertyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phone, tenantIdNumber, age, gender, occupation, hasFamily, tenancyDate, paidDeposit, paidRent, rentBalance, houseNumber, propertyName);
    }
}
