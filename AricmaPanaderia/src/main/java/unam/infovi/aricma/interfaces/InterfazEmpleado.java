/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unam.infovi.aricma.interfaces;

import unam.infovi.aricma.model.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SantillanAngelica
 */
@Repository
public interface InterfazEmpleado extends CrudRepository<Empleado, Integer> {
    
}
