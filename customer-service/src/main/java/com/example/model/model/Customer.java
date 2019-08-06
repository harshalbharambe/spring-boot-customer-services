
package com.example.model.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "modelCustomer")
public class Customer {

	@Id
    private String customerId;
    private String customerType;
    private String status;
    private String statusReason;
    private ValidFor validFor;
    private String createdDate;
    private String lastModificationDate;
    private String createdBy;
    private String updatedBy;
    private PartyDetail partyDetail;
    private List<ContactInfo> contactInfo = null;
    private List<CustomerAccount> customerAccount = null;
    private List<Characteristic> characteristic = null;
    private List<CustomerCreditProfile> customerCreditProfile = null;
    private List<Agreement> agreement = null;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    public ValidFor getValidFor() {
        return validFor;
    }

    public void setValidFor(ValidFor validFor) {
        this.validFor = validFor;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(String lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public PartyDetail getPartyDetail() {
        return partyDetail;
    }

    public void setPartyDetail(PartyDetail partyDetail) {
        this.partyDetail = partyDetail;
    }

    public List<ContactInfo> getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(List<ContactInfo> contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<CustomerAccount> getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(List<CustomerAccount> customerAccount) {
        this.customerAccount = customerAccount;
    }

    public List<Characteristic> getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(List<Characteristic> characteristic) {
        this.characteristic = characteristic;
    }

    public List<CustomerCreditProfile> getCustomerCreditProfile() {
        return customerCreditProfile;
    }

    public void setCustomerCreditProfile(List<CustomerCreditProfile> customerCreditProfile) {
        this.customerCreditProfile = customerCreditProfile;
    }

    public List<Agreement> getAgreement() {
        return agreement;
    }

    public void setAgreement(List<Agreement> agreement) {
        this.agreement = agreement;
    }

}
