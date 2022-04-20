public class TrimmingStringExample {
        public static void main(String[] args)
        {
            String originalString1 = "   howtodoinjava.com";
            String originalString2 = "   howtodoinjava.com   ";

            System.out.println(removeLeadingSpaces(originalString1));
            System.out.println(removeLeadingSpaces(originalString2));
        }
        public static String removeLeadingSpaces(String param)
        {
            if (param == null) {
                return null;
            }

            if(param.isEmpty()) {
                return "";
            }

            int arrayIndex = 0;
            while(true)
            {
                if (!Character.isWhitespace(param.charAt(arrayIndex++))) {
                    break;
                }
            }
            return param.substring(arrayIndex-1);
        }
    }

