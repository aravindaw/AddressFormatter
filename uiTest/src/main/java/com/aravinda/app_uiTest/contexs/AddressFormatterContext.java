package com.aravinda.app_uiTest.contexs;

import org.openqa.selenium.json.Json;

public class AddressFormatterContext {
    private String headingLabel;
    private String resetButton;
    private String addressField;
    private String addressFieldValue;
    private String[] addressFieldMultipleValue;
    private String submitButton;
    private String tryAnotherAddressButton;
    private String result;
    private String expectedResult;

    public String[] getExpectedResultList() {
        return expectedResultList;
    }

    public void setExpectedResultList(String[] expectedResultList) {
        this.expectedResultList = expectedResultList;
    }

    private String[] expectedResultList;

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String[] getAddressFieldMultipleValue() {
        return addressFieldMultipleValue;
    }

    public void setAddressFieldMultipleValue(String[] addressFieldMultipleValue) {
        this.addressFieldMultipleValue = addressFieldMultipleValue;
    }

    public String getAddressFieldValue() {
        return addressFieldValue;
    }

    public void setAddressFieldValue(String addressFieldValue) {
        this.addressFieldValue = addressFieldValue;
    }

    public String getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(String submitButton) {
        this.submitButton = submitButton;
    }

    public String getTryAnotherAddressButton() {
        return tryAnotherAddressButton;
    }

    public void setTryAnotherAddressButton(String tryAnotherAddressButton) {
        this.tryAnotherAddressButton = tryAnotherAddressButton;
    }

    public String getAddressField() {
        return addressField;
    }

    public void setAddressField(String addressField) {
        this.addressField = addressField;
    }

    public String getResetButton() {
        return resetButton;
    }

    public void setResetButton(String resetButton) {
        this.resetButton = resetButton;
    }

    public String getHeadingLabel() {
        return headingLabel;
    }

    public void setHeadingLabel(String headingLabel) {
        this.headingLabel = headingLabel;
    }

}
