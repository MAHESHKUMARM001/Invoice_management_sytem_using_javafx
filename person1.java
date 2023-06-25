/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minpro111;

/**
 *
 * @author 21cs025
 */
public class Person1 {
     private int sino;
    private String productname;
    private int qty;
    private double price;


    public Person1()
    {
       sino=0;
       productname="";
       qty=1;
       price=0;

    }

    public Person1(int sino,String productname,int qty,double price)
    {
       this.sino=sino;
        this.productname=productname;
        this.qty=qty;
        this.price=price;

    }

    public int getSino() {
        return sino;
    }

    public String getProductname() {
        return productname;
    }

    public int getQty() {
        return qty;
    }
    public double getPrice() {
        return price;
    }
    public void setSino(int sino) {
        this.sino = sino;
    }
    public void setProductname(String productname) {
        this.productname = productname;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
