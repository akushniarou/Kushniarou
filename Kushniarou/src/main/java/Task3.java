public class Task3 {

    public static void main(String args[]) {

        int[] nums = {99, 546, 664, 23, 2346};

        System.out.println("Мы имеем масcив : ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Значения масcива кратные трем : ");

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}

