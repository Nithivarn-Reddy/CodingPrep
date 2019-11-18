using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ReverseNumber
{
    class ReverseNov18
    {
        static void Main(string[] args)
        {
            int n;
            Console.WriteLine("Enter the number to reverse: ");
            n = int.Parse(Console.ReadLine());
            Console.WriteLine(reverseNumber(n));
            Console.ReadLine();
        }

        private static int reverseNumber(int n)
        {
            int sum = 0, rem = 0;
            int min = int.MinValue;
            int max = int.MaxValue;
            while (n != 0)
            {
                rem = n % 10;
                n = n / 10;
                //Max boundary check
                if (((sum == max / 10) && n > 7) || (sum > max / 10))
                    return 0;
                //Min boundary check
                if (((sum == min / 10) && n <-8) || (sum < min / 10))
                    return 0;
                sum = sum * 10 + rem;
            }
            return sum;
        }

    }
}

Algorithm:
----------

1)Reverse the number
2)check the boundary cases
Max boundary case: if (value > max/10) or (value=max/10 and lastdigit>7)
Min boundary case: if (value < min/10) or (value=min/10 and lastdigit<-8)