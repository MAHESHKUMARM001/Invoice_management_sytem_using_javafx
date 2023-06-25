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
public class Person {
     private int sino;
    private String productname;
    private int qty;
    private double price;
    private int availableqty;


    public Person()
    {
       sino=0;
       productname="";
       qty=1;
       price=0;
       availableqty=0;       
    }

    public Person(int sino,String productname,int qty,int price,int available_qty)
    {
       this.sino=sino;
        this.productname=productname;
        this.qty=qty;
        this.price=price;
        this.availableqty=available_qty;        
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

    public int getAvailableqty() {
        return availableqty;
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

    public void setAvailableqty(int availableqty) {
        this.availableqty = availableqty;
    }

}
