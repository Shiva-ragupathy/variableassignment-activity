package module2.activity;

public class findinarray {
    public static void main(String args[]) {
        int[] nums = {100,5, 7, 18};

        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < result) {
                result = nums[i];
            }
        }
        System.out.println("The Smallest number in array is " + result);

        result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > result){
                result = nums[1];
            }
        }
        System.out.println("The Largest number in array is " + result);

        int [] coins = {20, 2, 50, 1, 10, 5};
        int biggest = coins [0];
        for (int i = 0; i< coins.length; i++){
            if(coins[i]>biggest){
                biggest=coins[i];
            }
        }
        System.out.println(biggest);
    }
}

