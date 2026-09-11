// import java.util.*;

public class Kanchan {

    public static void Jadu ( int n ) {
        for( int i = 1; i<=n; i++) {
            for( int j = 1; j <= n-i; j++) {
                System.out.print(
                    " "
                );
            }

            for( int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
        

            System.out.println(" ");
        }
    }


    
    public static void main ( String args[]) {
        int n = 4;
        // Kanchan obj = new Kanchan();
        Kanchan.Jadu(n);
    }

}

// Summury : 
          // 

          