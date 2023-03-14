package com.atdavid.project;

public class CustomerList {
    private Customer[] customers;
    public int total;

    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];

    }

    public boolean addCustomer(Customer customer){
        if (total >= customers.length){
            System.out.println("添加失败，客户已满");
            return false;
        }else {
            customers[total] = customer;
            total+=1;
            return true;
        }
    }

    public boolean replaceCustomer(int index,Customer cust){
        if (index >=0 &&index<total){
            customers[index] = cust;
            return true;
        }
        else
            return false;
    }

    public boolean deleteCustomer(int index){
        if (index <0 || index>=total){
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i+1];
        }
        customers[total-1] = null;
        total--;
        return true;
    }

    public Customer[] getAllCustomers(){
        Customer[] cus = new Customer[total];
        for (int i = 0; i < cus.length; i++) {
            cus[i] = customers[i];
        }
        return cus;
    }

    public Customer getCustomer(int index){
        if (index<0){
            System.out.println("客户不存在");
            return null;
        }
        return customers[index];
    }

    public int getTotal(){
        return total;
    }
}
