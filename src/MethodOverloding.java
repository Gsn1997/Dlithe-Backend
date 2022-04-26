public class MethodOverloding {

 int show(int a, int b) {
  int c;

  c = a + b;
  System.out.println(c);
  return a + b;
 }
  int  show (int a){
  int d =0;
  int b= 10;

   d= a*b;
   System.out.println(d);
   return d;
  }

 public static void main(String[] args) {
  MethodOverloding overloding =new MethodOverloding();
  overloding.show(3);
  overloding.show(3,9);
 }


}
