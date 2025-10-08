public class Null {
  public static void main(String[] args){
    try{
      String a = "Viresh";
      System.out.println(a.length() + ": Length of Viresh");
      System.out.println(a.charAt(18));
    }
    catch(NullPointerException e){
      System.out.println("This is a error:   " + e);
    }
  }
}
