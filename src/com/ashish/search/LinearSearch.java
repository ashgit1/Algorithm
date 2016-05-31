package com.ashish.search;

import org.apache.log4j.Logger;

public class LinearSearch {

	final static Logger logger = Logger.getLogger(LinearSearch.class);

	public static void main(String[] args) {

		int[] arr1 = { 23, 45, 21, 55, 234, 1, 35, 90 };
		int searchKey = 90;
		linerSearch(arr1, searchKey);
		int[] arr2 = { 123, 445, 421, 595, 2134, 41, 304, 190 };
		searchKey = 421;
		linerSearch(arr2, searchKey);
	}

	private static void linerSearch(int[] array, int searchKey) {
		int size = array.length;
		boolean found=false;
		for (int i = 0; i < size; i++) {
			if (array[i] == searchKey) {
				logger.info("Key " + searchKey + " found at index: " + i);
				found=true;
				break;
			}
		}
		if(!found){
			logger.error("Key " + searchKey + " could not be found");
		}
		
	}

}
