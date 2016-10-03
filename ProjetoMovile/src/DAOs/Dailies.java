package DAOs;

import java.util.ArrayList;

import ClassesAcesso.MeuPreparedStatement;
import ClassesAcesso.MeuResultSet;
import DBOs.Daily;
import java.sql.Date;

public class Dailies {
	
	public static ArrayList<Daily> getByDateOrderByCarrier(String data) throws Exception{
		ArrayList<Daily> listaResultante = new ArrayList<Daily>();
		Daily atual;
		MeuPreparedStatement comando;
			comando = new MeuPreparedStatement (
		            "com.microsoft.sqlserver.jdbc.SQLServerDriver",
		            "jdbc:sqlserver://regulus:1433;databasename=BDu14177",
		            "BDu14177", "BDu14177");
		
			String sql;

            sql = "SELECT active_base_total, carrier_name, inserted_date FROM daily WHERE inserted_date=?" +
                  "GROUP BY carrier_name";
            
            comando.prepareStatement (sql);
            Date dia = new Date(Integer.parseInt(data.substring(0, 2)),Integer.parseInt(data.substring(3, 5)), Integer.parseInt(data.substring(6, 8))); // DD/MM/AAAA
            comando.setDate(1, dia);
            MeuResultSet resultado = (MeuResultSet) comando.executeQuery();
            resultado.first();
            while(resultado.next()){
            	atual = new Daily();
            	atual.setActive_base_total(Integer.toString(resultado.getInt("active_base_total")));
            	atual.setCarrier_name(resultado.getString("carrier_name"));
            	atual.setInserted_date(resultado.getDate("inseted_date"));
            }

            resultado.first();
		listaResultante.add(new Daily());
		return listaResultante;
		
		
		
	}
}
