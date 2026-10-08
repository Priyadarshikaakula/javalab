publicclassNumberCheck {
publicstaticvoid main(String [] args) {
int n = 10;
int sum = 0;

for (int i = 1; i <= n; i++) {
if (i % 2 == 0) {
System.out.println(i + " is Even");
sum = sum + i;
} else {
System.out.println(i + " is Odd");
}
}
System.out.println("Sum of evennumbersfrom 1 to " + n + " = " +
sum);
}
}
