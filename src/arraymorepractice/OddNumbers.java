package arraymorepractice;

public class OddNumbers {

    public void  findoddnumbers (int [] nums) {
        System.out.println("The odd numbers are:");
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] % 2 !=0){
               System.out.println(nums [i]);
           }


        }

    }

    public static void main(String[] args) {
        int[] array = {34, 766, 827, 33, 99, 345, 11, 4};
        OddNumbers  sangha = new OddNumbers();
        sangha.findoddnumbers (array);

    }
}
