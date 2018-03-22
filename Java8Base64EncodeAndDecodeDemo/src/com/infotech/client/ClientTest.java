package com.infotech.client;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class ClientTest {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
//		simpleEncodingAndDecoding();
		final String textDate = "Java8 Base64 encoding and decoding!!!";
		String encodedText = Base64.getUrlEncoder().encodeToString(textDate.getBytes("UTF-8"));
		System.out.println(encodedText);
		
		byte[] decodeArr = Base64.getUrlDecoder().decode(encodedText);
		String decodedText = new String(decodeArr, "UTF-8");
		
		System.out.println(decodedText);
	}

	private static void simpleEncodingAndDecoding() throws UnsupportedEncodingException {
		//Encode a string
		final String textDate = "Java8 Base64 encoding and decoding!!!";
		String encodedText = Base64.getEncoder().encodeToString(textDate.getBytes("UTF-8"));
		System.out.println(encodedText);
		
		//Decode a string
		byte[] decodeArr = Base64.getDecoder().decode(encodedText);
		String decodedText = new String(decodeArr, "UTF-8");
		System.out.println(decodedText);
	}
}
