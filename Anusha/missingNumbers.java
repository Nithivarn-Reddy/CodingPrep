/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static List<Integer> missingNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i + 1 && nums[i] != nums[nums[i] - 1]) {
                int tmp = nums[i];
                nums[i] = nums[tmp - 1];
                nums[tmp - 1] = tmp;
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                res.add(i + 1);
            }
        }
        return res;
    }
	public static void main(String[] args) {
	//	System.out.println("Hello World");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of an array");
		 int a = sc.nextInt();
    int[] numbers = new int[a];

    for (int i = 0; i < numbers.length; i++)
    {
        System.out.println("enter number");
        numbers[i] = sc.nextInt();
	}
	System.out.println(missingNumbers(numbers));
	}
}
