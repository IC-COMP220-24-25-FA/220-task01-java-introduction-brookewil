package edu.ithaca.dragon.practice;

import java.util.List;

public class FunctionPractice {

    /**
     * @return the largest of the 3 numbers
     * @throws IllegalArgumentException if any of the numbers is negative
     */
    public static int largestOfThree(int first, int second, int third){

        if (first < 0 || second < 0 || third < 0){
            throw new IllegalArgumentException("Numbers cannot be negative");
        }
        if (first >= second && first >= third){
            return first;
        } else {
            if(second >= first && second >= third){
                return second;
            } else{
                return third;
            }
        }
    }
    
    /**
     * @return the final price at register of the given item after discount and tax applied
     */
    public static double calcSalePrice(double originalPrice, double discountPercent, double salesTax){
        // wasn't sure if tax applies to regular price or discounted price so i opted for discounted price

        if (originalPrice <= 0 ){
            throw new IllegalArgumentException("Numbers must be greater than 0");
        }
        
        double discountPrice = originalPrice - (originalPrice * (discountPercent/100));
        double tax = discountPrice * (salesTax/100);
        return (discountPrice + tax);
    }

    /**
     * @return true if the data collected shows the dog is good, false if bad dog today
     */
    public static boolean isGoodDog(int yearsOld, int daysSinceShoesChewed, boolean fetchedThePaperToday){

        boolean isDogGood = daysSinceShoesChewed > 0 && fetchedThePaperToday == true;
        
        if(isDogGood){
            return isDogGood = true;
        } else {
            return isDogGood = false;
        }
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the first occurence.
     */
    public static int findFirstLargest(List<Integer> numbers){
        
        if (numbers.isEmpty()){
            return -1;
        }

        int largest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){

            if (numbers.get(i) > largest){
                largest = numbers.get(i);
            }
        }

        return largest;
    }

    /**
     * @return the index of the largest number in the list, or -1 if the list is empty.
     * If the largest number occurs more than once, return the index of the last occurence.
     */
    public static int findLastLargest(List<Integer> numbers){
        throw new RuntimeException("Not Implemented");
    }

    /**
     * @return the string that has contains the most occurences of the given letter
     * @throws 
     */
    public static String findFirstMostOccurencesOfLetter(List<String> words, char letter){
        throw new RuntimeException("Not Implemented");
    }


}
