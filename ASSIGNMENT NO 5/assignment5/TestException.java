public class TestException{

public static void main(String args[]){
int a=10;
int b=0;
try{
int c=a/b;
System.out.println("Division is:"+c);
}
catch(Exception e)
{
System.out.println("Its a arithmetic error");
}
int d=a+b;
System.out.println("Addition is:"+d);
}
}