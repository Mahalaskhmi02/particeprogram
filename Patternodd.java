public class Patternodd {
public static void main (String args[]) {
int n = 6;
for (int i=2; i <= n; i++) {
for (int j=1; j <= 2 * i-1; j++){
System.out.print("*");
}
System.out.println();
}
}
}