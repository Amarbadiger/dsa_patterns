public class triangle{
    // public static void halfTriangle(int n){
    //     for(int i=0;i<n;i++){
    //         for(int j=i;j<n-1;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println("*");
    //     }
    // }
    // public static void halfTriangleNumber(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void halfTriangleAlpha(int n){
    //     char ch='A';
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<=i;j++){
    //             System.out.print(ch);
    //             ch++;
    //         }
    //         ch='A';
    //         System.out.println();
    //     }
    // }
        // public static void hallowReactangle(int n,int r){
        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<=r;j++){
        //             if(i==1 || i==n || j==1 || j==r){
        //                 System.out.print("*");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //         System.out.println();
        //     }
        // }
        // public static void invertedTriangle(int n){
        //     for(int i=0;i<n;i++){
        //         for(int j=0;j<=n-i-1;j++){
        //             System.out.print(" ");
        //         }
                
        //         for(int j=0;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        // }
        // public static void invertedNumber(int n){
        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<=n-i+1;j++){
        //             System.out.print(j);
        //         }
        //         System.out.println();
        //     }
        // }
        // public static void floydsTriangle(int n){
        //     int num=1;
        //     for(int i=0;i<n;i++){
        //         for(int j=0;j<=i;j++){
        //             System.out.print(num);
        //             num++;
        //         }
        //         System.out.println();
        //     }
        // }
        // public static void binaryTriangle(int n){
        //     for(int i=0;i<n;i++){
        //         for(int j=0;j<=i;j++){
        //             if((i+j)%2==0){
        //                 System.out.print("1");
        //             }
        //             else{
        //                 System.out.print("0");
        //             }
        //         }
        //         System.out.println();
        //     }
        // }
        // public static void butterfly(int n){
        //     for(int i=0;i<n;i++){
        //         for(int j=0;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         for(int j=0;j<2*(n-i);j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=0;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        //     for(int i=n;i>=0;i--){
        //         for(int j=0;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         for(int j=0;j<2*(n-i);j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=0;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        // }
        // public static void daimond(int n){
        //     for(int i=0;i<n;i++){
        //         for(int j=0;j<n-i;j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=0;j<=i*2;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        //     for(int i=n;i>=0;i--){
        //         for(int j=0;j<n-i;j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=0;j<=i*2;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        // }
        // public static void triangleNumber(int n){
        //     int num=1;
        //     for(int i=0;i<n;i++){
        //         for(int j=0;j<n-i;j++){
        //             System.out.print(" ");
        //         }
        //         for(int j=0;j<=i;j++){
        //             System.out.print(num+" ");
        //         }
        //         System.out.println();
        //         num++;
        //     }
        // }
        // public static void palindromeNumberTriangle(int n){
        //     int num=2;
        //     for(int i=n;i>0;i--){
        //         for(int j=i;j>0;j--){
        //             System.out.print(" ");
        //         }
        //         for(int j=n-i+1;j>0;j--){
        //             System.out.print(j);
        //         }
        //          for(int k=0;k<n-i;k++){
        //              System.out.print(num);
        //              num++;
        //          }
        //          num=2;
        //         System.out.println();
        //     }
        // }
        public static void palindromeNumberTriangle(int n){
            
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                 for(int k=2;k<=i;k++){
                    System.out.print(k);
                   
                 }
                System.out.println();
            }
        }
    public static void main(String args[]){
        // hallowReactangle(5,3);
        // invertedTriangle(5);
        //invertedNumber(5);
        //floydsTriangle(4);
        //binaryTriangle(5);
        // butterfly(5);
        //daimond(5);
        //triangleNumber(5);
        palindromeNumberTriangle(5);
    }
}