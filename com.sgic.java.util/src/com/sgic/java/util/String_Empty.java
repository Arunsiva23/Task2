package com.sgic.java.util;

import java.util.Scanner;

public class String_Empty {
	String txt="";
	public void getString()
	{
		Scanner ui=new Scanner(System.in);
		System.out.println("Enter the Text");
		txt=ui.next();
		
	}
	
	public String Chk_String()
	{
		if(txt==null)
		{
			return "empty";
		}
		else
		{
			return txt;
		}
	}
	public static void main(String[] args)
	{
		String_Empty se=new String_Empty();
		se.getString();
		System.out.println(se.Chk_String());
	}

}
