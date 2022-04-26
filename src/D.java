public class D {
     public static void main(String[] args) {
          demo1();

     }
     public static void demo1(){
          try{
               int a= 10/0;

          }catch(ArithmeticException e){
               System.out.println(e);
          }
          System.out.println("other");

     }
}

