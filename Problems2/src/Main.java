import java.util.Scanner;

public class Main {
    public static void ex1() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n=sc.nextInt();
        while (n<1) {
            System.out.println("Please enter an integer: ");
            n=sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
    public static void ex1_1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n=sc.nextInt();
        while (n<1) {
            System.out.println("Please enter an integer: ");
            n=sc.nextInt();
        }
        for (int i=1;i<=n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void ex1_2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n=sc.nextInt();
        while (n<1) {
            System.out.println("Please enter an integer: ");
            n=sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            for (int j=1;j<=n;j++) {
                System.out.print(n*i+j+" ");
            }
            System.out.println();
        }
    }
    public static void ex1_3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter an M=");
        int m=sc.nextInt();
        System.out.println("Please enter N=");
        int n=sc.nextInt();
        while (m<1) {
            System.out.println("Please enter M=");
            m=sc.nextInt();
        }
        while (n<1) {
            System.out.println("Please enter N=");
            n=sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            for (int j=1;j<=m;j++) {
                System.out.print(i*m+j+" ");
            }
            System.out.println();
        }
    }
    public static void ex1_4(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter N=");
        int n=sc.nextInt();
        int counter =1;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void ex1_5()
    {
        System.out.println("Please enter N=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            int counter=i+1;
            for (int j=0;j<n;j++){
                if (counter==7) {
                    counter=1;
                }
                System.out.print(counter+" ");
                counter++;
                }
            System.out.println();
            }
        }
        public static void ex2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter N=");
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++){
                if (i==j)
                {
                    System.out.print(1+" ");
                }
                else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
        }
        public static void ex3(){
        int n=2;
            Scanner sc=new Scanner(System.in);
            while (n%2==0) {
                System.out.println("Please enter uneven N=");
                n = sc.nextInt();
            }
            for (int i=0;i<n;i++) {
                for (int j=0;j<n;j++){
                    if (j==i||j==n-i-1)
                    {
                        System.out.print(1+" ");
                    }
                    else {
                        System.out.print(0+" ");
                    }
                }
                System.out.println();
            }
        }
        public static void ex3_1(){
            int n=2;
            Scanner sc=new Scanner(System.in);
            while (n%2==0) {
                System.out.println("Please enter uneven N=");
                n = sc.nextInt();
            }
            for (int i=0;i<n;i++) {
                for (int j=0;j<n;j++){
                    if (j>=i)
                    {
                        System.out.print(1+" ");
                    }
                    else {
                        System.out.print(0+" ");
                    }
                }
                System.out.println();
            }
        }
        public static void ex3_2(){
            int n=2;
            Scanner sc=new Scanner(System.in);
            while (n%2==0) {
                System.out.println("Please enter uneven N=");
                n = sc.nextInt();
            }
            for (int i=0;i<n;i++) {
                for (int j=0;j<n;j++){
                    if (i==j)
                    {
                        System.out.print(2+" ");
                    }
                    else if(j>=i) {
                        System.out.print(1+" ");
                    }
                    else {
                        System.out.print(0+" ");
                    }
                }
                System.out.println();
            }
        }
        public static void ex3_3(){
            int n=2;
            Scanner sc=new Scanner(System.in);
            while (n%2==0) {
                System.out.println("Please enter uneven N=");
                n = sc.nextInt();
            }
            for (int i=0;i<n;i++) {
                for (int j=0;j<n;j++){
                    if (j<n-i)
                    {
                        System.out.print(1+" ");
                    }
                    else {
                        System.out.print(0+" ");
                    }
                }
                System.out.println();
            }
        }
        public static void ex3_4(){
            int n=2;
            Scanner sc=new Scanner(System.in);
            while (n%2==0) {
                System.out.println("Please enter uneven N=");
                n = sc.nextInt();
            }
            for (int i=0;i<n/2;i++) {
                for (int j=0;j<n;j++){
                    if (j>=i&&j<n-i)
                    {
                        System.out.print(1+" ");
                    }
                    else {
                        System.out.print(0+" ");
                    }
                }
                System.out.println();
            }
            for (int i=n/2;i<n;i++) {
                for (int j=0;j<n;j++){
                    if (j<i+1&&j>=n-i-1)
                    {
                        System.out.print(1+" ");
                    }
                    else {
                        System.out.print(0+" ");
                    }
                }
                System.out.println();
            }
        }
        public static void ex4(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter N=");
        int n=sc.nextInt();
        System.out.println("Please enter M=");
        int m=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i<m||i>=n-m){
                    System.out.print("*");
                }
                else if (j<m||j>=n-m)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
        public static void ex5(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter N=");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==0&&j==0||i==0&&j==n-1||i==n-1&&j==0||i==n-1&&j==n-1) {
                    System.out.print("+");
                }
                else if (i==0||i==n-1){
                    System.out.print("-");
                }
                else if (j==0||j==n-1){
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
        public static void ex6(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter N=");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j<=i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        }
        public static void ex7(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter N=");
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    if (j+i<n-1) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
        public static void ex8(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter N=");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int k=n-i-1;k>0;k--) {
                System.out.print(" ");
            }
            for (int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
        public static void ex9(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter N=");
        int n=sc.nextInt();
            for (int i=0;i<n;i++){
                for (int k=n-i-1;k>0;k--) {
                    System.out.print(" ");
                }
                for (int j=0;j<i*2+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i=n;i<2*n-1;i++){
                for (int k=i-n;k>=0;k--) {
                    System.out.print(" ");
                }
                for (int j=2*n-2*(i-n)-3;j>0;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void ex10(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter N=");
            int n=sc.nextInt();
            for (int i=0;i<n;i++){
                for (int k=n-i-1;k>0;k--) {
                    System.out.print(" ");
                }
                for (int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.print("|");
                for (int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void ex11() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter N=");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = n - i - 1; j > 0; j--) {
                    System.out.print("=");
                }
                if (i == n - 1) {
                    for (int k = 0; k < 2*n-1; k++) {
                        System.out.print("X");
                    }
                } else {
                    System.out.print("X");
                    for (int k = 0; k < 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                    if (i != 0) {
                        System.out.print("X");
                    }
                }
                for (int j = n - i - 1; j > 0; j--) {
                    System.out.print("=");
                }
                System.out.println();
            }
        }
        public static void ex12(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter N=");
            int n = sc.nextInt();
            for (int i = 0; i <=n/2; i++) {
            for (int k=0;k<=i;k++){
                System.out.print(" ");
            }
            for (int j=0;j<3;j++){
                System.out.print("X");
                for (int k=0;k<n/2-i;k++){
                    System.out.print(" ");
                }
            }
            System.out.println();
            System.out.println();
            }
            for (int i = n/2+1; i <n; i++) {
                for (int k=0;k<n-i;k++){
                    System.out.print(" ");
                }
                for (int j=0;j<3;j++){
                    System.out.print("X");
                    for (int k=0;k<i-n/2;k++){
                        System.out.print(" ");
                    }
                }
                System.out.println();
                System.out.println();
            }
        }
        public static void ex13(){
        int n=1;
            Scanner sc = new Scanner(System.in);
            while(n%2!=0) {
                System.out.println("Please enter even N=");
                n = sc.nextInt();
            }
            for (int i=1;i<=n;i++){
                for (int j=1;j<=n;j++){
                    if ((i<=n/2&&j<=n/2)||(i>n/2&&j>n/2)){
                        System.out.print("*");
                    }
                    else {
                        System.out.print("X");
                    }
                }
                System.out.println();
            }
        }
        public static void ex14(){
            int n=1;
            Scanner sc = new Scanner(System.in);
            while(n%2!=0) {
                System.out.println("Please enter even N=");
                n = sc.nextInt();
            }
            for (int i=1;i<=n;i++){
                for (int j=1;j<=n;j++){
                    if (i<=n/2&&j<=n/2){
                        System.out.print("*");
                    }
                    else {
                        System.out.print("=");
                    }
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        //ex14();
    }
}
