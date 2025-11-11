/*
 * Ad Soyad: [melike keke]
 * Ogrenci No: [250541003]
 * Tarih: [11.11.2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * package odev;

import java.security.PublicKey;
import java.util.Scanner;

public class FizikFormul {
    final static double GRAVITE = 9.8;

public static double hızHesapla( double mesafe,double zaman) {
	return mesafe/zaman;
}
public static double ivmeHesapla(double hızDegisimi,double zaman) {
	return hızDegisimi/zaman;
	
}
public static double kuvvetHesapla(double kutle,double ivme) {
	return kutle*ivme;
}
public static double isHesapla(double kuvvet,double mesafe) {
	return kuvvet*mesafe;
}
public static double gucHesapla(double is,double zaman) {
	return is/zaman;
	
}
public static double kinetikEnerjiHesap(double kutle,double hız) {
	return 0.5*kutle*Math.pow(hız,2);
}
public static double potansiyelEnerjıHesap(double kutle,double yukseklık) {
	return kutle*GRAVITE*yukseklık;
}
	public static double momentumHesapla(double kutle, double hiz) {
        return kutle * hiz;
    }

	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    System.out.println("mesfeyi (metre)girin:");
double mesafe=input.nextDouble();
System.out.println("zamanı(saniye) girin:");
double zaman=input.nextDouble();
double m=hızHesapla(mesafe, zaman);
System.out.printf("hız:%.2f m/s%n",m);
System.out.println("hız degısımı:");
double hızDegisimi=input.nextDouble();
System.out.printf("ivme: %.2f m/s² %n",ivmeHesapla(hızDegisimi, zaman));
System.out.println("kutle giriniz:");
double kutle=input.nextDouble();
System.out.printf("kuvvet:%.2f N%n",kuvvetHesapla(kutle,m));
System.out.println("kuvvetin uygulandığı mesafe (metre): ");
double mesafee =input.nextDouble();
System.out.printf("iş:%.2f J%n",isHesapla(kutle, mesafee));
System.out.printf("güç:%.2f J%n",gucHesapla(hızDegisimi, zaman));
System.out.printf("kinetik enerji:%.2f J%n",kinetikEnerjiHesap(kutle, hızDegisimi));
System.out.println("yukseklik:");
 double yuksekik=input.nextDouble();
 System.out.printf("potansiyel  enerji:%.2f J%n",potansiyelEnerjıHesap(kutle, yuksekik));
 System.out.printf("momentum :%.2f kg.m/s%n",momentumHesapla(kutle, hızDegisimi));
	}

}
