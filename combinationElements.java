/* Write a java program to generate all combination of 1,2 and 3 using for loop */

/**
 * combinationElements
 */
public class combinationElements {
    public static void main(String[] args) {
        int numbers[]={1,2,3};
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                for(int k=0;k<numbers.length;k++){
                    System.out.println(numbers[i]+" "+numbers[j]+" "+numbers[k]);
                }
            }
        }
    }
    
}