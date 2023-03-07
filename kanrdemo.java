public class kanrdemo {
    public static void main(String[] args) {


        int n=10;
        for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                 if(j==0||i+j==(n-1)/2||i-j==(n-1)/2)
                 {
                     System.out.print("k");
                 }
                 else{
                     System.out.print(" ");
         
                 }
                 System.out.println(" ");
                }
         
            



            for(int k=0;k<n ; k++)
        {
            for(int m=0;m<n ;m++)
            {
                if (k==0 && m>0 && m<(n-1)/2 || m==0 && k>0 || k==(n-1)/2 && m<=(n-1)/2 || m==(n-1)/2 && k>0) 
                {
                    System.out.print("*");

                } else
                 {
                System.out.print(" ");

                }
            }
            System.out.println();
        }
             
            

    }
}
        
}
        
    
    

