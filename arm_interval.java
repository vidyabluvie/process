public class Armnum {
public static void main(String args[]) {
int n,r,x,s;
System.out.println("Armstrong number are:");

for(n=1;n<=1000;n++){
s=0;

x=n;

while(x!=0){

r=x%10;

s=s+r*r*r;

x=x/10;

}

if(s==n)

System.out.println(n);

}}}
