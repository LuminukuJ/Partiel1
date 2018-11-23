package fr.formation.partiel1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * @author BOSS JO
 */
public class AccountTest {

    private final static String COUNTRY_CODE = "FR";

    private final static String CONTROL_KEY = "33";

    private final static String BANK_CODE = "30002";

    private final static String COUNTER_CODE = "00550";

    private final static String ACCOUNT_NUMBER = "0000145675Z";

    private final static String KEY = "25";

    private final static Rib RIB = new Rib(BANK_CODE, COUNTER_CODE,
	    ACCOUNT_NUMBER, KEY);

    @Test
    void shouldFailConstructWithNullCountryCode() {
	assertThrows(NullPointerException.class, () -> {
	    new Account(null, CONTROL_KEY, RIB);
	});
    }

    @Test
    void shouldFailConstructWithNullCounterCode() {
	assertThrows(NullPointerException.class, () -> {
	    new Account(COUNTRY_CODE, null, RIB);
	});
    }

    @Test
    void shouldFailConstructWithNullRib() {
	assertThrows(NullPointerException.class, () -> {
	    new Account(COUNTRY_CODE, CONTROL_KEY, null);
	});
    }

    @Test
    void shouldFailConstructWithNullArguments() {
	assertThrows(NullPointerException.class, () -> {
	    new Account(null, null, null);
	});
    }

    @Test
    void shouldNotFail() {
	assertDoesNotThrow(() -> {
	    new Account(COUNTRY_CODE, CONTROL_KEY, RIB);
	});
    }

    @Test
    void shouldBeEqualValues() {
	Account account = new Account(COUNTRY_CODE, CONTROL_KEY, RIB);
	assertEquals(COUNTRY_CODE, account.getCountryCode());
	assertEquals(CONTROL_KEY, account.getControlKey());
	assertEquals(RIB, account.getRib());
    }
}
