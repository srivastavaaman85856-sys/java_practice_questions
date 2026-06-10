import java.util.Scanner;
class SearchArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr ={10,20,30,40,50,60};
        System.out.println("enter the element you have to  find ");
        int key=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                found=true;
                break;
            }
            

        }
        if(found){
            System.out.println("element found");
        }
        else{
            System.out.println("element not found");
        }
        sc.close();

    }
    
}
