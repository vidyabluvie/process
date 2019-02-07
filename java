public class Prime 
{
public static void main(String[] args)
{
DataInputStream din= new DataInputStream(System.in);
int lower=din.readLine(), higher=din.readLine();
while (lower<higher) 
{
boolean flag = false;
for(int i=2; i<=lower/2;++i) 
{
if(lower % i == 0) 
{
flag = true;
break;
}
}
if (!flag)
System.out.println(lower + " ");
++lower;
}
}
}
