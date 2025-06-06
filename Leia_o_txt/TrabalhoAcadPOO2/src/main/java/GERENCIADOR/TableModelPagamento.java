/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GERENCIADOR;

import DOMAIN.Pagamento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 2022222760020
 */
public class TableModelPagamento extends AbstractTableModel{
    private List lista  = new ArrayList();  

    @Override
    public int getColumnCount() {
        return 4;   // Quantidade de colunas da TABELA
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Pagamento pagar = (Pagamento) lista.get(rowIndex);
        switch ( columnIndex ) {
            case 0: return pagar.getId_pagamento();
            case 1: return pagar.getAluno().getTipoPlano();
            case 2: return pagar.getValorPagamento();
            case 3: return pagar.getDiaPagamento();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String nomes[] = {"Id Pagamento", "Tipo do Plano", "Valor do Plano", "Data do Pagamento"};
        return nomes[column];
    }
    
    
    public Object getItem (int rowIndex) {
        return lista.get(rowIndex);        
    }
    
    public void adicionar (Object obj) {
        lista.add(obj);
        fireTableRowsInserted( lista.size() - 1, lista.size() - 1 );
        
    }
    
    public void remover (int indice) {
        lista.remove(indice);
        fireTableRowsDeleted( indice, indice );
        
    }
    
    public void setLista(List novaLista) {
        if ( novaLista == null || novaLista.isEmpty()) {
            if ( !lista.isEmpty() ) {
                lista.clear();
                fireTableRowsDeleted(0,0);
            }
        } else {
            lista = novaLista;
            fireTableRowsInserted( 0, lista.size() - 1);
        }
        
    }
    
    public List getLista() {
        return lista;
    }
}
