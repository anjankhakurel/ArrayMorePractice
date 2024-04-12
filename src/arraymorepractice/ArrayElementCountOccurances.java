package arraymorepractice;

public class ArrayElementCountOccurances {

    public  int findOccurances (int [] array, int num) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count = count + 1;

            }

        }
        return count;

    }

    public static void main(String[] args) {
        int [] array = {2,4,1,6,7,4,8,9,2,5,0,1,4,2,7,6,5,4,7,8,1,8,5,0};
        ArrayElementCountOccurances obj = new ArrayElementCountOccurances();
        int result = obj.findOccurances(array,6);
        System.out.println(result);

    }
}
