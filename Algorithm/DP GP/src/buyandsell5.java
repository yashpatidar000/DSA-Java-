import java.util.*;
public class buyandsell5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();   
        }
        int leastsf=arr[0];
        int mpist=0;
        int[] dpmpisut = new int[n];
        for(int i=1;i<n;i++){
          if(arr[i]<leastsf){
              leastsf=arr[i];
          }  
          mpist=arr[i]-leastsf;  
          if(mpist > dpmpisut[i-1]){
              dpmpisut[i]=mpist;
          }else{
              dpmpisut[i]=dpmpisut[i-1];
          }
        }
        
        int mpibt=0;
        int maxat=arr[n-1];
        int[] mpistoat = new int[n];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>maxat){
                maxat=arr[i];
            }
            mpibt=maxat-arr[i];
            
            if(mpibt>mpistoat[i+1]){
                mpistoat[i]=mpibt;
            }else{
                mpistoat[i]=mpistoat[i+1];

            }
        }
        int op=0;
        for(int i=0;i<n;i++){
            if(dpmpisut[i] + mpistoat[i]>op){
                op=dpmpisut[i] + mpistoat[i];
            }
        }
        System.out.println(op);
    }
}
