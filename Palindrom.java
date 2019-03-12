/* PALİNDROM KELİME BULMA */

import java.util.Scanner;

public class Palindrom{
	



	public static void main(String args[]){
	Scanner scan = new Scanner(System.in); // Klavyeden girdi almak için oluşturulmuştur.

	String kelime = scan.next();
	String tersKelime="";
	for(int i=kelime.length()-1 ; i>=0 ; i--){ // length() metodu stringin içerigindeki kelimenin uzunluğunu alır.
		tersKelime +=kelime.charAt(i); // charAt metodu ile kelime stringinin bir indexindeki değer alınır.
	}

	if(kelime.equals(tersKelime)){ /* kelime ile tersKelimeyi == karşılaştırırsanız stringin içerigini değil stringlerin referanslarını karşılaştırır.
									stringlerin içerigini karşılastırmak için equals metodu kullanılır.*/
		System.out.println("Palindrom");

	}
	else System.out.println("Palindrom degil");
	}
}