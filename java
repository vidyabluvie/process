public class Prime {

    public static void main(String[] args) {
        DataInputStream d=new DataInputStream(System.in);
        int low =d.readLine(), high =d.readLine();

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(low + " ");

            ++low;
        }
    }
}
