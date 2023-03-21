package com.kalyan.beans;

public class Employee
{
    private int eno;
    private String ename;
    private float esal;
    private String eaddr;

    private Account account;

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getEsal() {
        return esal;
    }

    public void setEsal(float esal) {
        this.esal = esal;
    }

    public String getEaddr() {
        return eaddr;
    }

    public void setEaddr(String eaddr) {
        this.eaddr = eaddr;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void getEmployDetails()
    {
        System.out.println("Employee Details");
        System.out.println("-----------------------------");
        System.out.println("Employee Number   :"+eno);
        System.out.println("Employee Name     :"+ename);
        System.out.println("Employee Salary   :"+esal);
        System.out.println("Employee Address  :"+eaddr);
        System.out.println();
        System.out.println("Account Details");
        System.out.println("--------------------");
        System.out.println("Account Number     :"+account.getAccNo());
        System.out.println("Account Holder Name:"+account.getAccHolderName());
        System.out.println("Account Type       :"+account.getAccType());
        System.out.println("Account Balance    :"+account.getBalance());

    }
}