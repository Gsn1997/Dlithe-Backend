import javax.xml.bind.SchemaOutputResolver;

public class Test {

     String id = null;
     public void testE(){
         try{
             id.length();
         }
         catch(NullPointerException abc){
             System.out.println(abc.getMessage());
         }
//         System.out.println(id.length());

     }

    public static void main(String[] args) {
        new Test().testE();
    }





}
