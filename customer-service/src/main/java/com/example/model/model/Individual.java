
package com.example.model.model;

import java.util.List;

public class Individual {

    private Integer individualId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String fullName;
    private String gender;
    private String placeOfBirth;
    private String nationality;
    private String maritalStatus;
    private String birthdate;
    private String currencyName;
    private Party party;
    private PartyRoleDetails partyRoleDetails;
    private List<PartyDemographic> partyDemographic = null;
    private IndividualIdentification individualIdentification;

    public Integer getIndividualId() {
        return individualId;
    }

    public void setIndividualId(Integer individualId) {
        this.individualId = individualId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public PartyRoleDetails getPartyRoleDetails() {
        return partyRoleDetails;
    }

    public void setPartyRoleDetails(PartyRoleDetails partyRoleDetails) {
        this.partyRoleDetails = partyRoleDetails;
    }

    public List<PartyDemographic> getPartyDemographic() {
        return partyDemographic;
    }

    public void setPartyDemographic(List<PartyDemographic> partyDemographic) {
        this.partyDemographic = partyDemographic;
    }

    public IndividualIdentification getIndividualIdentification() {
        return individualIdentification;
    }

    public void setIndividualIdentification(IndividualIdentification individualIdentification) {
        this.individualIdentification = individualIdentification;
    }

}
