public class Duplicate {
public static void main (String args[]) {
String str = "maha";
String reversedstr=" ";
for(int i = str.length()-1; i>=0; i--)
{
reversedstr=reversedstr+str.charAt(i);
}
System.out.println("original string:" +str);
System.out.println("reversed str:" +reversedstr);
}
}