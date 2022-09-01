/*
 * Program to print all the first 20 divisibles of 5 without using looping structures.
 * @Ashutosh kumar
 * */
package Simple.electronicsstore;
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class IllustrateStream {
	public static void main(String[] args) {
		//Iterating the stream from 1, filtered the required values and printed it.
		Stream.iterate(1,i->i+1).filter(i->i%5==0).limit(20).forEach(out::println); 
	}
}
