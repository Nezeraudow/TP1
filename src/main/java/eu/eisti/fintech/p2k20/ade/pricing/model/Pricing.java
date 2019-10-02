package eu.eisti.fintech.p2k20.ade.pricing.model;

import java.math.BigDecimal;

public class Pricing {
    private int id;
    
    private BigDecimal minAmount;
    private BigDecimal maxAmount;
    
    private int minDuration;
    private int maxDuration;
    
    private BigDecimal rate;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public BigDecimal getMinAmount() {
        return minAmount;
    }
    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }
    public BigDecimal getMaxAmount() {
        return maxAmount;
    }
    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }
    public int getMinDuration() {
        return minDuration;
    }
    public void setMinDuration(int minDuration) {
        this.minDuration = minDuration;
    }
    public int getMaxDuration() {
        return maxDuration;
    }
    public void setMaxDuration(int maxDuration) {
        this.maxDuration = maxDuration;
    }
    public BigDecimal getRate() {
        return rate;
    }
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}






