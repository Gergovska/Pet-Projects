/**
 * @author Oleksandra Gergovska
 */
import java.lang.String;
public class mainString {
        private String str1="sldkfdlkldklak";
        private String str2="dlksj;dfk;aldkjfa";


        public static void main (String[] args) {
            mainString obj = new mainString();
            int lenStr1 = obj.str1.length();
            int lenStr2 = obj.str2.length();
            System.out.println("First string is :" + obj.str1);
            System.out.println("Second string is :" + obj.str2);
            if ( lenStr1 == lenStr2 ) {
                System.out.println("Stings are equal");
            }
            if ( lenStr1 < lenStr2 ){
                for ( int i = 0; i < lenStr2-lenStr1;i++ ){
                    System.out.println("i=" +i+" "+ obj.str2);
                }
            } else {
                for ( int i = 0; i < lenStr1-lenStr2; i++ ){
                    System.out.print("i=" +i+" "+ obj.str1);
                }
            }
        }
    }
