package com.recursion;
import java.util.HashMap;

public class Forcast {

	
	    private static HashMap<Integer, Double> h = new HashMap<>();

	    public static double calculateFuture(double present, double rate, int year) {
	        
	        if (year == 0) {
	            return present;
	        }

	        if (h.containsKey(year)) {
	            return h.get(year);
	        }

	        double futureValue = (1 + rate) * calculateFuture(present, rate, year - 1);

	        h.put(year, futureValue);

	        return futureValue;
	    }

	    public static void main(String[] args) {
	        double presentValue = 1000; 
	        double growthRate = 0.05;   
	        int years = 10;             

	        double futureValue = calculateFuture(presentValue, growthRate, years);
	        System.out.println("Future Value after " + years + " years: " + futureValue);
	    }
}

	


