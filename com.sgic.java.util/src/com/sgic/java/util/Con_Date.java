package com.sgic.java.util;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.util.Date;

import java.text.SimpleDateFormat;

public class Con_Date {
	//Date d1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sd1="16/02/2024";
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        try {
			java.util.Date d1 = sdf.parse(sd1);
			System.out.println(d1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
