package arraymorepractice;

public class ArrayOddNumbers {

    public void findoddnumbers (int [] nums){
        System.out.println("The odd numbers are:");
        for (int i = 0; i < nums.length; i++) {
            if (nums [i] % 2 !=0) {
                System.out.println(nums[i]);
            }

        }

    }

    public static void main(String[] args) {

        int [] Array = {23, 76, 89, 14, 66, 23,897};
        ArrayOddNumbers obj = new ArrayOddNumbers();
        obj.findoddnumbers(Array);


    }
}
