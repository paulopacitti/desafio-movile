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

    import java.util.Date;
public class Daily {
    Date inserted_date;
    int carrier_id, application_id;
    String carrier_name, application_name, active_base_total, new_subscriber_total, cancelation_total;
    float price_value, carrier_gross_revenue_value;
    char cancelation_type;
    public Date getInserted_date() {
        return inserted_date;
    }

    public void setInserted_date(Date inserted_date) {
        this.inserted_date = inserted_date;
    }

    public int getCarrier_id() {
        return carrier_id;
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

    public String getCarrier_name() {
        return carrier_name;
    }

    public void setCarrier_name(String carrier_name) {
        this.carrier_name = carrier_name;
    }

    public String getApplication_name() {
        return application_name;
    }

    public void setApplication_name(String application_name) {
        this.application_name = application_name;
    }

    public String getActive_base_total() {
        return active_base_total;
    }

    public void setActive_base_total(String active_base_total) {
        this.active_base_total = active_base_total;
    }

    public String getNew_subscriber_total() {
        return new_subscriber_total;
    }

    public void setNew_subscriber_total(String new_subscriber_total) {
        this.new_subscriber_total = new_subscriber_total;
    }

    public String getCancelation_total() {
        return cancelation_total;
    }

    public void setCancelation_total(String cancelation_total) {
        this.cancelation_total = cancelation_total;
    }

    public float getPrice_value() {
        return price_value;
    }

    public void setPrice_value(float price_value) {
        this.price_value = price_value;
    }

    public float getCarrier_gross_revenue_value() {
        return carrier_gross_revenue_value;
    }

    public void setCarrier_gross_revenue_value(float carrier_gross_revenue_value) {
        this.carrier_gross_revenue_value = carrier_gross_revenue_value;
    }

    public char getCancelation_type() {
        return cancelation_type;
    }

    public void setCancelation_type(char cancelation_type) {
        this.cancelation_type = cancelation_type;
    }
    
}
