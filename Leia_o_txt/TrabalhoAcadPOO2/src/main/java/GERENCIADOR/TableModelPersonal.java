/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GERENCIADOR;

import DOMAIN.Personal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class TableModelPersonal extends AbstractTableModel {
    private List lista  = new ArrayList();  

    @Override
    public int getColumnCount() {
        return 6;   // Quantidade de colunas da TABELA
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Personal perso = (Personal) lista.get(rowIndex);
        switch ( columnIndex ) {
            case 0: return perso.getNome();
            case 1: return perso.getCpf();
            case 2: return perso.getDateNasc();
            case 3: return perso.geteMail();
            case 4: return perso.getTelefone();
            case 5: return perso.getNumeracaoCREF();

        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        String nomes[] = {"Nome", "CPF", "Data Nascimento", "E-mail", "Telefone", "CREF" };
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
