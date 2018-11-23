package fr.formation.partiel1;

/**
 * @author BOSS JO
 */
public class Rib {

    private String bankCode;

    private String counterCode;

    private String accountNumber;

    private String key;

    /**
     * @param bankCode
     *                      Bank code
     * @param counterCode
     *                      Counter Code
     * @param accountNumber
     *                      Account Number
     * @param key
     *                      rib Key
     */
    public Rib(String bankCode, String counterCode, String accountNumber,
	    String key) {
	setException(bankCode, counterCode, accountNumber, key);
    }

    /**
     * @return bank code
     */
    public String getBankCode() {
	return bankCode;
    }

    /**
     * @return counter code
     */
    public String getCounterCode() {
	return counterCode;
    }

    /**
     * @return account number
     */
    public String getAccountNumber() {
	return accountNumber;
    }

    /**
     * @return key
     */
    public String getKey() {
	return key;
    }

    private void setException(String a, String b, String c, String d) {
	if (a == null || b == null || c == null || d == null) {
	    throw new NullPointerException();
	}
	bankCode = a;
	counterCode = b;
	accountNumber = c;
	key = d;
    }
}
