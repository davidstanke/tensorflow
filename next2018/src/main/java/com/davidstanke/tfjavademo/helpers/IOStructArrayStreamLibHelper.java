package com.davidstanke.tfjavademo.helpers;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class IOStructArrayStreamLibHelper {
	public static String help() {
		return "valid";
	}
	
	private static void writeToText() {
		String writeMe = "hello";
        try {
            Files.write(Paths.get("~/tmp/txt/IOStructArrayStreamLibHelper.txt"), writeMe.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
