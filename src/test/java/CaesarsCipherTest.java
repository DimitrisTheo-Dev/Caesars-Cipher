import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarsCipherTest {
    private CaesarsCipher caesarsCipher = new CaesarsCipher();

    @Test
    void testCipheredMessage() {
        assertEquals("n", caesarsCipher.cipher("how you doing", 12));
    }

    @Test
    void testEmptyString() {
        assertEquals("", caesarsCipher.cipher("", 12));
    }
}