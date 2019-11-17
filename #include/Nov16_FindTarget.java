public class FindTarget {
    public static void main(String args[]){
        int arr[]= new int[]{1,2,3,4,5,6,10};
        int target=9,f=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                for(int k = i; k<arr.length;k++){
                    if(arr[k]!=target){
                        System.out.printf("[%d,%d]",i,k-1);
                        f=1;
                        break;
                    } } }
            if(f==1)
                break; }
        if(f==0)
            System.out.printf("[%d,%d]",-1,-1); }
}
