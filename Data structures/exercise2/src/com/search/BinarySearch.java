package com.search;

import java.util.Arrays;

public class BinarySearch {

	public Product binarySearch(Product[] products, String productName) {
        Arrays.sort(products);
        int f = 0;
        int l = products.length - 1;

        while (f <= l) {
            int middle = f + (l - f) / 2;
            int temp = products[middle].getProductName().compareTo(productName);

            if (temp == 0) {
                return products[middle];
            } else if (temp < 0) {
                f = middle + 1;
            } else {
                l = middle - 1;
            }
        }
        return null; 
    }
}
