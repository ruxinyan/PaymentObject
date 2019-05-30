package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import db.mysql.MySQLOutputData;
import entity.PaymentObject;
import sort.MergeSort;
import sort.QuickSort;

class TestCase {
	MySQLOutputData out = new MySQLOutputData();
	@Test
	void testMerge() {
		PaymentObject[] array = out.getObject(1000);
		QuickSort sort = new QuickSort();
		sort.quickSort(array);
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1].compareTo(array[i]) > 0) {
				System.out.println(false);
			}
		}
	}
	
	@Test
	void testQuick() {
		PaymentObject[] array = out.getObject(1000);	
		MergeSort sort = new MergeSort();
		sort.mergeSort(array);
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i + 1].compareTo(array[i]) > 0) {
				System.out.println(false);
			}
		}	
	}
	
		
	@Test
	void test1() {
		PaymentObject one = new PaymentObject(1000000, 100, "20081110");
		PaymentObject two = new PaymentObject(1000001, 101, "20081110");
		PaymentObject three = new PaymentObject(1000002, 101, "20081109");
		PaymentObject[] array = new PaymentObject[] {one, two, three};
		PaymentObject[] expectedArray = new PaymentObject[]{two, one, three};		
		MergeSort sort = new MergeSort();
		sort.mergeSort(array);
		assertArrayEquals(array, expectedArray);	
	}
	
	
	
	@Test
	void test2() {
		PaymentObject one = new PaymentObject(1000000, 100, "20081110");
		PaymentObject two = new PaymentObject(1000001, 101, "20081110");
		PaymentObject three = new PaymentObject(1000002, 101, "20081109");
		PaymentObject[] array = new PaymentObject[] {one, two, three};
		PaymentObject[] expectedArray = new PaymentObject[]{two, one, three};
		QuickSort sort = new QuickSort();
		sort.quickSort(array);
		assertArrayEquals(array, expectedArray);
	}

	
	

	

	
}
