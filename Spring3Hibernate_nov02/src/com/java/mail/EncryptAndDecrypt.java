package com.java.mail;
import java.io.*;
import java.security.*;
import javax.crypto.*;

public class EncryptAndDecrypt {

public static void main (String[] args) throws Exception{
KeyPairGenerator keygenerator = KeyPairGenerator.getInstance("RSA");
SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
keygenerator.initialize(1024, random);

KeyPair keypair = keygenerator.generateKeyPair();
PrivateKey privateKey = keypair.getPrivate();
PublicKey publicKey = keypair.getPublic();
Cipher cipher = Cipher.getInstance("RSA");

/*cipher.init(Cipher.ENCRYPT_MODE, publicKey);
String st= "roseindia";
byte[] cleartext = null;
cleartext = st.getBytes();
byte[] ciphertext = null;
ciphertext = cipher.doFinal(cleartext);
System.out.println("the encrypted text is: " + ciphertext.toString());*/

cipher.init(Cipher.DECRYPT_MODE, privateKey);
String st= "[B@7b0fcdf3";
byte[] cleartext = null;
cleartext = st.getBytes();
byte[] ciphertext = null;
ciphertext = cipher.doFinal(cleartext);
System.out.println("the decrypted text is: " + ciphertext.toString());

/*cipher.init(Cipher.DECRYPT_MODE, privateKey);
byte[] cleartext1 = cipher.doFinal(ciphertext);
System.out.println("the decrypted cleartext is: " + new String(cleartext1));*/
}
}