
package com.example.model.model;

import java.util.List;

public class ContactInfo {

    private Integer contactId;
    private Integer individualId;
    private Integer organizationId;
    private String partyId;
    private String partyType;
    private PartyRoleDetails partyRoleDetails;
    private List<ContactNumber> contactNumber = null;
    private List<EmailAddress> emailAddress = null;
    private List<PostalAddress> postalAddress = null;
    private String preferredContactMedium;

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Integer individualId) {
        this.individualId = individualId;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public PartyRoleDetails getPartyRoleDetails() {
        return partyRoleDetails;
    }

    public void setPartyRoleDetails(PartyRoleDetails partyRoleDetails) {
        this.partyRoleDetails = partyRoleDetails;
    }

    public List<ContactNumber> getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(List<ContactNumber> contactNumber) {
        this.contactNumber = contactNumber;
    }

    public List<EmailAddress> getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(List<EmailAddress> emailAddress) {
        this.emailAddress = emailAddress;
    }

    public List<PostalAddress> getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(List<PostalAddress> postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPreferredContactMedium() {
        return preferredContactMedium;
    }

    public void setPreferredContactMedium(String preferredContactMedium) {
        this.preferredContactMedium = preferredContactMedium;
    }

}
