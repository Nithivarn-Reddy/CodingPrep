 class Program
 {
        static void Main(string[] args)
        {
            String str = "jbpnbwwd";
            Console.WriteLine("The input string is :" + str);
            Console.WriteLine(longestsubseq(str));
            Console.ReadLine();
        }

        private static int longestsubseq(string str)
        {
            int n = str.Length;
            ArrayList d = new ArrayList(n);
            int i = 0, maxlen = 0;
            for (i=0;i<n;i++)
            {
                int j;
                for (j = i; j < n; j++)
                {
                    if (!d.Contains(str[j]))
                    {
                        d.Add(str[j]);
                    }
                    else
                    {
                        d.Clear();
                        break;
                    }
                    if (d.Count > maxlen)
                        maxlen = d.Count;
                }
            }
            return maxlen;
        }
 }
 
 Time complexity: O(n^2) solution
