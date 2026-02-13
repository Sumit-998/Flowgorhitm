import java.util.Scanner;
class Arm{

    public static void main(String[]args){
        for(int i=1;i<=5;i++){
 for(int j=1;j<=5;j++){
  System.out.print("* ");
 }
 System.out.println();
}
for (int i=1;i<=5;i++){
    for (int j=1;j<=5;j++){
  if (i==1 || i==5 || j==1 || j==5){
    System.out.print("*");
   } else{
    System.out.print(" ");
   }
  } 
   System.out.println();
    }
for(int i=1;i<=5;i++){
 for(int j=1;j<=5;j++){
  System.out.print(j);
 }
 System.out.println();
}
for(int i=1;i<=5;i++){
 for(int j=1;j<=i;j++){
  System.out.print(j+" ");
 }
 System.out.println();
}
for(int i=1;i<=5;i++){
 for(int j=1;j<=i;j++){
  System.out.print(i);
 }
 System.out.println();
}

for(int i=1;i<=5;i++){
 for(int j=i;j<5;j++){
  System.out.print(" ");
 }
 for(int k=1;k<=2*i-1;k++){
  System.out.print("*");
 }
 System.out.println();
}

for (int i=5;i>=1;i--){
    for (int j=i;j<5;j++){
        System.out.print(" ");
    }
    for (int k=1;k<=2*i-1;k++){
        System.out.print("*");
}
System.out.println();
}

for (int i=1;i<=3;i++){
    for (int j=i;j<=3;j++){
        System.out.print(" ");
    }
    for (int k=1;k<=2*i-1;k++){
        System.out.print("*");
    }
    System.out.println();
}
for (int i=2;i>=1;i--){
    for (int j=i;j<=3;j++){
        System.out.print(" ");
}
for (int k=1;k<=2*i-1;k++){
    System.out.print("*");
}
System.out.println();
    }
int num=1;
for (int i=1;i<=4;i++){
    for (int j=1;j<=i;j++){
        System.out.print(num++);
    }
    System.out.println();
}
for (int i=1;i<=4;i++){
    for (int j=1;j<=i;j++){
        if ((i+j)%2==0){
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
    System.out.println();
}

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int num=sc.nextInt();
int count=0;
int sum=0;
int reverse=0;
int dig=0;
while (num>0){
    dig=num%10;
    sum+=dig;
    reverse = reverse*10+dig;
    num = num/10;
    count++;
    
}
System.out.println("Your sum of numbers is: "+sum);
System.out.println("Your reversed number is: " +reverse);
System.out.println("Your count is: "+ count);
}
}