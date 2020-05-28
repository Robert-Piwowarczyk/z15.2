 class PalindromTable {

    public static void main(String[] args) {
        int[] tableNumbers = {5, 6, 7, 8, 7, 6, 5};
    }

    public static boolean tableNumbers(int[] number) {
        boolean palindrom = false;
        if (number.length % 2 == 0) {
            for (int i = 0; i < number.length / 2 - 1; i++) {
                if (number[i] != number[number.length - i - 1]) {
                    return false;
                } else {
                    palindrom = true;
                }
            }
        } else {
            for (int i = 0; i < (number.length - 1) / 2 - 1; i++) {
                if (number[i] != number[number.length - i - 1]) {
                    return false;
                } else {
                    palindrom = true;
                }
            }
        }
        return palindrom;
    }
}
