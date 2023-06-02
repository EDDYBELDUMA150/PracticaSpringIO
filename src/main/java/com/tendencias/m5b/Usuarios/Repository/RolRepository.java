/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tendencias.m5b.Usuarios.Repository;

import com.tendencias.m5b.Usuarios.Model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author OWNER
 */
public interface RolRepository extends JpaRepository<Roles, Integer>{
    @Query(value = "Select * from Roles u where u.nombre = :nombre", nativeQuery = true)
    public Roles buscarRoles(String nombre);
}
