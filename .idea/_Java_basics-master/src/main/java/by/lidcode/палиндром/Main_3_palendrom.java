package by.lidcode.палиндром;

public class Main_3_palendrom {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        //  нужно поменять значения пременных местами не вводя третей переменной
        a = a + b;
        b = a - b;
        a = a - b;

        // проверить что число является палиндромом 121
        int arr = -123;

        int i = arr;
        int res = 0;
        while (i != 0) {//-121
            res = res * 10 + (i % 10); //1  12  120+1   0
            i = i / 10;//12 1
        }
        System.out.println(arr == res);
        System.out.println("==================");

        // проверить что строка является палиндром
        // строка выше должна true вернуть
        String palindrome = "madam,   I'm Adam";
        String cleaned = palindrome.replaceAll("[^A-Za-z]", "").toLowerCase();
        boolean isPalindrome = cleaned.equals(new StringBuilder(cleaned).reverse().toString());
        System.out.println(isPalindrome);

    }

}
