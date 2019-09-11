package com.ergossoft.test;

import java.io.File;
import java.io.FileInputStream;

import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;

public class BarCodeTest {

	public static void main(String[] args) throws Exception{
		 net.sourceforge.barbecue.Barcode barcode;
		try {
			barcode = BarcodeFactory.createCode128B("be the coder");
			  barcode.setBarHeight(60);
			     barcode.setBarWidth(2);

			    
			     File imgFile = new File("C:\\Users\\satya\\Desktop\\pics\\testsize.png");
			     
			     
			     try {
					BarcodeImageHandler.savePNG(barcode, imgFile);
				} catch (OutputException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			     System.out.println("completed");
		} catch (BarcodeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   

	}
	
     
}
