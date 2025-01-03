package src;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        int step = 99; // шаг для сдвига


        String encrypted = encrypt(str, step);
        System.out.println("Зашифрованная строка: " + encrypted);

        String decrypted = decrypt(encrypted, step);
        System.out.println("Расшифрованная строка: " + decrypted);
    }

    public static String encrypt(String str, int step) {
        char[] newst = new char[str.length()];
        int i = 0;

        for (char let : str.toCharArray()) {
            int asciiCode = (int) let;
            int new1 = asciiCode;

            if (1072 <= asciiCode && asciiCode <= 1103) {
                new1 = 1072 + (asciiCode - 1072 + step) % 32;
                if (new1 < 1072) {
                    new1 += 32;
                }
            } else if (1040 <= asciiCode && asciiCode <= 1071) {
                new1 = 1040 + (asciiCode - 1040 + step) % 32;
                if (new1 < 1040) {
                    new1 += 32;
                }
            } else if (97 <= asciiCode && asciiCode <= 122) {
                new1 = 97 + (asciiCode - 97 + step) % 26;
                if (new1 < 97) {
                    new1 += 26;
                }
            } else if (65 <= asciiCode && asciiCode <= 90) {
                new1 = 65 + (asciiCode - 65 + step) % 26;
                if (new1 < 65) {
                    new1 += 26;
                }
            }
            newst[i] = (char) new1;
            i++;
        }
        return new String(newst);
    }


    public static String decrypt(String str, int step) {
        char[] newst = new char[str.length()];
        int i = 0;

        for (char let : str.toCharArray()) {
            int asciiCode = (int) let;
            int new1 = asciiCode;

            if (1072 <= asciiCode && asciiCode <= 1103) {
                new1 = 1072 + (asciiCode - 1072 - step) % 32;
                if (new1 < 1072) {
                    new1 += 32;
                }
            } else if (1040 <= asciiCode && asciiCode <= 1071) {
                new1 = 1040 + (asciiCode - 1040 - step) % 32;
                if (new1 < 1040) {
                    new1 += 32;
                }
            } else if (97 <= asciiCode && asciiCode <= 122) {
                new1 = 97 + (asciiCode - 97 - step) % 26;
                if (new1 < 97) {
                    new1 += 26;
                }
            } else if (65 <= asciiCode && asciiCode <= 90) {
                new1 = 65 + (asciiCode - 65 - step) % 26;
                if (new1 < 65) {
                    new1 += 26;
                }
            }
            newst[i] = (char) new1;
            i++;
        }
        return new String(newst);
    }
}