class NonInclusiveElement
{
        private static void Main(string[] args)
        {
            int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
            FindNonIncludedElement(arr);
        }

        private static void FindNonIncludedElement(int[] arr)
        {
            int n = arr.Length, i = 0, index = 0;
            for (i = 0; i < n; i++)
            {
                index = Math.Abs(arr[i]) - 1;
                if (arr[index] > 0)
                    arr[index] = -1*arr[index];
            }
            Console.WriteLine("Non included elements are: ");
            for (i = 0; i < n; i++)
                if (arr[i] > 0)
                    Console.WriteLine(i+1);
            Console.ReadLine();
        }   
}

Reference:
https://medium.com/@Zack123456/448-find-all-numbers-disappeared-in-an-array-3e3f764b3989

Algorithm:

Loop elements from 0 to n:

At ith index,go to array of abs[arr(ith)-1]th element and make it negative

After entire loop is ran,if an element is positive,that(index+1)th element is the missing element.
