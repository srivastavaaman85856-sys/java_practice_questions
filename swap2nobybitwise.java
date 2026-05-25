public class swap2nobybitwise {
    public static void main(String[] args){
        int m=10;
        int n=15;
        System.out.println("before swapping m is = "+m+ " and n is ="+n);
        m=m^n;
        n=m^n;
        m=m^n;
        System.out.println("after swapping m is =" +m+" and n is ="+n);

    }
    
}
