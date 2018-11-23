package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * @author BOSS JO
 */
public class RibTest {

    private final static String BANK_CODE = "30002";

    private final static String COUNTER_CODE = "00550";

    private final static String ACCOUNT_NUMBER = "0000145675Z";

    private final static int ACCOUNT_NUMBER_LENGHT = ACCOUNT_NUMBER.length();

    private final static String KEY = "25";

    @Test
    void shouldFailConstructWithNullBankCode() {
	assertThrows(NullPointerException.class, () -> {
	    new Rib(null, COUNTER_CODE, ACCOUNT_NUMBER, KEY);
	});
    }

    @Test
    void shouldFailConstructWithNullCounterCode() {
	assertThrows(NullPointerException.class, () -> {
	    new Rib(BANK_CODE, null, ACCOUNT_NUMBER, KEY);
	});
    }

    @Test
    void shouldFailConstructWithNullAccountNumber() {
	assertThrows(NullPointerException.class, () -> {
	    new Rib(BANK_CODE, COUNTER_CODE, null, KEY);
	});
    }

    @Test
    void shouldFailConstructWithNullKey() {
	assertThrows(NullPointerException.class, () -> {
	    new Rib(BANK_CODE, COUNTER_CODE, ACCOUNT_NUMBER, null);
	});
    }

    @Test
    void shouldFailWithNullArguments() {
	assertThrows(NullPointerException.class, () -> {
	    new Rib(null, null, null, null);
	});
    }

    @Test
    void shouldNotFailWithCorrectArguments() {
	assertDoesNotThrow(() -> {
	    new Rib(BANK_CODE, COUNTER_CODE, ACCOUNT_NUMBER, KEY);
	});
    }

    @Test
    void shouldBeEqualValues() {
	Rib p = new Rib(BANK_CODE, COUNTER_CODE, ACCOUNT_NUMBER, KEY);
	assertEquals(BANK_CODE, p.getBankCode());
	assertEquals(COUNTER_CODE, p.getCounterCode());
	assertEquals(ACCOUNT_NUMBER, p.getAccountNumber());
	assertEquals(KEY, p.getKey());
    }
}
