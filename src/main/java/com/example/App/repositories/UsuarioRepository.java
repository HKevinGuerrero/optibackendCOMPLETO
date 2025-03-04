/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.App.repositories;

import com.example.App.entities.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Daniel BC 2
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
   Optional<Usuario> findByUserName(String userName);
}
