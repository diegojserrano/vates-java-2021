package com.example.demo;


import javax.persistence.*;

@Entity @Table(name = "Personas")
public class Persona {

    @Id
    @Column(name = "Id")
    private int documento;

    @Column(name = "Nombre")
    @Basic
    private String nombre;

    @Column(name = "Apellido")
    @Basic
    private String apellido;

    @Column(name = "Edad")
    @Basic
    private int edad;

    public Persona() {
    }

    public Persona(int documento, String nombre, String apellido, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "documento=" + documento +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
