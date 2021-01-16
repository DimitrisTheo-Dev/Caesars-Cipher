
public class Main {
    public static void main(String[] args) {
        String message = "How you doing";
        int offset = 12;
        CaesarsCipher caesarsCipher = new CaesarsCipher();
        String output = caesarsCipher.cipher(message, offset);
        System.out.print("message \n" + output);
    }
}
