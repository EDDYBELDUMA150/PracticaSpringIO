/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.Usuarios.Repository;

import com.tendencias.m5b.Usuarios.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author OWNER
 */
public interface PersonaRepository extends JpaRepository<Persona, Integer>{
    @Query(value = "Select * from Persona u where u.nombre = :nombre", nativeQuery = true)
    public Persona buscarPersona(String nombre);
}
