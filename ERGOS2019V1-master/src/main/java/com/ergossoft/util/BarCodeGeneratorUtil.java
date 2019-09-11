package com.ergossoft.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Base64;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;

@Service
public class BarCodeGeneratorUtil {

	public String getBarCode(String barCode) {

		String imgStr = null;
		try {
			net.sourceforge.barbecue.Barcode barcode;

			barcode = BarcodeFactory.createCode128B(barCode);
			barcode.setBarHeight(60);
			barcode.setBarWidth(2);

			BufferedImage bi = BarcodeImageHandler.getImage(barcode);
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			ImageIO.write(bi, "png", os);

			byte[] bytes = os.toByteArray();
			imgStr = Base64.getEncoder().encodeToString(bytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return imgStr;
	}
}
