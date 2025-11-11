/*
 * Ad Soyad: [melike keke]
 * Ogrenci No: [250541003]
 * Tarih: [11.11.2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 package odev;

import java.util.Scanner;

public class GeometriHesap {
	public static double calculateSquareArea(double kenar) {
		return kenar * kenar;
	}
public static double calculateSquarePerimeter(double kenar) {
	return 4*kenar;
}
public static double  calculateRectangleArea(double en,double boy) {
	return en*boy;

}
public static double calculateRectanglePerimeter(double en,double boy) {
	return 2* (en+boy);
}
public static double calculateCircleArea(double yarıcap) {
return Math .PI*Math.pow(yarıcap,2);
}
public static double  calculateCircleCircumference(double yarıcap) {
	return Math.PI*2*yarıcap;
}
public static double  calculateTriangleArea(double taban,double yukseklik) {
	return (taban*yukseklik)/2;
}
public static double calculateTrianglePerimeter(double kenar1,double kenar2,double kenar3) {
	return kenar1+kenar2+kenar3;
}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("karenin bir kenarı giriniz:");
		 double kenar=input.nextDouble();
		 System.out.printf("karenin alanı:%.2f  %n",calculateSquareArea(kenar));
System.out.printf("karenin çevresi: %.2f %n",calculateSquarePerimeter(kenar));
System.out.println("dikdörtgenin uzun kenarı:");
double boy=input.nextDouble();
System.out.println("dikdörtgenin kısa kenarı:");
double en=input.nextDouble();
System.out.printf("dikdörtgenin alanı: %.2f %n",calculateRectangleArea(en, boy));
System.out.printf("dikdörtgenin çevresi:%.2f %n",calculateRectanglePerimeter(en, boy));
System.out.println("dairenin yarıçapı:");
 double yarıçap=input.nextDouble();
 System.out.printf("dairenin alanı:%.2f %n",calculateCircleArea(yarıçap));
 System.out.printf("daireni çevresi: %.2f %n",calculateCircleCircumference(yarıçap));
 System.out.println("üçgenin tabanı:");
double taban=input.nextDouble();
System.out.println("üçgen yükseklik:");
double yukseklik=input.nextDouble();
System.out.printf("üçgenin alanı:%.2f %n",calculateTriangleArea(taban, yukseklik));
System.out.println("kenar1:");
double kenar1=input.nextDouble();
System.out.println("kenar2:");
double kenar2=input.nextDouble();
System.out.println("kenar3:");
double kenar3=input.nextDouble();
System.out.printf("üçgen cevre:%.2f %n",calculateTrianglePerimeter(kenar1,kenar2,kenar3));

	}

}


