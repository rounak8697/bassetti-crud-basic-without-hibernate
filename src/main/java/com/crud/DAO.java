package com.crud;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO
{
    Connection cnt=null;
    //----------------------------------connection to database---------------------------------------
    public DAO()
    {
        String url="jdbc:mysql://localhost:3306/rounakdeskdb";
        String name ="root";
        String password ="Rounak@90";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");                  //A call to forName("X") causes the class named X to be initialized
            cnt= DriverManager.getConnection(url, name, password);      //The basic service for managing a set of JDBC drivers.
        }
        catch(Exception e){System.out.println(e);}
    }

    //--------------------------------------method for creating student rows in database-------------------------
    public void creatstudent(StdModel S)
    {
        String q="insert into std_table values(?,?,?,?)";
        try {
            PreparedStatement ps=cnt.prepareStatement(q)/*This method accepts a query (parameterized) and returns a PreparedStatement object.*/;

            ps.setInt(1,S.getId());//setInt(coloum number,value) is used to set a specified int value to a specified index of a given object array
            ps.setString(2, S.getName());//setString(coloum number,value) is used to set a specified string value to a specified index of a given object array
            ps.setInt(3,S.getRoll());
            ps.setString(4, S.getDepart());

            ps.executeUpdate();//method to update the table

        }catch (Exception e) {	System.out.println(e);}
    }

    //--------------------------------------method for fetching students from DB to List---------------------------
    public List<StdModel> getstudentlist()
    {
        List<StdModel> stdlist= new ArrayList<>();

        String q="select * from std_table";//query statement
        try {
            Statement st=cnt.createStatement();//Creates a Statement object for sendingSQL statements to the database.
            ResultSet r =st.executeQuery(q); //Executes the given SQL statement, which returns a single ResultSet object

            while(r.next())//Moves the cursor forward one row from its current position in ResultSet Object
                {
                StdModel ob = new StdModel();//creating obj for every student
                ob.setId(r.getInt(1));//Retrieves the value of the designated column in the current row of this ResultSet object as an int in the Java.
                ob.setName(r.getString(2));
                ob.setRoll(r.getInt(3));
                ob.setDepart(r.getString(4));

                stdlist.add(ob);//adding object to list
                //System.out.println(stdlist);
                }
            }catch (Exception e) {System.out.println(e);}

        return stdlist;//returning the current list
    }
    //---------------------------------method for searching by id ----------------------------
    public StdModel searchbyid(int id)                      //searchstudent
    {
        StdModel sr= new StdModel();
        String q="select * from std_table where id = "+id;  //passing the id in the sql query and
        try {
            Statement st=cnt.createStatement();
            ResultSet r =st.executeQuery(q);

            if(r.next())
            {
                sr.setId(r.getInt(1));//Retrieves the value of the designated column in the current row of this ResultSet object as an int in the Java.
                sr.setName(r.getString(2));
                sr.setRoll(r.getInt(3));
                sr.setDepart(r.getString(4));
            }
        }catch (Exception e){System.out.println(e);}

        return sr;//returning the current searched object
    }
//
//    //---------------------------method for update student details------------------------
    public void update(StdModel S)
    {
        String q="update std_table set name=?,roll=?,depart=? where id=?";

        try {
            PreparedStatement ps=cnt.prepareStatement(q)/*This method accepts a query (parameterized) and returns a PreparedStatement object.*/;

            ps.setInt(4,S.getId());
            ps.setString(1, S.getName());
            ps.setInt(2,S.getRoll());
            ps.setString(3, S.getDepart());

            ps.executeUpdate();//method to add a row to the table.

        }catch (Exception e) {System.out.println(e);}

    }
//    //----------------------------------method for deletition------------------
    public void delete(int id)
    {
        String q="delete from std_table where id=?";
        try {

            PreparedStatement st =cnt.prepareStatement(q);
            st.setInt(1, id);
            st.executeUpdate();

        } catch (Exception e) {System.out.println(e);}

    }
}

