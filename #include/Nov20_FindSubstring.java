public class FindSubstring {
    private static int findPattern(String s, String target) {
        int count=0;
        String temp="";
        int len=target.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==target.charAt(0)){
                temp = s.substring(i,i+len);
                if(temp.compareTo( target)==0) {
                    count++;
                    System.out.printf("Start Index %d \n", i);
                    i=i+len-1;
                } } }
        return count; }
    public static void main(String args[]){
        String target= "GHJ";
        String s="GHJASDGHEFJTGHJ";
        int n=findPattern(s,target);
        System.out.printf("total count %d \n",n);
    }}
