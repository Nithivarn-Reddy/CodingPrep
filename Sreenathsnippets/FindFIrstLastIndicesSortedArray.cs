using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FirstLastIndicesSortedArray
{
    class Program
    {
        static int Main(string[] args)
        {
            Console.WriteLine("Enter the size of an array: ");
            int size = int.Parse(Console.ReadLine());
            int[] arr = new int[size];
            Console.WriteLine("Enter the elements of the array: ");
            for (int i = 0; i < size; i++)
                arr[i] = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter the target element in sorted array");
            int targetele = int.Parse(Console.ReadLine());
            findFirstLastIndicesOfTarget(arr, targetele);
            return 0;
        }

        private static void findFirstLastIndicesOfTarget(int[] arr, int targetele)
        {
            int n = arr.Length;
            int start = -1,end=-1;
            for (int i = 0; i < n; i++)
            {
                if (arr[i] == targetele)
                {
                    if (start == -1)
                        start = i;
                    end = i;
                }
            }
            Console.WriteLine("First and last occurences are: [" + start + "," + end + "]");
            Console.ReadLine();
        }
    }
}
