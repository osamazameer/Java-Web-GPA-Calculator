package com;

import java.sql.*;
import java.util.ArrayList;

public class StudentDao {

    Connection connection = null;

    void Connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "");
        } catch (Exception ex) {

        }

    }

    public int InsertRecord(Student s) {
        int rs = 0;
        try {
            Connection();
            String qry = "insert into studentsrecord values (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(qry);
            ps.setString(1, s.name);
            ps.setString(2, s.sem);
            ps.setInt(3, s.roll);
            rs = ps.executeUpdate();
            connection.close();
            if (rs > 0) {
                rs = 1;
            } else {
                rs = 0;
            }

        } catch (Exception ex) {

        }
        return rs;
    }
     public int saveSgpa(Student s) {
        int rs = 0;
        try {
            Connection();
            String qry = "insert into sgpa values (?,?,?)";
            PreparedStatement ps = connection.prepareStatement(qry);
            ps.setInt(1, s.roll);
            ps.setString(2, s.sem);
            ps.setFloat(3, s.sgpa);
            rs = ps.executeUpdate();
            if (rs > 0) {
                rs = 1;
            } else {
                rs = 0;
            }

        } catch (Exception ex) {

        }
        return rs;
    }
    
    public ResultSet sgpaCal(int roll)
    {
        ResultSet rs = null;
        try
        {
            Connection();
            String qry="Select AVG(sgpa) from sgpa where roll=?";
            PreparedStatement pst = connection.prepareStatement(qry);
            pst.setInt(1,roll);
            rs=pst.executeQuery();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return rs;
        
    }

    int UpdateRecord(Student s) {
        int rs = 0;
        try {
            Connection();
            String qry = "update student set name = ? where intId = ?";
            PreparedStatement ps = connection.prepareStatement(qry);
            ps.setString(1, s.name);
//            ps.setInt(2, s.id);
            rs = ps.executeUpdate();
            connection.close();
            if (rs > 0) {
                rs = 1;
            } else {
                rs = 0;
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());

        }
        return rs;
    }

    int DeleteRecord(int a) {
        int rs = 0;
        try {
            Connection();
            String qry = "delete from student where intId = ?";
            PreparedStatement ps = connection.prepareStatement(qry);

            ps.setInt(1, a);
            rs = ps.executeUpdate();
            connection.close();
            if (rs > 0) {
                rs = 1;
            } else {
                rs = 0;
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());

        }
        return rs;
    }

    
    public ArrayList<Student> selectAll(int rollno) {
        ArrayList<Student> list = new ArrayList<Student>();
        ResultSet rs = null;
        try {
            Connection();
            String qry="Select * from sgpa where roll=?";
            PreparedStatement pst = connection.prepareStatement(qry);
            pst.setInt(1, rollno);
            rs = pst.executeQuery();
            while (rs.next()) {
                Student s = new Student();
                s.roll = rs.getInt(1);
                s.sem = rs.getString(2);
                s.sgpa = rs.getFloat(3);

                list.add(s);
            }

        } catch (Exception ex) {

        }

        return list;
    }

   public ResultSet indStudent(int rollNo){
        ResultSet rs = null;
        try{
            String query = "SELECT * FROM studentdata WHERE roll=?";
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setInt(1, rollNo);
            rs = pst.executeQuery();
            return rs;

        }        
        catch(Exception ex){
            rs = null;
            System.out.print(ex);
        }
        
        return rs;
    }

    public Student selectByID(Student s) {
        Connection();
        ResultSet rs = null;
        Student s1 = new Student();
        try {
            String qry = "select * from student where intId = ?";
            PreparedStatement pst = connection.prepareStatement(qry);
//            pst.setInt(1, s.id);
            rs = pst.executeQuery();
            if (rs.next()) {
//                s1.id = rs.getInt(1);
                s1.name = rs.getString(2);
                s1.Age = rs.getInt(3);
                s1.CNIC = rs.getInt(4);

            }
        } catch (Exception ex) {

        }

        return s1;
    }

    public int Rinsert(Student s)
    {
        int res = 0;
        try
        {
            Connection();
            String qry="insert into SignUp value (?,?)";
            PreparedStatement pst= connection.prepareStatement(qry);
            pst.setString(1,s.name);
            pst.setString(2,s.password);
            res=pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println(ex);  
        }
        return res;
    }
     public int sgpaSave(Student s)
    {
        int res = 0;
        try
        {
            Connection();
            String qry="insert into studentData value (?,?,?,?,?,?)";
            PreparedStatement pst= connection.prepareStatement(qry);
            pst.setInt(1,s.roll);    
            pst.setFloat(2,s.marks);
            pst.setString(3,s.grade);
            pst.setInt(4,s.ch);
            pst.setString(5,s.sem);
            pst.setString(6,s.sub);
            res=pst.executeUpdate();
        }
        catch(Exception ex)
        {
            System.out.println(ex);  
        }
        return res;
    }
    
    public ResultSet login(Student s)
    {
        ResultSet rs = null;
        try
        {
            Connection();
            String qry="Select * from studentsrecord where name=?";
            PreparedStatement pst= connection.prepareStatement(qry);
            pst.setString(1,s.name);
            rs=pst.executeQuery();
            return rs;
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            return null;
        }
        
    }
}
