/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParaPantallaCompletar;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Usuario
 */
public class Renderizador extends JCheckBox implements TableCellRenderer{
    private final JComponent component = new JCheckBox();

    /** Constructor de clase */
    public Renderizador() {
        setOpaque(true);
    }

    @Override
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
      //Color de fondo de la celda
      ( (JCheckBox) component).setBackground( new Color(167,218,251) );//[167,218,251]
      
      //obtiene valor boolean y coloca valor en el JCheckBox
      boolean b = ((Boolean) value);
      ( (JCheckBox) component).setSelected( b );
      
      return ( (JCheckBox) component);
  }
}