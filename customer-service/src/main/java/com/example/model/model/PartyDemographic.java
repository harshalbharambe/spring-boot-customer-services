
package com.example.model.model;

public class PartyDemographic {

    private String demographicId;
    private String createDate;
    private String partyDemographicSource;
    private String value;
    private String uom;

    public String getDemographicId() {
        return demographicId;
    }

    public void setDemographicId(String demographicId) {
        this.demographicId = demographicId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getPartyDemographicSource() {
        return partyDemographicSource;
    }

    public void setPartyDemographicSource(String partyDemographicSource) {
        this.partyDemographicSource = partyDemographicSource;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

}
