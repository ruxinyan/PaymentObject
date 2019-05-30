package sort;

import entity.PaymentObject;

public class QuickSort {
	
	public void quickSort(PaymentObject[] array) {
		if (array == null) {
			return;
		}
		quickSort(array, 0, array.length - 1);
	}
	
	private void quickSort(PaymentObject[] array, int left, int right) {
		if (left >= right) {
			return;
		}
		int pivot = partition(array, left, right);
		quickSort(array, left, pivot - 1);
		quickSort(array, pivot + 1, right);
	}
	
	private int partition(PaymentObject[] array, int left, int right) {
		int pivot = getPivot(left, right);
		PaymentObject pivotP = array[pivot];
		int leftIndex = left;
		int rightIndex = right - 1;
		swap(array, pivot, right);
		while (leftIndex <= rightIndex) {
			if (array[leftIndex].compareTo(pivotP) > 0) {
				leftIndex++;
			} else if (array[rightIndex].compareTo(pivotP) <= 0) {
				rightIndex--;
			} else {
				swap(array, leftIndex++, rightIndex--);
			}
		}
		swap(array, leftIndex, right);
		return leftIndex;
		
	}
	
	private int getPivot(int left, int right) {
		return left + (int) (Math.random() * (right - left + 1));
	}
	
	private void swap(PaymentObject[] array, int left, int right) {
		PaymentObject tem = array[left];
		array[left] = array[right];
		array[right] = tem;
 	}

}
