
package com.example.model.model;

public class ContactNumber {

    private String countryCode;
    private String areaCode;
    private String number;
    private String extension;
    private String contactNumberType;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getContactNumberType() {
        return contactNumberType;
    }

    public void setContactNumberType(String contactNumberType) {
        this.contactNumberType = contactNumberType;
    }

}
