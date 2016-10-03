/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBOs;

/**
 *
 * @author u14191
 */
public class Daily
{
    String inserted_date;
    String carrier_id;
    String carrier_name;
    String application_id;
    String application_name;
    String price_value;
    String carrier_gross_revenue_value;
    String active_base_total;
    String new_subscriber_total;
    String cancellation_total;
    String cancellation_type;


    public String getInserted_date() {
        return inserted_date;
    }

    public Daily() 
    {
        this.inserted_date = "" ;
        this.carrier_id = "";
        this.carrier_name = "";
        this.application_id = "";
        this.application_name = "";
        this.price_value = "";
        this.carrier_gross_revenue_value = "";
        this.active_base_total = "";
        this.new_subscriber_total = "";
        this.cancellation_total = "";
        this.cancellation_type = "";
    }
    
    public Daily(String[] linha, String date) 
    {
        this.inserted_date = date;
        this.carrier_id = linha[0];
        this.carrier_name = linha[1];
        this.application_id = linha[2];
        this.application_name = linha[3];
        this.price_value = linha[4];
        this.carrier_gross_revenue_value = linha[5];
        this.active_base_total = linha[6];
        this.new_subscriber_total = linha[7];
        this.cancellation_total = linha[8];
        this.cancellation_type = linha[9];
    }
    
    

    public void setInserted_date(String inserted_date) {
        this.inserted_date = inserted_date;
    }

    public String getCarrier_id() {
        return carrier_id;
    }

    public void setCarrier_id(String carrier_id) {
        this.carrier_id = carrier_id;
    }
    
    public String getCarrier_name() {
        return carrier_id;
    }

    public void setCarrier_name(String carrier_name) {
        this.carrier_name = carrier_name;
    }
    
    public String getApplication_id() {
        return application_id;
    }

    public void setApplication_id(String apllication_id) {
        this.application_id = application_id;
    }

    public String getApplication_name() {
        return application_name;
    }

    public void setApplication_name(String application_name) {
        this.application_name = application_name;
    }

    public String getPrice_value() {
        return price_value;
    }

    public void setPrice_value(String price_value) {
        this.price_value = price_value;
    }

    public String getCarrier_gross_revenue_value() {
        return carrier_gross_revenue_value;
    }

    public void setCarrier_gross_revenue_value(String carrier_gross_revenue_value) {
        this.carrier_gross_revenue_value = carrier_gross_revenue_value;
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
        return cancellation_total;
    }

    public void setCancelation_total(String cancelation_total) {
        this.cancellation_total = cancelation_total;
    }

    public String getCancelation_type() {
        return cancellation_type;
    }

    public void setCancelation_type(String cancelation_type) {
        this.cancellation_type = cancelation_type;
    }
    
    
   
        
    
}
