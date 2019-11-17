public class RemoveDuplicate {
    public static void main(String args[]){
        int arr[] = new int[]{10,10,10,10,10,20,20,20,20,30,30,40,40,50,50};
        int a=arr[0],i=0;
        for(int j=0; j<arr.length;j++){
           if(arr[i]!=arr[j]){
               i++;
               arr[i]=arr[j];
           }}
        for(int k=0;k<=i;k++){
            System.out.println(arr[k]);
        }}}
