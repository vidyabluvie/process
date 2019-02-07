public class Prime 
{
public static void main(String[] args) {
DataInputStream d=new DataInputStream(System.in);
int lower=d.readLine(), higher=d.readLine();
while (low < high) 
{
boolean flag = false;
for(int i = 2; i <= low/2; ++i) 
{
if(low % i == 0) 
{
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
