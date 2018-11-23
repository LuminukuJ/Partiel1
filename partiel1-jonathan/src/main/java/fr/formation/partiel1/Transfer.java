package fr.formation.partiel1;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author Boss JO
 */
public class Transfer {

    private LocalDateTime date;

    private double amount;

    /**
     * @param date
     *               The date
     * @param amount
     *               Amount of the transfer
     */
    public Transfer(LocalDateTime date, double amount) {
	setDate(date);
	setAmount(amount);
    }

    /**
     * @return date
     */
    public LocalDateTime getDate() {
	return date;
    }

    /**
     * @return amount
     */
    public double getAmount() {
	return amount;
    }

    private void setDate(LocalDateTime date) {
	Objects.requireNonNull(date, "date must be non null");
	this.date = date;
    }

    private void setAmount(double amount) {
	if (amount <= 9.99) {
	    throw new IllegalArgumentException(
		    "Amount must be positive and higher or equal than 10: "
			    + amount);
	}
	this.amount = amount;
    }
}
