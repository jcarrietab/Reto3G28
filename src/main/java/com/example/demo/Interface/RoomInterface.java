/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Inteface;

import com.example.demo.Modelo.Room;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Juan Carlos Arrieta Bustos
 */
public interface RoomInterface extends CrudRepository<Room, Integer> {
    
}
