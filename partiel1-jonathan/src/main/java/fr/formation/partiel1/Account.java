package fr.formation.partiel1;

import java.util.Objects;

/**
 * @author BOSS JO
 */
public class Account {

    private String countryCode;

    private String controlKey;

    private Rib rib;

    /**
     * @param contryCode
     *                   the country code
     * @param controlKey
     *                   the control key
     * @param rib
     *                   the rib
     */
    public Account(String contryCode, String controlKey, Rib rib) {
	setCountryCode(contryCode);
	setControlKey(controlKey);
	setRib(rib);
    }

    /**
     * @return country code
     */
    public String getCountryCode() {
	return countryCode;
    }

    /**
     * @return control key
     */
    public String getControlKey() {
	return controlKey;
    }

    /**
     * @return rib
     */
    public Rib getRib() {
	return rib;
    }

    private void setCountryCode(String countryCode) {
	Objects.requireNonNull(countryCode, "country code must be no null");
	this.countryCode = countryCode;
    }

    private void setControlKey(String controlKey) {
	Objects.requireNonNull(controlKey, "control key must be no null");
	this.controlKey = controlKey;
    }

    private void setRib(Rib rib) {
	Objects.requireNonNull(rib, "rib key must be no null");
	this.rib = rib;
    }
}
