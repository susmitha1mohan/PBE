package com.sush.PBE;

import antlr.collections.List;
import model.dao.ProductDAO;
import model.entity.Customer;
import model.entity.CustomerDAO;
import model.entity.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Customer c1 = new Customer("Rajesh", 25);
    	CustomerDAO cd = new CustomerDAO();
    	boolean b = cd.insertCustomer(c1);
    	if(b)
        {
     	   System.out.println("Successfully inserted");
        }
        else
        {
     	   System.out.println("Not Working");
        }
   	
    	
    /*	 Product p1 = new Product(101,"clock","900");
         ProductDAO pd = new ProductDAO();
         boolean b = pd.insertProduct(p1);
         if(b)
         {
      	   System.out.println("Successfully inserted");
         }
         else
         {
      	   System.out.println("Not Working");
         } */
    	
    }
}
