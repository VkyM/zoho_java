import java.util.Scanner;
class Pattern1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enthe the value: ");
        int n = sc.nextInt();
        int j=0;
        for (int i=0; i<n; i++){
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            j=0;
        }
    }
    
}