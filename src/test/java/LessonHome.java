import java.util.Arrays;

final class LessonHome {

    public static void main(String[] args) {


    }

    public boolean has23(int[] nums) {
        String str = Arrays.toString(nums);
        return str.contains("2") || str.contains("3");

    }

    public boolean has24(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return true;
            }

        }
        return false;
    }
}
