public class Main {
    static String reverseStringBuffer(String string)
    {
        StringBuffer buff=new StringBuffer(string);
        return buff.reverse().toString();
    }
    static String reverseIterative(String string)
    {
        char[] chars = string.toCharArray();
        for (int i=0;i<chars.length/2;i++)
        {
            char temp=chars[i];
            chars[i]=chars[chars.length-1-i];
            chars[chars.length-1-i]=temp;
        }
        return String.valueOf(chars);
    }
    static String reverseRecursive(String string)
    {
        String result=new String("");
        if (string.length()==0)
        {
            return "";
        }
        return (String
                .valueOf(string.charAt(string.length()-1)))
                .concat(reverseRecursive(string.substring(0,string.length()-1)));
    }
    public static void main(String[] args) {
        System.out.println(reverseStringBuffer("Hello World!"));
        System.out.println(reverseIterative("Hello World!"));
        System.out.println(reverseRecursive("Hello World!"));
    }
}
