/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control_salones.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.event.EventListenerList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author hym
 * @param <T>
 */
public abstract class AbstractCustomListTableModel<T> implements  TableModel{
    
    private EventListenerList listenerList;
    private List columnsNames;
    private List<T> data;

    public AbstractCustomListTableModel() {
        data = new java.util.ArrayList();
        columnsNames = new ArrayList();
        listenerList = new EventListenerList();       
    }

    public AbstractCustomListTableModel(List columnsNames) {
        this();
        if (columnsNames == null) throw new IllegalArgumentException("columnsNames can't be null");
        else this.columnsNames.addAll(this.columnsNames);
        
    }
    
    
     @Override
    public void addTableModelListener(TableModelListener l) {
        listenerList.add(TableModelListener.class, l);
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        listenerList.remove(TableModelListener.class, l);
    }

    /**
     * Método conveniente para obtener obtener una lista con 
     * los TableModelListeners suscriptos a nuestro modelo.
     * NO es parte de la interfaz TableModel
     */ 
    public TableModelListener[] getTableModelListeners() {
        return listenerList.getListeners(TableModelListener.class);
    }

    /**
     * Método general para notificar a los {@code TableModelListeners} 
     * que ha ocurrido un evento.
     * Nota: Los listeners son notificados en orden inverso al de suscripción.
     */
    protected void notifyTableChanged(TableModelEvent e) {
        TableModelListener[] listeners = getTableModelListeners();
        for (int i = listeners.length - 1; i >= 0; i--) {
            listeners[i].tableChanged(e);
        }
    }

    /**
     * Notifica que el header de la tabla ha cambiado.
     */
    protected void notifyTableHeaderChanged() {
        TableModelEvent e = new TableModelEvent(this, TableModelEvent.HEADER_ROW);
        notifyTableChanged(e);
    }    

    /**
     * Notifica que han sido insertadas nuevas filas.
     *
     * @param firstRow El índice de la primera fila insertada.
     * @param lastRow El índice de la última fila insertada.
     */    
    protected void notifyTableRowsInserted(int firstRow, int lastRow) {
        TableModelEvent e = new TableModelEvent(this, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);
        notifyTableChanged(e);
    }    

    /**
     * Notifica que una o más filas en un rango han sido modificadas.
     * 
     * @param firstRow El índice de la primera fila en el rango.
     * @param lastRow El índice de la última fila en el rango.
     */    
    protected void notifyTableRowsUpdated(int firstRow, int lastRow) {
        TableModelEvent e = new TableModelEvent(this, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.UPDATE);
        notifyTableChanged(e);
    }
    
    /**
     * Notifica que una o más filas en un rango han sido borradas.
     * 
     * @param firstRow El índice de la primera fila en el rango.
     * @param lastRow El índice de la última fila en el rango.
     */        
    protected void notifyTableRowsDeleted(int firstRow, int lastRow) {
        TableModelEvent e = new TableModelEvent(this, firstRow, lastRow, TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE);
        notifyTableChanged(e);
    }
    
    /**
     * Notifica que el valor de una celda ha cambiado.
     * 
     * @param row El índice de la fila a la que pertenece la celda.
     * @param column El índice de la columna a la que pertenece la celda.
     */    
    protected void notifyTableCellUpdated(int row, int column) {
        TableModelEvent e = new TableModelEvent(this, row, row, column);
    }
    
      
    
    
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnsNames.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex < 0 || columnIndex >= getColumnCount()) {
            throw new ArrayIndexOutOfBoundsException(columnIndex);
        } else {
            return columnsNames.get(columnIndex).toString();
        }
    
    }

    @Override
    public  boolean isCellEditable(int i, int i1){
        return true;
    }

    
    
    
    public void addRow(T row){
        int rowIndex = data.size();
        data.add(row);
        notifyTableRowsInserted(rowIndex, rowIndex);
    }
    
    public void addRows(List<T> rows){
        if(!rows.isEmpty()){
            int firstRow = data.size();
            data.addAll(rows);
            int lastRow = data.size() -1;
            notifyTableRowsInserted(firstRow, lastRow);
        }
    }
    
    public void addRow(T row, int rowIndex){
        data.add(rowIndex, row);
        notifyTableRowsInserted(rowIndex, rowIndex);
    }
    
    public void notifyObjectUpdated(T object){
        int index = data.indexOf(object);
        if(index >= 0) notifyTableRowsUpdated(index, index);
    }

    public void deleteRow(T row){
        int rowIndex;
        while((rowIndex = data.indexOf(row)) > -1){
            notifyTableRowsDeleted(rowIndex, rowIndex);
        }
    }
    
    public void deleteRow(int rowIndex){
        if (data.remove(data.get(rowIndex)))
            notifyTableRowsDeleted(rowIndex, rowIndex);
    }

    public void deleteRows(int firstRow, int lastRow){
        if(firstRow < 0 || lastRow < 0 || firstRow > lastRow)
            throw new IllegalArgumentException("Illegal index exception");
        else{
            for ( int i = firstRow; i <= lastRow; i++){
                data.remove(i);
            }
            notifyTableRowsDeleted(firstRow, lastRow);
        }
    }
    
    public void clearTableData(){
        if(!data.isEmpty()){
            int lastRow = data.size() - 1;
            data.clear();
            notifyTableRowsDeleted(0, lastRow);
        }
    }
    
    public T getRow(int rowIndex){
        return data.get(rowIndex);
    }
    
    
    public List<T> getData(){
        return  Collections.unmodifiableList(data);
    }
    
    public void setColumnsIdentifies(List columnIdentifies){
        this.columnsNames.clear();
        this.columnsNames.addAll(columnIdentifies);
        notifyTableHeaderChanged();
    }
    
}
