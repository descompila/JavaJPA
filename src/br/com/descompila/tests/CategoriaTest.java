/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.descompila.tests;

import br.com.descompila.connection.ConnectionFactory;
import br.com.descompila.model.bean.Categoria;
import br.com.descompila.model.dao.CategoriaDAO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Samuelson
 */
public class CategoriaTest {
    
    public static void main(String[] args) {
        
        
        CategoriaDAO dao = new CategoriaDAO();
       
        dao.remove(3);
        
        
    }
    
}
