/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

/**
 *
 * @author JEFFERSON ALQUINGA
 */
public class AlumnoController {
        
    Alumno alu1 = new Alumno();
    Carrera carre = new Carrera();
    
    Materia mate = new Materia();
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
   
    
    public void crearAlumno( Alumno alu1){ 
        controlPersis.crearAlumno(alu1);
    }
    
    //Crear el metodo para elimnar un alumno con el id 
    
    public void eliminarAlumno(int id){
        controlPersis.eliminarAlumno(id);
    }
    
    
    //editar un alumno su nombre 
    public void editarAlumno(Alumno alu1){
        
        controlPersis.editarAlumno(alu1);
    }
    
    
    public Alumno mostrarAlumno(int id){
       
        return controlPersis.mostrarAlumno(id);
    }
    
    
    public ArrayList<Alumno> mostrarListaAlumnos(Alumno alu4){
        
        return controlPersis.mostrarListaAlumnos(alu4);
    }
    
    
    
      
    public void crearCarrera( Carrera carre){ 
        controlPersis.crearCarrera(carre);
    }
    
    //Crear el metodo para elimnar un alumno con el id 
    
    public void eliminarCarrera(int id){
        controlPersis.eliminarCarrera(id);
    }
    
    
    //editar un alumno su nombre 
    public void editarCarrera(Carrera carre){
        
        controlPersis.editarCarrera(carre);
    }
    
    
    public Carrera mostrarCarrera(int id){
       
        return controlPersis.mostrarCarrera(id);
    }
    
    
    public ArrayList<Carrera> mostrarListaCarrera(Carrera carre){
        
        return controlPersis.mostrarListaCarrera(carre);
    }
    
    
    public void crearMateria( Materia mate ){ 
        controlPersis.crearMateria(mate);
    }
    
    //Crear el metodo para elimnar un alumno con el id 
    
    public void eliminarMateria(int id){
        controlPersis.eliminarMateria(id);
    }
    
    
    //editar un alumno su nombre 
    public void editarMateria(Materia mate){
        
        controlPersis.editarMateria(mate);
    }
    
    
    public Materia mostrarMateria(int id){
       
        return controlPersis.mostrarMateria(id);
    }
    
    
    public ArrayList<Materia> mostrarListaCarrera(Materia mate){
        
        return controlPersis.mostrarListaMateria(mate);
    }
}
