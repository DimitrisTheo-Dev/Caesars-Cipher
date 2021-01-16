import caesars.cipher.CaesarsCipher;

public class Main {
    public static void main(String[] args) {
        String message = "how are you doing today";
        int offset = 12;

        CaesarsCipher caesarsCipher = new CaesarsCipher();
        String output = caesarsCipher.cipher(message, offset);

        System.out.print("message: " + message);
        System.out.print("\nciphered message: " + output);
    }
}
