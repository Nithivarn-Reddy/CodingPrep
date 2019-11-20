using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DeleteDuplicates
{
    class DeleteDuplicatesNov17
    {
        static int Main(string[] args)
        {
            int[] nums = { 10, 10, 20, 20, 30, 30, 40, 40, 50, 50 };
            Console.WriteLine("Length of array after removing duplicates: "+ Removeduplicates(nums, nums.Length));
            Console.ReadLine();
            return 0;
        }

        private static int Removeduplicates(int[] nums, int length)
        {
            int i=0, j=0;
            for(i=0;i<length-1;i++)
            {
                if (nums[i] == nums[i+1])
                    continue;
                else if (nums[i] != nums[i+1])
                    nums[j++] = nums[i];
            }
            nums[j++] = nums[length - 1];
            Console.WriteLine("Elements of the array are: ");
            for (i = 0; i < j; i++)
                Console.Write(nums[i] +" , ");
            Console.Write("\n");
            return j;
        }
    }
}
