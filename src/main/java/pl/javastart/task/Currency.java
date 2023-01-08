package pl.javastart.task;

import java.math.BigDecimal;

public class Currency {
    private String countryCode;
    private BigDecimal rate;

    public Currency(String countryCode, BigDecimal rate) {
        this.countryCode = countryCode;
        this.rate = rate;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}
