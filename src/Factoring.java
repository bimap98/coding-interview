public class Factoring {

    public static void main(String[] args) {
        testFaktorial();
    }

    public static void Faktorial(int n) {
        for (int faktor = 2; faktor <= n / faktor; faktor++) {
            while (n % faktor == 0) {
                n /= faktor;
                System.out.print(faktor + " ");
                break;
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
    }

    public static void faktorialWhile(int n, int faktor) {
        while (faktor <= n / faktor) {
            while (n % faktor == 0) {
                n /= faktor;
                System.out.print(faktor + " ");
                faktor++;
                break;
            }
            while (n % faktor != 0) {
                faktor++;
                while (n % faktor == 0) {
                    n /= faktor;
                    System.out.print(faktor + " ");
                    faktor++;
                    break;
                }
            }
        }

        if (n > 1) {
            System.out.print(n);

        }
    }

    public static int rekursifFaktorial(int n, int faktor) {
        if ((faktor <= n / faktor) && (n % faktor == 0)) {
            n /= faktor;
            System.out.print(faktor + " ");
            faktor++;
            return rekursifFaktorial(n, faktor);
        } else {
            faktor++;
            if ((faktor <= n / faktor) && (n % faktor == 0)) {
                n /= faktor;
                System.out.print(faktor + " ");
                faktor++;
                return rekursifFaktorial(n, faktor);
            }
        }
        System.out.print(n + " ");
        return n;
    }


    public static void testFaktorial() {

        rekursifFaktorial(1000, 2);
        System.out.println();
        Faktorial(1000);
        System.out.println();
        faktorialWhile(1000, 2);

    }

}
