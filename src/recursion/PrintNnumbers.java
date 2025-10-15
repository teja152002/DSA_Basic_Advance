package recursion;


public class PrintNnumbers {
    public static void print(int n){
        if(n==0)
            return;
        System.out.println(n);
        print(n-1);
    }

    public static void printFwd(int n, int count){

        if(count==n){
            return;
        }
        count++;
        System.out.println(count);
        printFwd(n, count);
    }
    public static void printName(int n){
        if(n==0){
            return;
        }
        System.out.println("Teja");
        printName(n-1);
    }
    public static void backTrackFwdPrint(int i, int n){
        if(i<1){
            return;
        }
        backTrackFwdPrint(i-1, n);
        System.out.println(i);

    }
    public static void backTrackRevPrint(int i, int n) {
        if(i>n){
            return;
        }
        backTrackRevPrint(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        System.out.println("Backward Direction : ");
        print(5);
        int count = 0;
        System.out.println("Forward Direction : ");
        printFwd(5, count);

        System.out.println("Print Name n Times : ");
        printName(5);

        System.out.println("Printing forward direction numbers using bracktrack concept : ");
        backTrackFwdPrint(5,5);

        System.out.println("Printing reverse direction numbers using bracktrack concept : ");
        backTrackRevPrint(1,5);

    }
}
