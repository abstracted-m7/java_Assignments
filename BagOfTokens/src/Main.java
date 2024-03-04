/**
 * BagOfTokens
 */
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int tokens[]={400,200,300,100};
        System.out.println("The tokens is : "+Arrays.toString(tokens));
        Arrays.sort(tokens);
        int power = 200;
        System.out.println("Total power we have : "+power);
        int result = 0 , score = 0;
        int left = 0 , right = tokens.length-1;

        while (left <= right) {
            if (power  >= tokens[left]) {
                power -=  tokens[left];
                left ++;
                score++;
                result = Math.max(result , score);
            }
            else if (score > 0) {
                power += tokens[right];
                right -- ;
                score --;
            }
            else{
                break;
            }
        }
        System.out.println("Total using tokens : "+result);
    }
}