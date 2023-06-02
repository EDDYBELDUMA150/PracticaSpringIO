/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.Usuarios.Service;

import com.tendencias.m5b.Usuarios.Model.Roles;
import com.tendencias.m5b.Usuarios.Repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author OWNER
 */
public class RolServicempl extends GenericServiceImpl<Roles, Integer> implements GenericService<Roles, Integer>{

    @Autowired
    RolRepository rolRepository;
    
    @Override
    public CrudRepository<Roles, Integer> getDao() {
        return rolRepository;
    }
    
}
