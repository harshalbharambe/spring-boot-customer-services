
package com.example.model.model;

import java.util.List;

public class PaymentPlan {

    private String id;
    private String status;
    private String totalAmount;
    private String paymentPeriod;
    private String validFrom;
    private String validTill;
    private String priority;
    private List<PaymentMethod> paymentMethod = null;

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

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(String paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTill() {
        return validTill;
    }

    public void setValidTill(String validTill) {
        this.validTill = validTill;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public List<PaymentMethod> getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(List<PaymentMethod> paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
