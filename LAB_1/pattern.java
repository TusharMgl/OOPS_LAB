class pyramid{
    public static void main(String agrs[]){
       
         for (int i = 5; i >= 1; i--) {
            
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
          
            for (int j = 1; j <= i; j++) {
              //  System.out.print(i);
                System.out.print("*");
            }
           
            System.out.println();
        }

    }
}