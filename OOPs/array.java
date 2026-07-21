package OOPs;
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


// public class array {
//     public static void main(String[] args) {

//         int nums[][] = new int[3][4];

//         for(int i = 0; i<3; i++) 
//         {
//             for(int j = 0; j<4; j++)
//             {
//                 nums[i][j] = (int)(Math.random() * 10);
//                 // System.out.print(nums[i][j] + " ");
//             }
//             System.out.println();
//         }

//         for(int i = 0; i<3; i++) 
//         {
//             for(int j = 0; j<4; j++)
//             {
//                 System.out.print(nums[i][j] + " ");
//             }
//             System.out.println();
//         }

//         for(int n[] : nums)
//         {
//             for(int m : n)
//             {
//                 System.out.print(m + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// Array of obj

class Student {
    int rollno;
    String name;
    int marks;
}


public class array {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Alex";
        s1.marks = 80;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Raju";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Bheem";
        s3.marks = 70;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        // normal for loop
        // for(int i = 0; i<student.length; i++){
        //     System.out.println(student[i].name + " : " + student[i].marks);
        // }
        // enhanced for loop or for each loop
        for(Student stud : student)
        {
            System.out.println(stud.name + " : " + stud.marks);
        }


        // for each
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 5;
        nums[2] = 8;
        nums[3] = 3;

        // for(int i = 0; i<nums.length; i++){
        //     System.out.println(nums[i]);
        // }

        for (int n : nums) {
            System.out.println(n);
        }


        // Question
        int[] numbers = {45, 34, 67, 18, 9, 94};

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

    }
}