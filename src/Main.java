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


//    public static void main(String[] args) throws IOException {
//        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//        BufferedReader in = new BufferedReader(reader);
//        String line;
//
//        while ((line = in.readLine()) != null) {
//            char[] array= line.toCharArray();
//            array[0]=Character.toUpperCase(array[0]);
//            int counter =1;
//
//            for (int i = 1; i < line.length(); i++) {
//                if(array[i] != ' '){
//                    if (counter % 2 == 0 ){
//                        array[i] = Character.toUpperCase(array[i]);
//                        counter++;
//                        //System.out.println(array);
//                    } else {
//                        array[i] = Character.toLowerCase(array[i]);
//                        counter++;
//                        //System.out.println(array);
//                    }
//
//                }
//
//            }System.out.println(array);
//        }
//    }
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);

//https://stackoverflow.com/questions/14743165/simple-number-to-array-with-individual-digits
            int len = Integer.toString(n).length();
            int[] iarray = new int[len];
            boolean isFound = false;

            for (int index = len - 1; index >= 0; index--) {
                iarray[index] = n % 10;
                n /= 10;
            }//end for

            for (int i = iarray.length - 1; i > 0; i--) {
                int temp = 0;
                if (iarray[iarray.length - 1] > iarray[i-1]) {
                    temp = iarray[i-1];
                    iarray[i-1] = iarray[i];
                    iarray[i] = temp;
                    isFound = true;
                    break;
                }
            }

            if (!isFound){
                int min = iarray[iarray.length-1];

                String tempnum = "";
                for (int i = 0; i < iarray.length; i++){
                    tempnum += iarray[i];
                }
                String tempmin = Integer.toString(min);
                tempnum += tempmin;
                int result = Integer.parseInt(tempnum);
                System.out.println(result);

            } else {

                String tempnum = "";
                for (int i = 0; i < iarray.length; i++){
                    tempnum += iarray[i];
                }
                int result = Integer.parseInt(tempnum);
                System.out.println(result);

            }

        }//end while
    }
}