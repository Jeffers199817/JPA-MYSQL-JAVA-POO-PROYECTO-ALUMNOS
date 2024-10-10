/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Materia;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JEFFERSON ALQUINGA
 */
public class ControladoraPersistencia {
    
    AlumnoJpaController aluJPA = new AlumnoJpaController();
    CarreraJpaController carreJPA = new CarreraJpaController();
    MateriaJpaController mateJPA = new MateriaJpaController();
    public ArrayList<Carrera> mostrarListaCarreracarre;

    public void crearAlumno(Alumno alu1) {
       aluJPA.create(alu1);
    }
    
    public void eliminarAlumno(int id){
        try {
            aluJPA.destroy(id);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarAlumno(Alumno alu){
        try {
            aluJPA.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Alumno mostrarAlumno(int id){
       return  aluJPA.findAlumno(id);
    }
  
    public ArrayList<Alumno> mostrarListaAlumnos(Alumno alu3){ 
        List<Alumno> listita = aluJPA.findAlumnoEntities();
        ArrayList<Alumno> Alumno3 = new ArrayList<Alumno>(listita);
        return Alumno3;
    }

    
    
    
    
    public void crearCarrera(Carrera carre) {
        
        carreJPA.create(carre);
        
    }

    public void eliminarCarrera(int id) {
    
        try {
            carreJPA.destroy(id);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        
        try {
            carreJPA.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera mostrarCarrera(int id) {
        
        return carreJPA.findCarrera(id);
    }

    public ArrayList<Carrera> mostrarListaCarrera(Carrera carre) {
        
        List<Carrera> miListaCarrera = carreJPA.findCarreraEntities();
        ArrayList<Carrera> carrera = new ArrayList<Carrera>(miListaCarrera);
        
        return carrera;
        
        
    }
    
    
    
    
    public void crearMateria(Materia mate) {
        
        mateJPA.create(mate);
        
    }

    public void eliminarMateria(int id) {
    
        try {
            mateJPA.destroy(id);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia mate) {
        
        try {
            mateJPA.edit(mate);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia mostrarMateria(int id) {
        
        return mateJPA.findCarrera(id);
    }

    public ArrayList<Materia> mostrarListaMateria(Materia mate) {
        
        List<Materia> miListaMaterias = mateJPA.findMateriaEntities();
        ArrayList<Materia> listaMaterias = new ArrayList<Materia>(miListaMaterias);
        
        return listaMaterias;
        
        
    }
    
}
