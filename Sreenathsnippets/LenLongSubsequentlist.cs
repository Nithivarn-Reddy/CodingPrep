Time complexity: O(n^2) solution
--------------------------------
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
 
 Algorithm:
----------
 1)Using Arraylist,for every character ith element in the string,traverse the all character elements from elements from ith position to end.
  




Time complexity: O(n) solution
---------------------------------
 class Longestsub
    {
        private static void Main(string[] args)
        {
            String str = "jbpnbwwd";
            Console.WriteLine("The input string is :" + str);
            Console.WriteLine(Longestsubseq(str));
            Console.ReadLine();
        }

        private static int Longestsubseq(string str)
        {
            int n = str.Length;
            HashSet<char> hs = new HashSet<char>();
            int maxlen = 0, i , j ;
            for (i = 0, j = 0; i < n && j < n;)
            {
                if (!hs.Contains(str[j]))
                {
                    hs.Add(str[j]);
                    j = j + 1;
                    maxlen = Math.Max(maxlen, j - i);
                }
                else
                {
                    hs.Remove(str[i]);
                    i=i+1;
                }
            }
            return maxlen;
        }
    }

 Algorithm:
------------
 Hashset: Hashset is an unordered collection of unique elements. Generally used in a situation where we want to prevent duplicates
 from being inserted in the collection. 
 
  1)store each element in the hashset if traversing element is not already present.
  2)Remove the slow pointer element if fast pointer(current) element is already present in the hashet.
  3)At any point of time,length of subsequent string length is difference between fast pointer element and slow pointer element indices. 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
