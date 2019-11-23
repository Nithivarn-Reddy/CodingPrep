public class Prefix {
    static String findCommon( String arr[]){
        String p=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            String s=arr[i];
            for(int j=0;j<s.length();j++){
                try {
                    if (p.charAt(j) != s.charAt(j))
                        p = p.substring(0, j);
                    }
                catch (StringIndexOutOfBoundsException e) {
                    break;
                }}}
        return p;
    }
    public static void main(String args[]){
        String arr[]= new String[]{"ffw","ffww","ffwfght","ffwfing","ffwfk"};
        String r= findCommon(arr);
        System.out.println(r);
    }}
