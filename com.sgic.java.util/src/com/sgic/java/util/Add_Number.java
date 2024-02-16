package com.sgic.java.util;

public class Add_Number<T extends Number> 
{
	
	 public T t1;  
	    public T t2;  
	  
	    public Add_Number(T t1, T t2) 
	    {  
	        this.t1 = t1;  
	        this.t2 = t2;  
	    } 
	    
	    public T add()
	    {
	    	 return (T) (Integer) (t1.intValue() + t2.intValue());  
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add_Number<Integer> intAdd = new Add_Number(25, 35);  
        Integer result = intAdd.add();  
        System.out.println("Integer Result: " + result);  

	}

}
