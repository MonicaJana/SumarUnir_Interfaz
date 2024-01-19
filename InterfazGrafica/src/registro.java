import com.sun.source.tree.TryTree;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicReference;

public class registro extends JFrame{
    private JPanel jpanel1;
    private JTextField txtval1;
    private JTextField textval2;
    private JButton UNIONButton;
    private JButton CERRARButton;
    private JButton SALUDARButton;
    private JLabel Valor2;
    private JButton LIMPIARButton;
    private JTextField resultado;
    private JButton UNIONButton1;
    private JTextField salidaSuma;
    private JTextField salidaUnion;

    //Funcion con el nombre del form
    public registro(){
        super("OPERACIONES");
        setContentPane(jpanel1);
        CERRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
        LIMPIARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtval1.setText("");
                textval2.setText("");
            }
        });
        UNIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    double valor1= Double.parseDouble(txtval1.getText());
                    double valor2=Double.parseDouble(textval2.getText());
                    double suma= valor1+valor2;
                    salidaSuma.setText(Double.toString(suma));
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"No se puede sumar");
                }



            }
        });
        UNIONButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salidaUnion.setText(txtval1.getText()+textval2.getText());
            }
        });
    }
}
