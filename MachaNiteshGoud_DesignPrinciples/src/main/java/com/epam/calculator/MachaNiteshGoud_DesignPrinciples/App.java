package com.epam.calculator.MachaNiteshGoud_DesignPrinciples;

import com.epam.calculator.frontend.MainWindow;

public class App 
{
    public static void main( String[] args )
    {
    	try {	
	    	MainWindow w = new MainWindow();
	        w.setVisible(true);
    	} 
    	catch(Exception e) {
    		System.out.println(e + " while creating a window");
    	}

    }
}
