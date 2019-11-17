public class PrimePair {
    public static void main(String args[]) {
        int arr[] = new int[]{4, 6, 8, 2, 9}, arr2[]= new int[100];
        int count=0,pair=0,f=0,a=0;
        for(int i=0; i<arr.length;i++){
            for(int k=1;k<arr[i];k++){
                if(arr[i]%k!=0)
                    count++;
            }
            if(count==arr[i]-2) {
                for (int j = 0; j < arr.length; j++) {
                    for (int h = 0; h <arr2.length; h++) {
                        if (arr[j] == arr2[h])
                            f = 1;
                    }
                    if (i != j && f != 1) {
                        pair++;
                        System.out.printf("(%d,%d)", arr[i], arr[j]);
                    }
                    arr2[a] = arr[i];
                    a++;
                    f=0;
                } }
            count=0;
        }
        System.out.printf("%n");
        System.out.println(pair);
    }}
