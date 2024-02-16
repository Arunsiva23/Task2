package com.sgic.java.util;

import java.util.Scanner;

public class Mail_Pass {
	String id="";
	public void getMail()
	{
		Scanner ui=new Scanner(System.in);
		System.out.println("Enter ur Emal.Id");
		id=ui.next();
	}
	
	String result="";
	public String Email_Valid()
	{
		int x=id.indexOf("@");
		int y=id.indexOf(".", x);
		if(y>0 && x>0)
		{
			result="Valid Email";
		}
		else
		{
			result="Invalid Email";
		}
		return result;
	}

}
