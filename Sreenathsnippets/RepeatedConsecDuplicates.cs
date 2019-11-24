 class Program
    {
        static void Main(string[] args)
        {
            String s = "abbaca";
            consecutiveDuplicateRemoval(s);
        }

        private static void consecutiveDuplicateRemoval(string str)
        {
            Stack stk = new Stack();
            string res = "";

            if (string.IsNullOrEmpty(str))
            {
                return;
            }

            for (int i = 0; i < str.Length; i++)
            {
                if (stk.Count == 0)
                {
                    stk.Push(str[i]);
                    continue;
                }
                char topele = (char)stk.Peek();
                if (topele == str[i])
                    stk.Pop();
                else
                {
                    stk.Push(str[i]);
                }
            }
            foreach (object o in stk)
                res = res + (char)o;
            Console.WriteLine(printReverse(res));
            Console.ReadLine();
        }

        private static string printReverse(string res)
        {
            int len = res.Length;
            string rev="";
            while(len>0)
            {
                rev = rev + res[len-1];
                len--;
            }
            return rev;
        }
    }
