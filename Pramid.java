public class Pramid {
public static void main (String args[]) {
int n = 6;
for (int i=1; i <= n; i++) {
for (int j=1; j <= 2 * i-1; j++){
System.out.print(" ");
}
for (int k =1; k <= i; k++){
System.out.print("*");
}
System.out.println();
}
}
}