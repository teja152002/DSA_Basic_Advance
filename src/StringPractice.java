
import java.util.Arrays;
public class StringPractice {
    static void main(String[] args) {
        String s = "12345";

        /**
         * 12345
         * 1234
         * 123
         * 12
         * 1
         */

//        for(int i=0;i<=s.length();i++) {
//            System.out.println(s.substring(0,i));
//        }
        System.out.println("------");
        for(int i=s.length();i>0;i--){
            System.out.println(s.substring(0,i));
        }

    }
}
