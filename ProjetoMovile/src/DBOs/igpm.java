/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOs;

/**
 *
 * @author u14167
 */
public class igpm {
    int carrier_id, application_id;
    double price_value,  carrier_tax, share_movile, ARPU;

    public int getCarrier_id() {
        return carrier_id;
    }
    public double getARPU(){
    	return ARPU;
    }
    public void setARPU(double gr){
    	ARPU = gr * carrier_tax * share_movile;
    }

    public void setCarrier_id(int carrier_id) {
        this.carrier_id = carrier_id;
    }

    public int getApplication_id() {
        return application_id;
    }

    public void setApplication_id(int application_id) {
        this.application_id = application_id;
    }

    public double getPrice_value() {
        return price_value;
    }

    public void setPrice_value(double price_value) {
        this.price_value = price_value;
    }

    public double getCarrier_tax() {
        return carrier_tax;
    }

    public void setCarrier_tax(double carrier_tax) {
        this.carrier_tax = carrier_tax;
    }

    public double getShare_movile() {
        return share_movile;
    }

    public void setShare_movile(double share_movile) {
        this.share_movile = share_movile;
    }

}
