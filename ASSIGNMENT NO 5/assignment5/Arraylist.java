public class Arraylist{

public static void main(String args[]){
int arr[]={1,2,3,6,8,9};
try
{
System.out.println(arr[7]);
}
catch(Exception e){
System.out.println("trying to acess 7th number but limit is 6");
}
System.out.println(arr[4]);
}
}