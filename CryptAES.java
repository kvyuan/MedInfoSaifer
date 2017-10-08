package madhack;

import java.io.File;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Scanner;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CryptAES {
	static String IV = "AAAAAAAAAAAAAAAA";
	static String encryptionKey = "0123456789abcdef";

	
	public static void main(String[] args) {
		try {
			String name = "bid.dat";
			File file = new File(name);
			Scanner in = new Scanner(file);
			FileOutputStream output = new FileOutputStream("Numbers.dat");
			while (in.hasNextLine()) {
				String Line = in.nextLine();
				//System.out.println(Line);
				String [] tokens = Line.split("\\|");
				for (int i = 0; i < tokens.length; i++) {
					String token = tokens[i];
					while (token.length() > 16) {
						String s = token.substring(0, 16);
						//System.out.println("original: " + s);
						byte[] cipher = encrypt(s, encryptionKey);
						output.write(cipher);
						//String t = decrypt(cipher, encryptionKey);
						//System.out.println("decrypted: " + t);
						token = token.substring(16, token.length());
					}
					while(token.length() < 16) {
						token = token + "\0"; 
					}
					byte[] cipher = encrypt(token, encryptionKey);
					output.write(cipher);
					//String t = decrypt(cipher, encryptionKey);
					//System.out.println(t);
					byte[] temp = {'|'};
					output.write(temp);
					//System.out.println(builder);
				}
				byte[] temp = {'\n'};
				output.write(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static byte[] encrypt(String plainText, String encryptionKey) throws Exception {
		Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
		SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
		cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(IV.getBytes("UTF-8")));
		return cipher.doFinal(plainText.getBytes("UTF-8"));
	}

	public static String decrypt(byte[] cipherText, String encryptionKey) throws Exception {
		Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");
		SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");
		cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(IV.getBytes("UTF-8")));
		return new String(cipher.doFinal(cipherText), "UTF-8");
	}
}