public class Factorial {

    public static void main(String[] args) {
        DataInputStream d=new DataInputStream(System.in); 
        int num = d.readLine(), i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
