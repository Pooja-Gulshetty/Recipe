 class NullPointerException2 {

         public static NullPointerException2 initT() {     //method returns a null object
             return null;
         }

         public void print(String s) {
             System.out.println(s.toLowerCase());
         }
     }

     class Main {
         public static void main(String[] args) {
             NullPointerException2 t = NullPointerException2.initT();    //create a new object (null object)
             t.print("Hello, World!");       //invoke  method using null object
         }
     }

