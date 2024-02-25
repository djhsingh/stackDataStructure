package djh.train.ds;

import java.util.LinkedList;

public class StackChallange {
    public static void main(String[] args) {
        System.out.println(checkForPallindrome("I did, did I?"));
        System.out.println(checkForPallindrome("racecar"));
        System.out.println(checkForPallindrome("hello"));
    }

    private static boolean checkForPallindrome(String string) {
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder builder = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();
        for (int i =0;i<lowerCase.length();i++){
            char character = lowerCase.charAt(i);
            if( character >='a' && character <='z'){
                builder.append(character);
                stack.push(character);
            }
        }
        StringBuilder reversebuilder = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reversebuilder.append(stack.pop());
        }

        if(builder.toString().equals(reversebuilder.toString())){
            return true;
        }
        return false;
    }


}
