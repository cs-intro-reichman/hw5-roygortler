/**
 * A library of string functions.
 */
public class MyString {
    public static void main(String args[]) {
        String hello = "hello";
        System.out.println(countChar(hello, 'h'));
        System.out.println(countChar(hello, 'l'));
        System.out.println(countChar(hello, 'z'));
        System.out.println(spacedString(hello));
        //// Put your other tests here.
    }

    /**
     * Returns the number of times the given character appears in the given string.
     * Example: countChar("Center",'e') returns 2 and countChar("Center",'c') returns 0. 
     * 
     * @param str - a string
     * @param c - a character
     * @return the number of times c appears in str
     */
    public static int countChar(String str, char c) {
        int x=0;
        for(int i=0;i<str.length();i++){
          if(str.charAt(i)==c)
          x++;
        }return x;
      }
     
      /** Returns true if str1 is a subset string str2, false otherwise.
       *  For example, "spa" is a subset of "space", and "pass" is not
       *  a subset of "space".
       *
       * @param str1 - a string
       * @param str2 - a string
       * @return true is str1 is a subset of str2, false otherwise
       */
      public static boolean subsetOf(String str1, String str2) {
        for(int i = 0; i < str1.length(); i++){
            if(countChar(str2, str1.charAt(i)) < countChar(str1, str1.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
      /** Returns a string which is the same as the given string, with a space
       * character inserted after each 
       * character in the given string, except
       * for last character of the string, that has no space after it. 
       * Example: if str is "silent", returns "s i l e n t".
       * 
       * @param str - a string
       * @return a string consisting of the characters of str, separated by spaces.
       */
      public static String spacedString(String str) {
          int c=0;
          String str1=""; 
          if(str.isEmpty())
          return str1; 
             while(c<str.length()-1){
              str1=str1+str.charAt(c)+" ";
              c++;
              
          }str1=str1+""+str.charAt(c);
          return str1;
      }
    
      /**
       * Returns a string of n lowercase letters, selected randomly from 
       * the English alphabet 'a', 'b', 'c', ..., 'z'. Note that the same
       * letter can be selected more than once.
       * 
       * @param n - the number of letter to select
       * @return a randomly generated string, consisting of 'n' lowercase letters
       */
      public static String randomStringOfLetters(int n) {
          String str="";
          for(int i=0;i<n;i++){
              int x=(int)(Math.random()*26)+97;
              str=str+""+(char)x;
          }return str;
      }
  
      /**
       * Returns a string consisting of the string str1, minus all the characters in the
       * string str2. Assumes (without checking) that str2 is a subset of str1.
       * Example: "committee" minus "meet" returns "comit". 
       * 
       * @param str1 - a string
       * @param str2 - a string
       * @return a string consisting of str1 minus all the characters of str2
       */
      public static String remove(String str1, String str2) {
        if(str2.isEmpty())
        return str1;
        if(str1.charAt(0)==str2.charAt(0))
        {str1=str1.substring(1);}
          for(int i=0;i<str2.length();i++){
              for(int j=0;j<str1.length();j++){
                  if(str2.charAt(i)==str1.charAt(j))
                  str1= str1.substring(0, j) + str1.substring(j + 1);
                  
                 }   }
          
          return str1;}
      
  

    /**
     * Returns a string consisting of the given string, with the given 
     * character inserted randomly somewhere in the string.
     * For example, insertRandomly("s","cat") can return "scat", or "csat", or "cast", or "cats".  
     * @param ch - a character
     * @param str - a string
     * @return a string consisting of str with ch inserted somewhere
     */
    public static String insertRandomly(char ch, String str) {
         // Generate a random index between 0 and str.length()
         int randomIndex = (int) (Math.random() * (str.length() + 1));
         // Insert the character at the random index
         String result = str.substring(0, randomIndex) + ch + str.substring(randomIndex);
         return result;
    }    
}
