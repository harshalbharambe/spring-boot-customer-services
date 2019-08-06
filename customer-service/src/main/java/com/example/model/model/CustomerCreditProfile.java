
package com.example.model.model;

public class CustomerCreditProfile {

    private String creditProfileDate;
    private Integer creditRiskRating;
    private Integer creditScore;
    private String validTill;

    public String getCreditProfileDate() {
        return creditProfileDate;
    }

    public void setCreditProfileDate(String creditProfileDate) {
        this.creditProfileDate = creditProfileDate;
    }

    public Integer getCreditRiskRating() {
        return creditRiskRating;
    }

    public void setCreditRiskRating(Integer creditRiskRating) {
        this.creditRiskRating = creditRiskRating;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String validTill) {
        this.validTill = validTill;
    }

}
