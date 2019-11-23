 class Program
    {
        static void Main(string[] args)
        {
            string[] strarr = { "flower", "flow", "flight" };
            int n = strarr.Length;
            string ans = strarr[0];
            for (int i = 0; i < n-1; i++)
                ans = CheckCommonPrefix(ans, strarr[i+1]);
            Console.WriteLine("common prefix string is: " + ans);
        }

        private static string CheckCommonPrefix(string ans, string v)
        {
            string result="";
            for (int i = 0, j = 0; i < ans.Length && j < v.Length;i++,j++)
            {
                if (ans[i] == v[i])
                    result += ans[i];
                else 
                    break;
            }
            return result;
        }
    }
