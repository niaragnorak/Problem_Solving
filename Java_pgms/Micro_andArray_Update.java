import java.util.*;
class TestClass {
    static int minVal(int []arr){
        int min=arr[0];
        //System.out.println(min);
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        
        return min;
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int []ar=new int[n];
            for(int j=0;j<n;j++){
                ar[j]=sc.nextInt();
            }
            int minimum=minVal(ar);
            if(minimum>=k){
                System.out.println(0);
            }else{
                System.out.println(k-minimum);
            }
        }
    }
}
