/**
 * Created by Doc on 2/25/16.
 */
public class SingleNumberFinder {
    public int convertToSingleDigit(long number){
        long result = number;
        //While number is not a single digit
        while(!isNumSingleDigit(result)){
            String stringNum = convertNumToString(result);
            int[] subNums = convertToArrayOfSubNumbers(stringNum);
            result = addSubNumbers(subNums);
        }

        return (int)result;
    }

    public boolean isNumSingleDigit(long number){
       if(number >= 10)
           return false;
        else
           return true;
    }

    public int addSubNumbers(int[] subNumbers){
        int result = 0;

        for(int i = 0; i<subNumbers.length; i= i+2){
            int currentNum = subNumbers[i];
            int next = i + 1;
            //If not last index, add to result.
            if(next < subNumbers.length){
                //Add the current plus next
                result += currentNum + subNumbers[next];
            }
            //If the last number just add it to the result
            if(i == subNumbers.length-1){
                result += subNumbers[i];
            }



        }

        return result;
    }

    public int[] convertToArrayOfSubNumbers(String number){
        int[] numberContainer = new int[number.length()];

        for(int i = 0; i<number.length(); i++){
            String singleNumber = Character.toString(number.charAt(i));
            numberContainer[i] = convertStringToInt(singleNumber);

        }

        return numberContainer;
    }

    public int convertStringToInt(String singleNum){
        return Integer.parseInt(singleNum);
    }

    public String convertNumToString(long number){
        return  Long.toString(number);
    }
}
