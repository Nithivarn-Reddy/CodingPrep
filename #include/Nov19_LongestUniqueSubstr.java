import java.util.HashSet;
public class LongestSubstring {
    public static void main(String args[]){
        int max=1,j=1,count=0;
        String s= "pwwkew";
        HashSet<String> h = new HashSet<String>();
        for (int i=0;i<s.length();i++){
            if(j<s.length()){
            if(s.charAt(i)!=s.charAt(j) && !h.contains(String.valueOf(s.charAt(i)))){
                count++;
                j++;
                h.add(String.valueOf(s.charAt(i)));
            }}
            if(max<count) {
                max = count;
            }
            if(s.length()>j){
            if(s.charAt(i)==s.charAt(j)){
                j++;
                count=0;
                h.clear();
            } } }
        System.out.println(max);
    }}
