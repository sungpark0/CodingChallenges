package com.codingChallenge.ShoppingOptions;

/**
 * A customer wants to buy a pair of jeans, a pair of shoes, a skirt, and a top but has a limited budget in dollars.
 * Given different pricing options for each product, determine how many options our customer has to buy 1 of
 * each product. You cannot spend more money than the budgeted amount.
 * <p>
 * Example
 * priceOfJeans = [2, 3]
 * priceOfShoes = [4]
 * priceOfSkirts = [2, 3]
 * priceOfTops = [1, 2]
 * budgeted = 10
 * <p>
 * The customer must buy shoes for 4 dollars since there is only one option. This leaves 6 dollars to spend on the
 * other 3 items. Combinations of prices paid for jeans, skirts, and tops respectively that add up to 6 dollars or
 * less are [2, 2, 2], [2, 2, 1], [3, 2, 1], [2, 3, 1]. There are 4 ways the customer can purchase all 4 items.
 * <p>
 * Function Description
 * <p>
 * Complete the getNumberOfOptions function in the editor below. The function must return an integer which represents
 * the number of options present to buy the four items.
 * <p>
 * getNumberOfOptions has 5 parameters:
 * int[] priceOfJeans: An integer array, which contains the prices of the pairs of jeans available.
 * int[] priceOfShoes: An integer array, which contains the prices of the pairs of shoes available.
 * int[] priceOfSkirts: An integer array, which contains the prices of the skirts available.
 * int[] priceOfTops: An integer array, which contains the prices of the tops available.
 * int dollars: the total number of dollars available to shop with.
 * <p>
 * Constraints
 * <p>
 * 1 ≤ a, b, c, d ≤ 103
 * 1 ≤ dollars ≤ 109
 * 1 ≤ price of each item ≤ 109
 * Note: a, b, c and d are the sizes of the four price arrays
 */
public class ShoppingOptions {

    public static int shopping(int[] priceOfJeans, int[] priceOfShoes, int[] priceOfSkirts, int[] priceOfTops, int budget) {
        int result = 0;

        for (int jean : priceOfJeans) {
            for (int shoes : priceOfShoes) {
                for (int skirt : priceOfSkirts) {
                    for (int top : priceOfTops) {
                        if (jean + shoes + skirt + top <= budget) {
                            result++;
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(shopping(new int[]{2, 3}, new int[]{4}, new int[]{2, 3}, new int[]{1, 2}, 10));
    }
}
