package org.example;

public class DspVehicleDetailsDto {

    private String DspShortCode;
    private String deliveryStation;
    private String owner;
    private String vin;

    public DspVehicleDetailsDto(String dspShortCode, String deliveryStation, String owner, String vin) {
        super();
        DspShortCode = dspShortCode;
        this.deliveryStation = deliveryStation;
        this.owner = owner;
        this.vin = vin;
    }

    public DspVehicleDetailsDto() {
        super();
    }

    public String getDspShortCode() {
        return DspShortCode;
    }
    public void setDspShortCode(String dspShortCode) {
        DspShortCode = dspShortCode;
    }
    public String getDeliveryStation() {
        return deliveryStation;
    }
    public void setDeliveryStation(String deliveryStation) {
        this.deliveryStation = deliveryStation;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getVin() {
        return vin;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "DspVehicleDetailsDto{" +
                "DspShortCode='" + DspShortCode + '\'' +
                ", deliveryStation='" + deliveryStation + '\'' +
                ", owner='" + owner + '\'' +
                ", vin='" + vin + '\'' +
                '}';
    }
}
