package dss;

import org.apache.commons.codec.binary.Base64;

public class EncryptPassword {

	public static void main(String[] args) {
		
		
		String ss="Test123";
		
		byte[] encode=Base64.encodeBase64(ss.getBytes());
		
		System.out.println("The encode form is :"  +new String(encode));
		
		byte[] decode=Base64.decodeBase64(encode);
		
		System.out.println("The decode form is: " + new String(decode));
		
		String s1="Sachin";
		
		//String s2= new String ("Sachin");
		
		String s3= "Sachin";
		
		System.out.println(s1.equalsIgnoreCase(s3));

	}

}
