import caesars.cipher.CaesarsCipher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarsCipherTest {
    private CaesarsCipher caesarCipher = new CaesarsCipher();

    @Test
    void testCipheredMessage() {
        assertEquals("tai mdq kag pauzs fapmk", caesarCipher.cipher("how are you doing today", 12));
    }

    @Test
    void testEmptyString() {
        assertEquals("", caesarCipher.cipher("", 12));
    }
}