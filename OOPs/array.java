// public class array {
//     public static void main(String[] args) {
//         int num[] = {3, 7, 2, 4};

//         num[1] = 6;
//         System.out.println(num[1]);

//         int nums[] = new int[4];

//         nums[0] = 3;
//         nums[1] = 4;
//         nums[2] = 8;
//         nums[3] = 1;
//         System.out.println(nums[1]);
//     }
// }

public class array {
    public static void main(String[] args) {

        int nums[][] = new int[3][4];

        for(int i = 0; i<3; i++) 
        {
            for(int j = 0; j<4; j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
                // System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i<3; i++) 
        {
            for(int j = 0; j<4; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for(int n[] : nums)
        {
            for(int m : n)
            {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}