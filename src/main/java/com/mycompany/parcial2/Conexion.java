
package com.mycompany.parcial2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Conexion {
    public static void ej1(){
    //Consultar
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/db_parcial?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","Umg$2019");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "SELECT * FROM db_parcial.tb_parcial";
            // paso 5 ejecutamos el query
            ResultSet resultado = sentencia.executeQuery(sql);
            // paso 6. procesar el resultado
            // explicar como se maneja al siguiente registro
            while(resultado.next()){
                System.out.println("Codigo ="+resultado.getInt(1));
                System.out.println("NIV = "+resultado.getString(2));
                System.out.println("Nombre ="+resultado.getString(3));
                System.out.println("Enero ="+resultado.getInt(4));
                System.out.println("Febrero ="+resultado.getInt(5));
                System.out.println("Marzo ="+resultado.getInt(6));
                System.out.println("Abril ="+resultado.getInt(7));
                System.out.println("Mayo ="+resultado.getInt(8));
                System.out.println("Junio ="+resultado.getInt(9));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
}
public static void ej2(int id){
    //Consulta con niv
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/db_parcial?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","Umg$2019");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "SELECT * FROM tb_parcial  where NIV = "+id;
            // paso 5 ejecutamos el query
            ResultSet resultado = sentencia.executeQuery(sql);
            // paso 6. procesar el resultado
            // explicar como se maneja al siguiente registro
             int rr=0;
            while(resultado.next()){
                System.out.println("NIV ="+resultado.getInt(2));
                System.out.println("Nombre = "+resultado.getString(3));
                System.out.println("Enero ="+resultado.getInt(4));
                rr=resultado.getInt(4);
                System.out.println("Febrero ="+resultado.getInt(5));
                 rr=rr+resultado.getInt(5);
                System.out.println("Marzo ="+resultado.getInt(6));
                rr=rr+resultado.getInt(6);
                System.out.println("Abril ="+resultado.getInt(7));
                rr=rr+resultado.getInt(7);
                System.out.println("Mayo ="+resultado.getInt(8));
                rr=rr+resultado.getInt(8);
                System.out.println("Junio ="+resultado.getInt(9));
                rr=rr+resultado.getInt(9);
            }
            System.out.println("El resultado de las ventas es de Q"+rr);
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
}
public static void ej3(){
    //Sumatoria de los meses
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/db_parcial?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","Umg$2019");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "SELECT * FROM db_parcial.tb_parcial";
            // paso 5 ejecutamos el query
            ResultSet resultado = sentencia.executeQuery(sql);
            // paso 6. procesar el resultado
            // explicar como se maneja al siguiente registro
             int rr=0;
             int rr2=0;
             int rr3=0;
             int rr4=0;
             int rr5=0;
             int rr6=0;
             int rrEnero=0;
             int f=0;
             int m=0;
             int a=0;
             int my=0;
             int j=0;
            while(resultado.next()){
                System.out.println("NIV ="+resultado.getInt(2));
                System.out.println("Nombre = "+resultado.getString(3));
                System.out.println("Enero ="+resultado.getInt(4));
                rr=resultado.getInt(4);
                rrEnero=rrEnero+rr;
                System.out.println("Febrero ="+resultado.getInt(5));
                 rr2=resultado.getInt(5);
                 f=f+rr2;
                System.out.println("Marzo ="+resultado.getInt(6));
                rr3=resultado.getInt(6);
                m=m+rr3;
                System.out.println("Abril ="+resultado.getInt(7));
                rr4=resultado.getInt(7);
                a=a+rr4;
                System.out.println("Mayo ="+resultado.getInt(8));
                rr5=resultado.getInt(8);
                my=my+rr5;
                System.out.println("Junio ="+resultado.getInt(9));
                rr6=resultado.getInt(9);
                j=j+rr6;
            }
            System.out.println("El resultado de las ventas de Enero es de Q"+rrEnero);
            System.out.println("El resultado de las ventas de Febrero es de Q"+f);
            System.out.println("El resultado de las ventas de Marzo es de Q"+m);
            System.out.println("El resultado de las ventas de Abril es de Q"+a);
            System.out.println("El resultado de las ventas de Mayo es de Q"+my);
            System.out.println("El resultado de las ventas de Junio es de Q"+j);
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
}
public static void ej4(int id){
    //Borrar a alguien
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/db_parcial?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","Umg$2019");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "delete from tb_parcial where NIV ="+id ;
            
            //este print nos sirve para analizar qué instrucción sql se va a ejecutar
            //System.out.println(sql);
            // paso 5 ejecutamos el query
            // tome atención que es diferente del paso 5 de la funcion ej1
            sentencia.execute(sql);
           
        } catch (SQLException ex) {
            System.out.println("Hubo clavo:"+ex.getMessage());
        }
}

public static void ej5(String nombre, int id){
    //Actualizar un nombre
    //paso 1 creamos la conexion a la base de datos
        String url = "jdbc:mysql://localhost:3306/db_parcial?zeroDateTimeBehavior=convertToNull&useSSL=false&useTimezone=true&serverTimezone=UTC";
        try {
            //paso 2 creamos el objeto conexion
            Connection conexion = DriverManager.getConnection(url,"root","Umg$2019");
            //paso 3 creamos el objeto statement
            Statement sentencia = conexion.createStatement();
            //paso 4 creamos la instruccion
            String sql = "update db_parcial.tb_parcial set Nombre = '"+nombre+"' where NIV = "+id;
            // paso 5 ejecutamos el query
            sentencia.execute(sql);
            // paso 6. procesar el resultado
            // explicar como se maneja al siguiente registro
        } catch (SQLException ex) {
            System.out.println("Hubo problem = "+ex.getMessage());
            
        }
}



    public static void main(String[] args) throws IOException {
       int i=0;
        for(int m1 =1;m1>i;){
        String mm="";
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String op="";
        int nume=0;
        System.out.println("Elija una opcion");
        System.out.println("1) Consultar");
        System.out.println("2) Consultar con NIV");
        System.out.println("3) Sumatoria de los meses");
        System.out.println("4) Borrar");
        System.out.println("5) Actualizar Nombre");
        op = lector.readLine();
        nume = Integer.parseInt(op);
        if(nume==1){
            ej1();//consulta
        }
        if(nume==2){
            String cNIV="";
            int nivi=0;
            System.out.println("Ingrese el NIV de la persona a consultar");
            cNIV = lector.readLine();
            nivi = Integer.parseInt(cNIV);
            
           ej2(nivi);//consulta niv 
        }
        if(nume==3){
           ej3();//Sumatoria meses individual 
        }
         if(nume==4){
        String linea,Linea2;
        int num1,num2;
        try {
             System.out.println("Ingrese el NIV de la persona a borrar:");
             linea = lector.readLine();
             num1 = Integer.parseInt(linea);
             System.out.println("Escriba 1 si esta seguro de eliminarlo o 2 Si no lo quiere eliminar");
             Linea2 = lector.readLine();
             num2 = Integer.parseInt(Linea2);
             if(num2==1){
              ej4(num1);            
             }
        } 
        catch(IOException e) {
            throw new RuntimeException(e);
        } 
        }
          if(nume==5){
           //Uptdate
             String linea="",Linea2="";
             int num1;
             System.out.println("Ingrese el NIV de la persona a Actualizar:");
             linea = lector.readLine();
             num1 = Integer.parseInt(linea);
             System.out.println("Escriba el nuevo nombre");
             Linea2 = lector.readLine();
              ej5(Linea2,num1);  
             }
           System.out.println("Coloque 1 para continuar utilizando el sistema");
           System.out.println("Coloque 0 salir del sistema");
           mm = lector.readLine();
           m1 = Integer.parseInt(mm);
        }
    }
}

