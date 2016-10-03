/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parsecsv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.GsonBuilder;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import parsecsv.bd.MeuPreparedStatement;

/**
 *
 * @author u14191
 */
public class ParseCSV 
{
    
     protected static MeuPreparedStatement bd;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException, ParseException 
    {
        parseDaily("arroz");
    }
    
    public static void parseDaily(String csvFile) throws IOException, ClassNotFoundException, SQLException, ParseException
    { 
        csvFile = "C:\\Users\\u14191\\Desktop\\parseCSV\\daily.csv";
        BufferedReader br = null;
        String line = "";
        
       // bd = new MeuPreparedStatement("com.microsoft.sqlserver.jdbc.SQLServerDriver","jdbc:sqlserver://regulus:1433;databasename=BDu14177", "BDu14177", "BDu14177");

        try 
        {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) 
            {
                // use comma as separator
                line = br.readLine();
                String date = "";
                
                String[] linha = line.split("\\|");
                Daily d = new Daily(linha);
                
                //Gson gson = new Gson();
                //String dJSONString = gson.toJson(d);
                
                //String sql = ""
                //JSONObject request = new JSONObject(dJSONString);
                String sql = "insert into dbo.daily values(Date(?),?,?,?,?,?,?,?,?,?,?)";
                bd.prepareStatement (sql);

	            bd.setString(1, d.getInserted_date());
	            bd.setInt (2, d.getCarrier_id());	            
	            bd.setString (3, d.getCarrier_name());
	            bd.setInt (4, d.getApplication_id());
                    bd.setString (5, d.getApplication_name());
	            bd.setFloat (6, d.getPrice_value());	     
	            bd.setFloat (7, d.getCarrier_gross_revenue_value());
	            bd.setInt (8, d.getActive_base_total());
	            bd.setInt (9, d.getNew_subscriber_total());
                    bd.setInt(10, d.getCancelation_total());
                    bd.setString(11, d.getCancelation_type());
              
              bd.executeUpdate();
              bd.commit();
            }

        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (br != null) 
            {
                try 
                {
                    br.close();
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        }
        //return ;
    }
    

    
}
