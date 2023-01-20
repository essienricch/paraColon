package Chapter8;

public class myHugeInteger2 {

//    (myHugeInteger2 Class) Create a class myHugeInteger2 which uses a 40-element array of digits to
//    store integers as large as 40 digits each. Provide methods parse, toString, add and subtract. Method parse should receive a String, extract each digit using method charAt and place the integer
//    equivalent of each digit into the integer array. For comparing myHugeInteger2 objects, provide the following methods: isEqualTo, isNotEqualTo, isGreaterThan, isLessThan, isGreaterThanOrEqualTo
//    and isLessThanOrEqualTo. Each of these is a predicate method that returns true if the relationship
//    holds between the two myHugeInteger2 objects and returns false if the relationship does not hold. Provide a predicate method isZero. If you feel ambitious, also provide methods multiply, divide and
//    remainder. [Note: Primitive boolean values can be output as the word “true” or the word “false” with
//    format specifier %b.

    private final static int  Max_Length = 40;
    private int [] myArray = new int[Max_Length];
    private int count = 0;


    public myHugeInteger2(){
    }

    public int[] getArray(){
        return myArray;
    }

    public void parse(String word){
        for (int i = 0; i < word.length(); i++) {
            myArray[i] = Integer.parseInt(String.valueOf(word.charAt(i)));
        }
    }
    public Integer parses(String word){
        return Integer.parseInt(String.valueOf(word));
    }

    public void add(myHugeInteger2 myHugeInteger2){
         myHugeInteger2 = new myHugeInteger2();
    }

    public void subtract(int word){

    }




}
