
package com.example.model.model;

import java.util.List;

public class CustomerAccount {

    private String description;
    private String href;
    private String id;
    private String status;
    private String accountType;
    private List<PaymentPlan> paymentPlan = null;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public List<PaymentPlan> getPaymentPlan() {
        return paymentPlan;
    }

    public void setPaymentPlan(List<PaymentPlan> paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

}
