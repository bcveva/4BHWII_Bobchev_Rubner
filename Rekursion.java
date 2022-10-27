public class Rekursion {
    public static void main(String[] args) {
        System.out.println(sumRekursion(6));
    }
    public static int sumRekursion(int n){
        if(n == 0){
            return 0;
        }
        return sumRekursion(n - 1) + n;
    }
}
