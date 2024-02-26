package task2;

public class StringToInt {
    /**
     * converts an array of strings to an array of integers
     * if a string is null or not a number, the integer is 0
     * @param numbers array of strings, that should be converted to integers
     * @return array of integers, which has been converted from an array of strings
     */
    static int[] parseInts(String... numbers){
        String[] stringArr = numbers.clone();
        int[] resArr = new int[stringArr.length];
        for(int i=0;i<stringArr.length;i++){
            try{
                resArr[i]=Integer.parseInt(stringArr[i]);
            }catch(NumberFormatException e){
                resArr[i]=0;
            }
        }
        return resArr;
    }
}
