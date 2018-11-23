package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

/**
 * @author BOSS JO
 */
public class TransferTest {

    private final static LocalDateTime NOW = LocalDateTime.now();

    private final static double AMOUNT_LOWER = 9.99;

    private final static double AMOUNT_MIN = 10;

    @Test
    void shouldFailWithNullDate() {
	assertThrows(NullPointerException.class, () -> {
	    new Transfer(null, AMOUNT_MIN);
	});
    }

    @Test
    void shouldFailWitAmountLower() {
	assertThrows(IllegalArgumentException.class, () -> {
	    new Transfer(NOW, AMOUNT_LOWER);
	});
    }

    @Test
    void shouldNotFail() {
	assertDoesNotThrow(() -> {
	    new Transfer(NOW, AMOUNT_MIN);
	});
    }

    @Test
    void shouldBeEqualValues() {
	Transfer transfer = new Transfer(NOW, AMOUNT_MIN);
	assertEquals(NOW, transfer.getDate());
	assertEquals(AMOUNT_MIN, transfer.getAmount());
    }
}
