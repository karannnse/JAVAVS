import javax.lang.model.util.ElementScanner14;

public class pattern3 {
      public static void main(String[] args) {
       /*  int n=9;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
            
                if(i==0||j==0||i==n-1||j==n-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

      /*   int n=10;      

        for(int i=0; i<n;i++)
        {
            for(int j=0 ; j<n ; j++)
            {

                if(  i==0||j==0|| j==n-1|| i==(n-1)/2 )
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        int n=10;      

        for(int i=0; i<n;i++)
        {
            for(int j=0 ; j<n ; j++)
            {

                if( j==0|| j==n-1|| i==(n-1)/2 )
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }





      }
    
}
