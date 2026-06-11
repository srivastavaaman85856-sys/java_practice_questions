class leftarrowstar {
    public static void main(String[] args){
        int n=6;
        for(int i=1;i<n;i++){
            for(int j=i-1;j<n;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-2;i>=1;i--){
            for(int j=i-1;j<n;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }
    
}
