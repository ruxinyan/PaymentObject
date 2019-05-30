package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import db.mysql.MySQLOutputData;
import entity.PaymentObject;
import sort.MergeSort;
import sort.QuickSort;

class TestCase {
	MySQLOutputData out = new MySQLOutputData();
	PaymentObject[] array = out.getObject(1000);
	@Test
	void testMerge() {
		
		QuickSort sort = new QuickSort();
		sort.quickSort(array);
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1].compareTo(array[i]) > 0) {
				System.out.println(false);
			}
		}
		System.out.print(array[1].date);
	}
	PaymentObject[] array1 = out.getObject(1000);
	@Test
	void testQuick() {
			
		MergeSort sort = new MergeSort();
		sort.mergeSort(array1);
		for (int i = 0; i < array1.length - 1; i++) {
			if (array1[i + 1].compareTo(array1[i]) > 0) {
				System.out.println(false);
			}
		}	
		System.out.print(array1[1].date);
		
	}
	

	
}
