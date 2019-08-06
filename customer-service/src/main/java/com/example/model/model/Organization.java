
package com.example.model.model;

import java.util.List;

public class Organization {

    private Integer organizationId;
    private String organizationName;
    private Integer currencyName;
    private Boolean parent;
    private OrganizationIdentification organizationIdentification;
    private OrganizationRelationship organizationRelationship;
    private Party party;
    private PartyRoleDetails partyRoleDetails;
    private List<PartyDemographic> partyDemographic = null;

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Integer getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(Integer currencyName) {
        this.currencyName = currencyName;
    }

    public Boolean getParent() {
        return parent;
    }

    public void setParent(Boolean parent) {
        this.parent = parent;
    }

    public OrganizationIdentification getOrganizationIdentification() {
        return organizationIdentification;
    }

    public void setOrganizationIdentification(OrganizationIdentification organizationIdentification) {
        this.organizationIdentification = organizationIdentification;
    }

    public OrganizationRelationship getOrganizationRelationship() {
        return organizationRelationship;
    }

    public void setOrganizationRelationship(OrganizationRelationship organizationRelationship) {
        this.organizationRelationship = organizationRelationship;
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

}
