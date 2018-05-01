/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.descompila.tests;

import br.com.descompila.model.bean.Categoria;
import br.com.descompila.model.bean.Produto;
import br.com.descompila.model.dao.ProdutoDAO;

/**
 *
 * @author Samuelson
 */
public class ProdutoTest {

    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();

        dao.remove(2);

    }
}
