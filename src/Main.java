import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    /**
     * Iterate through each line of input.
     */


   public static void main(String[] args) throws IOException {
       InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
       BufferedReader in = new BufferedReader(reader);
       String line;

       while ((line = in.readLine()) != null) {
           char[] array= line.toCharArray();
           array[0]=Character.toUpperCase(array[0]);
           int counter =1;

           for (int i = 1; i < line.length(); i++) {
               if(array[i] != ' '){
                   if (counter % 2 == 0 ){
                       array[i] = Character.toUpperCase(array[i]);
                       counter++;
                       //System.out.println(array);
                   } else {
                       array[i] = Character.toLowerCase(array[i]);
                       counter++;
                       //System.out.println(array);
                   }

               }

           }System.out.println(array);
       }
   }
