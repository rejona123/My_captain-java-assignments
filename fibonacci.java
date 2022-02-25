mport java.util.Scanner;

class fibonacci {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = a.nextInt();
        int i = 0, j = 1, nexTerm;
        System.out.println("The Fibonacci series of " +n+ " terms is: ");
        for (int p = 0; p<n; p++ )
        {if (p<=1)
        nexTerm = p;
        else{
            nexTerm = i+j;
            i=j;
            j=nexTerm;
        }
        System.out.println(nexTerm);
    }  
   }
}
