package com.davidstanke.tfjavademo;

//import org.tensorflow.examples.*;
import java.util.Scanner;

import javax.imageio.ImageIO;
//import javax.swing.*;
//import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import org.apache.commons.lang3.*;

public class TFJavaDemo {
	
	final static int ASCII_WIDTH = 60;

	public static void main(String[] args) throws IOException {
	
		int[] arr = null;
	
		System.out.println("apache says... " + ArrayUtils.toString(arr));	

		Scanner keyboard = new Scanner(System.in);
	
		String filepath = "";
	
		if(args.length == 1) {
			filepath = args[0];
		} else {

			System.out.println("Welcome to Java Image Labeller!");
			System.out.println("Enter the path to an image you'd like to label...");
			filepath = keyboard.next();
		}
		
		System.out.println("Great, let's see what it looks like:");
		
		System.out.print(getAscii(filepath));
		System.out.println();
		System.out.println("Okay, now let's see what TensorFlow thinks it is...");

		// create an instance of the Java wrapper class around TF 

		LabelImage li = new LabelImage();		

		// pass command-line args to LabelImage class
		String[] labelArgs = {"./model",filepath};
		
		li.main(labelArgs);


	}

	

	private static String getAscii(String filepath) throws IOException {
		File file = new File(filepath);
                BufferedImage image = ImageIO.read(file);
		Image thumb = image.getScaledInstance(ASCII_WIDTH, -1, Image.SCALE_SMOOTH);
		BufferedImage bufferedThumb = new BufferedImage(thumb.getWidth(null), thumb.getHeight(null), BufferedImage.TYPE_INT_RGB);
		bufferedThumb.getGraphics().drawImage(thumb,0,0,null);
                String ascii = new ASCII().convert(bufferedThumb);

		return ascii;
	}
}
