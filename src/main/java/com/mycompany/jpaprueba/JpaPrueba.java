/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.AlumnoController;
import com.mycompany.jpaprueba.logica.Carrera;

import com.mycompany.jpaprueba.logica.Materia;
import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author JEFFERSON ALQUINGA
 */
public class JpaPrueba {

    public static void main(String[] args) {
        
       AlumnoController controladorAlu = new AlumnoController();
       Carrera carre = new Carrera();
       
       //CREAMOS LISTA DE MATERIAS Y LAS AGREGAMOS 
       LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
       //CREACIÓN CARRERA CON LISTA DE MATERIAS
       Carrera carre1 = new Carrera(1,"Ingenieria de Software", listaMaterias);
       Carrera carre2 = new Carrera(2,"Fisico matematico",listaMaterias);
       //GUARDAMOS CARRERA EN LA BD 
       
       controladorAlu.crearCarrera(carre1);
       controladorAlu.crearCarrera(carre2);
       //CREAMOS LAS MATERIAS
       Materia mat1 = new Materia(3,"Programación I ", "Cuatrimestre", carre1);
       Materia mat2 = new Materia(4,"Programación II ", "Trimestre", carre2);
       Materia mat3 = new Materia(5,"Programación avanzado ", "Semestre", carre2);
 
       
       //GUARDAMOS MATERIAS EN LA BASE DE DATOS
        
       controladorAlu.crearMateria(mat1);
       controladorAlu.crearMateria(mat2);
       controladorAlu.crearMateria(mat3);
       
       //AGREGAMOS LA LISTA DE MATERIAS 
       
       listaMaterias.add(mat1);
       listaMaterias.add(mat2);
       listaMaterias.add(mat3);
       
       carre1.setListaMaterias(listaMaterias);
       controladorAlu.editarCarrera(carre1);
       carre2.setListaMaterias(listaMaterias);
       controladorAlu.editarCarrera(carre2);
       //CREAMOS LOS ALUMNOS
       Alumno alu = new Alumno();
       Alumno alu1 = new Alumno(1,"Jefferson","Alquinga ", new Date(),carre1);
       Alumno alu2 = new Alumno(2,"Bernardo","Alquinga", new Date(), carre2);
       //GUARDAMOS EN LA BASE DE DATOS 
       controladorAlu.crearAlumno(alu1);
       controladorAlu.crearAlumno(alu2);
       
       
       
       
      
       //MOSTRAR EN TERMINAL 
        System.out.println("====================DATOS DE LA CARRERA UNIVERSITARIAS ");
        ArrayList<Carrera> carre11 = controladorAlu.mostrarListaCarrera(carre);
        for(Carrera carrera: carre11){ 
            System.out.println(" Existen las siguientes Carreras: ");
            System.out.println(carrera.getNombre());
        }
        System.out.println();
        
        
           System.out.println("====================DATOS DE LOS ALUMNOS======================= ");
        ArrayList<Alumno> alu11 = controladorAlu.mostrarListaAlumnos(alu);
        for(Alumno alu12: alu11){ 
            System.out.println(" Existen las siguientes Alumnos: ");
            System.out.println(alu12.toString());
        }
        System.out.println();
        
        
        Alumno alu23 = controladorAlu.mostrarAlumno(1);
        Alumno alu24 = controladorAlu.mostrarAlumno(2);
        
        
        System.out.println("EL alumno : "+ alu23.getId() + " "  + alu23.getNombre() + " " + alu23.getApellido());
        System.out.println("Esta incrito en el siguiente curso: " + alu23.getCarre().getNombre());
        System.out.println("Con las siguientes materias: " + alu23.getCarre().getListaMaterias());
        
        System.out.println("EL alumno : "+ alu24.getId() + " " + alu24.getNombre() + " " + alu24.getApellido());
        System.out.println("Esta incrito en el siguiente curso: " + alu24.getCarre().getNombre());
         System.out.println("Con las siguientes materias: " + alu24.getCarre().getListaMaterias().toString());
        
       
       
       
        //MOSTRAR EN TERMINAL 
        System.out.println("====================DATOS DE LA CARRERA UNIVERSITARIAS ");
        ArrayList<Carrera> carre12 = controladorAlu.mostrarListaCarrera(carre);
        for(Carrera carrera1: carre12){ 
            System.out.println(" Existen las siguientes Carreras: ");
            System.out.println(carrera1.getNombre());
        }
        System.out.println();
       
       
      
       
      
       
       
       
       /* Alumno alu =  new Alumno(2,"Bernardo","Alquinga", new Date());
        
        controladorAlu.crearAlumno(alu);*/
        
      // Alumno alu3= new Alumno(3,"Noelia","Alcivar", new Date());
        
       //controladorAlu.crearAlumno(alu3);
       //ELIMINAR UN ALUMNO 
       // controladorAlu.eliminarAlumno(3);
       
       //EDITAR UN ALUMNO 
       
       //alu3.setNombre("Jefferson");
       //controladorAlu.editarAlumno(alu3);
       
      /* //TRAER UN ALUMNO CON FIND
          System.out.println("=================TRAER ALUMNO CON FIND ================================");
       
        Alumno alu3= controladorAlu.mostrarAlumno(3);
        System.out.println(alu3.toString());
       
       
       //TRAER TODOS LOS ALUMNOS CON FINDENTITYS
       Alumno alu4 = new Alumno();
        System.out.println("Hola :"+ alu4.toString());
       
        System.out.println("=================TODOS LOS ALUMNOS CON FINDENTITYS============================= ");
        
       ArrayList<Alumno> alu5 = controladorAlu.mostrarListaAlumnos(alu4);
       
       for(Alumno alu6 : alu5){
           System.out.println(alu6.toString());
       }*/
      
      
      
    }
}
