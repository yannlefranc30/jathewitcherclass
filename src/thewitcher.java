import java.util.ArrayList;
import java.util.List;

public class thewitcher {

    public static void main( String [] args ) {

        // List<Integer> collection = Arrays.asList( 10, 20, 30, 40, 50, 60 );
        List<Integer> collection = new ArrayList<>();
        collection.add( 10 );
        collection.add( 20 );
        collection.add( 30 );
        collection.add( 40 );
        collection.add( 50 );

        for( int value : collection ) {
            System.out.println( value ); // je vais chercher les collections via value.
        }
    }
}