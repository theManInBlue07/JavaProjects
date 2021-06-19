package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    printMegaBytesAndKiloBytes(2500);
    printMegaBytesAndKiloBytes(-1024);
    printMegaBytesAndKiloBytes(952);
    printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0){
            System.out.println("Invalid Parameter ");
        }
        int megaBytes = kiloBytes/1024;
        int leftKilobytes = kiloBytes%1024;
        System.out.println("the result is "+megaBytes+" MB & "+leftKilobytes+"KB.");
    }
}
