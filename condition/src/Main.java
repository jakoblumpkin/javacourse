public class Main {

    public static void main(String[] args) {
        int v1 = 7;
        int v2 = 7;

        int result = v1 > v2 ? v1 : v2;
        System.out.print(result);

        if (v1 > v2) {
            System.out.print("\n"+ v1);
        } else if (v1 < v2) {
            System.out.print("\n"+ v2);
        } else {
            System.out.print("\n v1 and v2 are equal.");
        }
    }
}
