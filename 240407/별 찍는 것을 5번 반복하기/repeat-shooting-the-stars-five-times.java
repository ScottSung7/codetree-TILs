public class Main {
    public static void main(String[] args) {
        printTenStars(5);

    }


private static void printTenStars(int n){
    for(int j =0; j < n; j++){
        for(int i =0; i < 10; i++){
            System.out.print("*");
        }
        System.out.println();
    }


}
}