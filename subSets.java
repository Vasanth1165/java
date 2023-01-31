import java.util.*;
public class java{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // subsets using power set Big O(2**n)
        for(int i=1;i<(1<<n);i++){
            for(int j=0;j<n;j++){
                if((i&(1<<j))>0) System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
