package com.implDao;

import com.connexion.OurConnextion;
import com.models.Etudiant;
import com.interfaceDao.InterfaceDao;
import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EtudiantDao implements  InterfaceDao<Etudiant>{


    public Etudiant save(Etudiant e){
        System.out.println("save etudiant");
        DataSource mysqlDataSoure = OurConnextion.getMySQLDataSource();
        if(mysqlDataSoure !=null){
            try {
                Date dt = new Date();
                PreparedStatement stat = mysqlDataSoure.
                        getConnection().
                        prepareStatement("insert into etudiants (name,num_apogee,cin, created_at, updated_at) values(?,?,?,?,?);");
                stat.setString(1, e.getName());
                stat.setInt(2,e.getNum_apogee());
                stat.setString(3,e.getCin());
                stat.setDate(4,new java.sql.Date(dt.getTime()));
                stat.setDate(5,new java.sql.Date(dt.getTime()));
                stat.executeUpdate();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
            }

        return e;
    }
    public void remove(Etudiant e){
        System.out.println("remove etudiant");
        DataSource mysqlDataSoure = OurConnextion.getMySQLDataSource();
        if(mysqlDataSoure !=null){
            try {
                Date dt = new Date();
                PreparedStatement stat = mysqlDataSoure.
                        getConnection().
                        prepareStatement("delete from etudiants where id=?;");

                stat.setInt(1,e.getId());
                stat.executeUpdate();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }


    }
    public Etudiant update (Etudiant e){
        Etudiant e1 = findeById(e.getId());
        if(e1 != null){
            System.out.println("update etudiant");
            DataSource mysqlDataSoure = OurConnextion.getMySQLDataSource();
            if(mysqlDataSoure !=null){
                try {
                    Date dt = new Date();
                    PreparedStatement stat = mysqlDataSoure.
                            getConnection().
                            prepareStatement("update etudiants set name=?,num_apogee=?,cin=?, created_at=?, updated_at=? where id=?;");
                    stat.setString(1, e.getName());
                    stat.setInt(2,e.getNum_apogee());
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
    public Etudiant findeById(int id){
        System.out.println("find etudiant by ID");
        DataSource mysqlDataSoure = OurConnextion.getMySQLDataSource();
        Etudiant e = null;
        if(mysqlDataSoure !=null){
            try {
                Date dt = new Date();
                PreparedStatement stat = mysqlDataSoure.
                        getConnection().
                        prepareStatement("select * from etudiants where id=?;");

                stat.setInt(1,id);

                ResultSet rs = stat.executeQuery();
                if(rs.next()){
                    e = new Etudiant(rs.getInt("id"),
                            rs.getString("name"),
                            rs.getInt("num_apogee"),
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
    public List<Etudiant> all(){
        System.out.println("find all etudiants");
        DataSource mysqlDataSoure = OurConnextion.getMySQLDataSource();
        List<Etudiant> es = new ArrayList<Etudiant>();
        if(mysqlDataSoure !=null){
            try {
                Date dt = new Date();
                PreparedStatement stat = mysqlDataSoure.
                        getConnection().
                        prepareStatement("select * from etudiants ;");
                ResultSet rs = stat.executeQuery();
                while(rs.next()){
                    Etudiant e = new Etudiant(rs.getInt("id"),
                            rs.getString("name"),
                            rs.getInt("num_apogee"),
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
