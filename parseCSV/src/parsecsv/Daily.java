/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsecsv;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Daily 
{

    int carrier_id, application_id, active_base_total, new_subscriber_total, cancelation_total;
    String carrier_name, application_name,cancelation_type, inserted_date;
    float price_value, carrier_gross_revenue_value;

    
    public String getInserted_date() 
    {
        return inserted_date;
    }
    
    
    public Daily(String[] linha) throws ParseException 
    {
        this.inserted_date = linha[0]; //converter date
        this.carrier_id = Integer.parseInt(linha[1]);
        this.carrier_name = linha[2];
        this.application_id = Integer.parseInt(linha[3]);
        this.application_name = linha[4];
        this.price_value = Float.parseFloat(linha[5]);
        this.carrier_gross_revenue_value = Float.parseFloat(linha[6]);
        this.active_base_total = Integer.parseInt(linha[7]);
        this.new_subscriber_total = Integer.parseInt(linha[8]);
        this.cancelation_total = Integer.parseInt(linha[9]);
        this.cancelation_type = linha[10];
    }


    public void setInserted_date(String inserted_date) 
    {
        this.inserted_date = inserted_date;
    }

    public int getCarrier_id() {
        return carrier_id;
    }

    public void setCarrier_id(int carrier_id) {
        this.carrier_id = carrier_id;
    }

    public int getApplication_id() 
    {
        return application_id;
    }

    public void setApplication_id(int application_id) 
    {
        this.application_id = application_id;
    }

    public String getCarrier_name() 
    {
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

    public int getActive_base_total() {
        return active_base_total;
    }

    public void setActive_base_total(int active_base_total) {
        this.active_base_total = active_base_total;
    }

    public int getNew_subscriber_total() {
        return new_subscriber_total;
    }

    public void setNew_subscriber_total(int new_subscriber_total) {
        this.new_subscriber_total = new_subscriber_total;
    }

    public int getCancelation_total() {
        return cancelation_total;
    }

    public void setCancelation_total(int cancelation_total) {
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

    public String getCancelation_type() {
        return cancelation_type;
    }

    public void setCancelation_type(String cancelation_type) {
        this.cancelation_type = cancelation_type;
    }
        
    
}
