public class Operator {

    static String convertToBinaryUsingString(int no){
        StringBuilder result = new StringBuilder();

        for(int a = 0; a < 8; a++)
        {
//            if(no % 2 == 1)
//            {
//                result.append('1');
//            }
//            if(no % 2 == 0)
//            {
//                result.append('0');
//            }
//            no = no / 2;
//            while (no > 0 ) {
            int ch = no & 1;
            result.append(ch);
        no = no >>> 1;

    }
//        StringBuilder b =result.reverse();
//        String b2 = new String(b);

        return result.reverse().toString();
    }
    static char xor_c(char a, char b)
    {
        return (a == b) ? '0' : '1';
    }

    static String binaryToGray(int no){
        StringBuilder result = new StringBuilder();

        for(int a = 0; a < 8; a++)
        {
            if(no % 2 == 1)
            {
                result.append('1');
            }
            if(no % 2 == 0)
            {
                result.append('0');
            }
            no = no / 2;
        }
        result.reverse();
        String gray = "";


        gray += result.charAt(0);


        for (int i = 1; i < result.length(); i++) {

            gray += xor_c(result.charAt(i - 1),
                    result.charAt(i));
        }
        String b3 = new String(gray);
        return b3;
    }


}


