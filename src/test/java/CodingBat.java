public class CodingBat {

    public static void main(String[] args) {
//        conCat("abc", "cat") → "abcat";
//        conCat("dog", "cat") → "dogcat";
//        conCat("abc", "") → "abc";

//          conCat("abc", "cat");

//        System.out.println(sum13(new int[]{1, 2, 13, 1, 2}));
//        System.out.println(sum13(new int[]{13, 2, 13, 1, 2}));
//        System.out.println(sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));

    }

//    public static String conCat(String a, String b) {
//
//        if (a.length() == 0 || b.length() == 0) {
//            return a + b;
//        }else
//        if ((a.substring(a.length() - 1, a.length())).equals(b.substring(0, 1))) {
//            return a + b.substring(1, b.length());
//        } else {
//            return a + b;
//        }
//    }

    public final int sum13(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sum = sum + nums[i];
                if (i > 0 && nums[i - 1] == 13)
                    sum = sum - nums[i];
            }
        }
        return sum;
    }

    public static int sum67(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum = sum + nums[i];
        }
        return sum;
    }


}

class ArrayMaxElement {
    public static void main(String[] args) {
        int arr[] = {1, 206, 10, 2, 3, 0, 7, 56, 32, 3, 14};
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

