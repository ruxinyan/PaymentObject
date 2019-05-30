package sort;

import entity.PaymentObject;

public class MergeSort {
	
	public void mergeSort(PaymentObject[] array) {
		if (array == null) {
			return;
		}
		PaymentObject[] helper = new PaymentObject[array.length];
		merge(array, helper, 0, array.length - 1);
	}
	
	private void merge(PaymentObject[] array, PaymentObject[] helper, int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = left + (right - left) / 2;
		merge(array, helper, left, mid);
		merge(array, helper, mid + 1, right);
		mergeTwo(array, helper, left, mid, right);
	}
	
	private void mergeTwo(PaymentObject[] array, PaymentObject[] helper, int left, int mid, int right) {
		for (int i = 0; i <= mid; i++) {
			helper[i] = array[i];
		}
		int start1 = left;
		int start2 = mid + 1;
		int start = left;
		while (start1 <= mid && start2 <= right) {
			if (helper[start1].compareTo(array[start2]) > 0) {
				array[start++] = helper[start1++];
			} else {
				array[start++] = array[start2++];
			}
		}
		while (start1 <= mid) {
			array[start++] = helper[start1++]; 
		}
		while (start2 <= right) {
			array[start++] = array[start2++];
		}
	}
	
	

}
