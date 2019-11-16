using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CountpairsNov15
{
    class CountpairsNov15
    {
        private static int primeCount(int[] a, int n)
        {
            int count = 0;
            for (int i = 0; i < n; i++)
            {
                if (a[i] < 2)
                    continue;
                count++;
                for (int j = 2; j <= Math.Sqrt(a[i]); j++)
                {
                    if (a[i] % j == 0)
                    {
                        count--;
                        break;
                    }
                }
            }
            return count;
        }

        private static int Countpair(int[] a, int n)
        {
            int primecount = primeCount(a, n);
            int nonprimecount = n - primecount;

            return (primecount * nonprimecount) + (primecount * (primecount - 1) / 2);
        }

        public static int Main()
        {
            Console.WriteLine("Enter the size of an array: ");
            int size = int.Parse(Console.ReadLine());
            int[] arr = new int[size];
            Console.WriteLine("Enter the elements of the array: ");
            for (int i = 0; i < size; i++)
                arr[i] = int.Parse(Console.ReadLine());
            Console.WriteLine(Countpair(arr, size));
            Console.ReadLine();

            return 0;
        }
    }
}
