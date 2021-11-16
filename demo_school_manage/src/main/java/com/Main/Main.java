package com.Main;

import com.connexion.OurConnextion;
import com.implDao.ProfessorDao;
import com.interfaceDao.InterfaceDao;
import com.models.Professor;
import com.mysql.cj.jdbc.MysqlDataSource;
import com.implDao.EtudiantDao;

import com.models.Etudiant;

import javax.sql.DataSource;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DataSource mysqlDataSource = OurConnextion.getMySQLDataSource();

        System.out.println(mysqlDataSource);
        Etudiant e = new Etudiant("name", 12, "cin");
        InterfaceDao<Etudiant> eDao = new EtudiantDao();
        eDao.save(e);
        Etudiant e1 = eDao.findeById(2);
        System.out.println(e1);
        if(e1!=null) {
            e1.setName("baddi");
            eDao.update(e1);
            eDao.remove(e1);
        }

        List<Etudiant> es = eDao.all();
        for (Etudiant e2: es
             ) {
            System.out.println(e2);
        }

//        ///////////// Professor
        Professor p = new Professor("name", "java", "cin");
        InterfaceDao<Professor> pDao = new ProfessorDao();
        pDao.save(p);
        Professor p1 = pDao.findeById(2);
        System.out.println(p1);
        if(p1!=null) {
            p1.setName("baddi");
            pDao.update(p1);
            pDao.remove(p1);
        }

        List<Professor> ps = pDao.all();
        for (Professor p2: ps
        ) {
            System.out.println(p2);
        }
    }
}
