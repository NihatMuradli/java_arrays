package main;

public class Java_array {
public static void main(String[] args) {
	int [] array1 = {1,2,3,4,5};
	//massivin 1-ci, 3-cü və 5-ci elementini konsola indeksi vasitəsilə çıxarılması
	System.out.println("massivin 1-ci, 3-cü və 5-ci elementini konsola indeksi vasitəsilə çıxarılması");
	System.out.println(array1[1]);
	System.out.println(array1[3]);
	System.out.println(array1[4]);
	//massivin daxilindəki bütün dəyərləri for dövrü vasitəsilə konsola çıxarılması
	System.out.println("massivin daxilindəki bütün dəyərləri for dövrü vasitəsilə konsola çıxarılması");
	for(int i = 0; i<array1.length;i++) {
		System.out.println(array1[i]);
	}
	//massivin daxilindəki bütün dəyərləri foreach dövrü vasitəsilə konsola çıxarılması.
	System.out.println("massivin daxilindəki bütün dəyərləri foreach dövrü vasitəsilə konsola çıxarılması.");
	for(int i : array1) {
		System.out.println(i);
	}
	
	
	int [] array2 = new int [5];
	array2[0] = 1;
	array2[1] = 2;
	array2[2] = 3;
	array2[3] = 4;
	array2[4] = 5;
	//Massivin daxilindəki elementləri konsola çıxar.
	System.out.println("Massivin daxilindəki elementləri konsola çıxar.");
	for(int i : array2) {
			System.out.println(i);
	}
	//İndeks vasitəsilə hər beş elementi konsola çıxar.
	System.out.println("İndeks vasitəsilə hər beş elementi konsola çıxar.");
	System.out.println(array2[0]);
	System.out.println(array2[1]);
	System.out.println(array2[2]);
	System.out.println(array2[3]);
	System.out.println(array2[4]);
	
	
	//Massivin daxilindəki element sayını konsola çıxar.
	System.out.println("Massivin daxilindəki element sayını konsola çıxar.");
	System.out.println(array2.length);
	
	
	
	//sortlaşdırılma
	int [] array3 = {3,5,7,8,2,4,6,0,1};
	boolean swapped = true;
	int counter = 1;
	while(swapped) {
		swapped = false;
		for (int i = 0; i< array3.length - counter; i++) {
			if(array3[i] > array3[i + 1]) {
				swapped = true;
				int temp = array3[i];
				array3[i] = array3[i + 1];
				array3[i + 1] = temp;
			}
		}
		counter++;
	}
	System.out.println("sortlaşdırılma");
	for(int i : array3) {
		System.out.println(i);
    }
}
}
