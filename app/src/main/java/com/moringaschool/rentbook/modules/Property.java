package com.moringaschool.rentbook.modules;

import java.util.Objects;

public class Property {
    private String propertyName;
    private String propertyLocation;
    private int numberOfUnitsInProperty;
    private int rentPerUnit;
    private boolean hasWater;
    private boolean hasElectricity;
    private boolean hasInternet;
    private String caretakerName;
    private String caretakerPhoneNumber;

    public Property(String propertyName, String propertyLocation, int numberOfUnitsInProperty, int rentPerUnit, boolean hasWater, boolean hasElectricity, boolean hasInternet, String caretakerName, String caretakerPhoneNumber) {
        this.propertyName = propertyName;
        this.propertyLocation = propertyLocation;
        this.numberOfUnitsInProperty = numberOfUnitsInProperty;
        this.rentPerUnit = rentPerUnit;
        this.hasWater = hasWater;
        this.hasElectricity = hasElectricity;
        this.hasInternet = hasInternet;
        this.caretakerName = caretakerName;
        this.caretakerPhoneNumber = caretakerPhoneNumber;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyLocation() {
        return propertyLocation;
    }

    public void setPropertyLocation(String propertyLocation) {
        this.propertyLocation = propertyLocation;
    }

    public int getNumberOfUnitsInProperty() {
        return numberOfUnitsInProperty;
    }

    public void setNumberOfUnitsInProperty(int numberOfUnitsInProperty) {
        this.numberOfUnitsInProperty = numberOfUnitsInProperty;
    }

    public int getRentPerUnit() {
        return rentPerUnit;
    }

    public void setRentPerUnit(int rentPerUnit) {
        this.rentPerUnit = rentPerUnit;
    }

    public boolean isHasWater() {
        return hasWater;
    }

    public void setHasWater(boolean hasWater) {
        this.hasWater = hasWater;
    }

    public boolean isHasElectricity() {
        return hasElectricity;
    }

    public void setHasElectricity(boolean hasElectricity) {
        this.hasElectricity = hasElectricity;
    }

    public boolean isHasInternet() {
        return hasInternet;
    }

    public void setHasInternet(boolean hasInternet) {
        this.hasInternet = hasInternet;
    }

    public String getCaretakerName() {
        return caretakerName;
    }

    public void setCaretakerName(String caretakerName) {
        this.caretakerName = caretakerName;
    }

    public String getCaretakerPhoneNumber() {
        return caretakerPhoneNumber;
    }

    public void setCaretakerPhoneNumber(String caretakerPhoneNumber) {
        this.caretakerPhoneNumber = caretakerPhoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return numberOfUnitsInProperty == property.numberOfUnitsInProperty && rentPerUnit == property.rentPerUnit && hasWater == property.hasWater && hasElectricity == property.hasElectricity && hasInternet == property.hasInternet && propertyName.equals(property.propertyName) && propertyLocation.equals(property.propertyLocation) && caretakerName.equals(property.caretakerName) && caretakerPhoneNumber.equals(property.caretakerPhoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyName, propertyLocation, numberOfUnitsInProperty, rentPerUnit, hasWater, hasElectricity, hasInternet, caretakerName, caretakerPhoneNumber);
    }
}
