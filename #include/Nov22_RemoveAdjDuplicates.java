class RemoveAdjDuplicate {
    static String removeD(String s){
        int i=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(i)!=s.charAt(j))
                i++;
            if(s.charAt(i)!=s.charAt(j) && i!=j){
                String a=s.substring(i-1,j);
                s=s.replace(a,"");
                i=0;j=0;
            }}
        if(i==0)
            s="";
        return s;
    }
    public static void main(String args[]){
        String s="abbabaaca";
        String r=removeD(s);
        System.out.println(r);
    }}
