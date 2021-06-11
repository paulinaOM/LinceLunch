/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author TeamPN
 */
public class ConexionBD {
    
    private Connection conex;
    private Statement sentencia;
    private ResultSet consulta;
    
    public ConexionBD (String bd, String usuario, String pass, String url){
         try{
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection(url+bd, usuario, pass);//Conexion 
            if (conex != null){
                System.out.println("Conexion a la base de datos.......ok :)");
            }
        }catch(ClassNotFoundException cnfe){
            System.out.println("Driver JDBC no encontrado");
            cnfe.printStackTrace();
            conex=null;
        }catch (SQLException sqle){
            System.out.println("Error al conectarse");
            sqle.printStackTrace();
            conex = null;
        }catch (Exception e){
            System.out.println("Error General");
            e.printStackTrace();
            conex = null;
        }
    }
    public Connection getConex(){
        return this.conex;
    }
    public void Consulta(String cadsql) throws SQLException{
        this.sentencia = this.conex.createStatement();
        this.consulta = this.sentencia.executeQuery(cadsql);       
    }
    public ResultSet getConsulta(){
        return this.consulta;
    }
    public void EjecutarSentencia(String cadesql) throws SQLException{
      this.sentencia = this.conex.createStatement();
      this.sentencia.executeUpdate(cadesql);
    }
    public void CerrarConexion() throws SQLException
    {
        this.conex.close();
    }
    public void CerrarConsulta() throws SQLException
    {
        this.consulta.close();
    }
    public void CerrarSentencia() throws SQLException
    {
        this.sentencia.close();        
    }
      
}
