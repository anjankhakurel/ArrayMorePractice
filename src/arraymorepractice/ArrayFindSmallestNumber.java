package arraymorepractice;


public class ArrayFindSmallestNumber {

    public int getsmallestnumber (int [] nums) {
        int min = Integer.MAX_VALUE; //Initializing minimun to maximun value
         for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) { //current number chai smaller than minimun
                min = nums[i];

            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] array = {-3, -2, -984356, -273638, -200, -189, -4};
        ArrayFindSmallestNumber obj = new ArrayFindSmallestNumber();
        int result = obj.getsmallestnumber(array);
        System.out.println("The Smallest Number is:" + result);







        }
    }
