package com.ashish.search;

import org.apache.log4j.Logger;

public class BinarySearch {

	final static Logger logger = Logger.getLogger(BinarySearch.class);

	public static void main(String[] args) {

		BinarySearch bs = new BinarySearch();
        //int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        //logger.info("Key 10's position: " + bs.binarySearch(arr, 10));
        int[] arr1 = {6, 34, 78, 123, 200, 323, 402, 432, 900};
        int key = 900;
        int result = bs.binarySearch(arr1, key);
        if(result != (-1)){
        	logger.info("Key: " + key + " found @ position: " + result);
        }else{
        	logger.error("key: " + key + " couldn't be found");
        }
        
	}
	
	private int binarySearch(int[] inputArr, int key) {
		
		int start = 0;
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
		return -1;
	}
}