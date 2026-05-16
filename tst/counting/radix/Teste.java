class Teste {
    public static void main(String[] args) {
        int n = 8936;

        for (int exp = 1; n / exp > 0; exp *= 10) {
            System.out.println((n / exp) % 10);
        }
    }
}
