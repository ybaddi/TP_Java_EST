package com.implDao;

import com.connexion.OurConnextion;
import com.interfaceDao.InterfaceDao;
import com.models.Professor;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProfessorDao implements  InterfaceDao<Professor>{


    public Professor save(Professor e){
        System.out.println("save Professor");
        DataSource mysqlDataSoure = OurConnextion.getMySQLDataSource();
        if(mysqlDataSoure !=null){
            try {
                Date dt = new Date();
                PreparedStatement stat = mysqlDataSoure.
                        getConnection().
                        prepareStatement("insert into professors (name,cin, cours, created_at, updated_at) values(?,?,?,?,?);");
                stat.setString(1, e.getName());
                stat.setString(2,e.getCin());
                stat.setString(3,e.getCours());
                stat.setDate(4,new java.sql.Date(dt.getTime()));
                stat.setDate(5,new java.sql.Date(dt.getTime()));
                stat.executeUpdate();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
            }

        return e;
    }
    public void remove(Professor e){
        System.out.println("remove Professor");
        DataSource mysqlDataSoure = OurConnextion.getMySQLDataSource();
        if(mysqlDataSoure !=null){
            try {
                Date dt = new Date();
                PreparedStatement stat = mysqlDataSoure.
                        getConnection().
                        prepareStatement("delete from professors where id=?;");

                stat.setInt(1,e.getId());
                stat.executeUpdate();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }


    }
    public Professor update (Professor e){
        Professor e1 = findeById(e.getId());
        if(e1 != null){
            System.out.println("update Professor");
            DataSource mysqlDataSoure = OurConnextion.getMySQLDataSource();
            if(mysqlDataSoure !=null){
                try {
                    Date dt = new Date();
                    PreparedStatement stat = mysqlDataSoure.
                            getConnection().
                            prepareStatement("update professors set name=?,cours=?,cin=?, created_at=?, updated_at=? where id=?;");
                    stat.setString(1, e.getName());
                    stat.setString(2,e.getCours());
                    stat.setString(3,e.getCin());
                    stat.setDate(4,new java.sql.Date(e.getUpdated_at().getTime()));
                    stat.setDate(5,new java.sql.Date(dt.getTime()));
                    stat.setInt(6,e.getId());

                    stat.executeUpdate();
                }catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
        }
        return e1;
    }
    public Professor findeById(int id){
        System.out.println("find Professor by ID");
        DataSource mysqlDataSoure = OurConnextion.getMySQLDataSource();
        Professor e = null;
        if(mysqlDataSoure !=null){
            try {
                Date dt = new Date();
                PreparedStatement stat = mysqlDataSoure.
                        getConnection().
                        prepareStatement("select * from professors where id=?;");

                stat.setInt(1,id);

                ResultSet rs = stat.executeQuery();
                if(rs.next()){
                    e = new Professor(rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("cours"),
                            rs.getString("cin"),
                            rs.getDate("created_at"),
                            rs.getDate("updated_at"));
                }
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }

        return e;
    }
    public List<Professor> all(){
        System.out.println("find all Professors");
        DataSource mysqlDataSoure = OurConnextion.getMySQLDataSource();
        List<Professor> es = new ArrayList<Professor>();
        if(mysqlDataSoure !=null){
            try {
                Date dt = new Date();
                PreparedStatement stat = mysqlDataSoure.
                        getConnection().
                        prepareStatement("select * from professors ;");
                ResultSet rs = stat.executeQuery();
                while(rs.next()){
                    Professor e = new Professor(rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("cours"),
                            rs.getString("cin"),
                            rs.getDate("created_at"),
                            rs.getDate("updated_at"));
                    es.add(e);
                }
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }

        return es;
    }
}
