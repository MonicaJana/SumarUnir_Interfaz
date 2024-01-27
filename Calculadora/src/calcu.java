import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcu extends JFrame {
    private JButton Suma;
    private JButton Seno;
    private JButton LogaritmoNatural;
    private JButton Resta;
    private JButton Multiplicacion;
    private JButton Division;
    private JButton Potencia;
    private JButton Coseno;
    private JButton LogaritmoBase10;
    private JButton Tangente;
    private JButton Redondeo;
    private JButton RaizCuadrada;
    private JButton Factorial;
    private JButton ParteEntera;
    private JButton ValorAbsoluto;
    private JButton Limpiar;
    private JTextField txtValor1;
    private JTextField txtValor2;
    private JTextField txtValor3;
    private JTextField txtResultado;
    private JPanel panel;

    public calcu() {
        super("Calculadora");
        setContentPane(panel);

        Suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble((txtValor1.getText()));
                    Double val2 = Double.parseDouble((txtValor2.getText()));
                    double recibe_resultado = val1 + val2;
                    txtResultado.setText(Double.toString((recibe_resultado)));
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"No se puede realizar la operación");
                }

            }
        });
        Resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble((txtValor1.getText()));
                    Double val2 = Double.parseDouble((txtValor2.getText()));
                    double recibe_resultado = val1 - val2;
                    txtResultado.setText(Double.toString((recibe_resultado)));
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"No se puede realizar la operación");
                }

            }
        });
        Multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble((txtValor1.getText()));
                    Double val2 = Double.parseDouble((txtValor2.getText()));
                    double recibe_resultado = val1 * val2;
                    txtResultado.setText(Double.toString((recibe_resultado)));
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null,"No se puede realizar la operación");
                }

            }
        });
        Division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble((txtValor1.getText()));
                    Double val2 = Double.parseDouble((txtValor2.getText()));
                    double recibe_resultado = val1 / val2;
                    txtResultado.setText(Double.toString((recibe_resultado)));
                    if(val2 == 0){
                        JOptionPane.showMessageDialog(null,"No se puede dividir para cero");
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la operación");

                }

            }
        });
        Potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble(txtValor1.getText());
                    Double val2 = Double.parseDouble(txtValor2.getText());
                    double recibe_resultado = Math.pow(val1, val2);
                    txtResultado.setText(Double.toString(recibe_resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la operación");
                }

            }
        });
        Seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble(txtValor3.getText());
                    double recibe_resultado = Math.sin(val1);
                    txtResultado.setText(Double.toString(recibe_resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la operación");
                }

            }
        });
        Coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble(txtValor3.getText());
                    double recibe_resultado = Math.cos(val1);
                    txtResultado.setText(Double.toString(recibe_resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la operación");
                }

            }
        });
        Tangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble(txtValor3.getText());
                    double recibe_resultado = Math.tan(val1);
                    txtResultado.setText(Double.toString(recibe_resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la operación");
                }

            }
        });
        RaizCuadrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble(txtValor3.getText());
                    double recibe_resultado = Math.sqrt(val1);
                    txtResultado.setText(Double.toString(recibe_resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la operación");
                }

            }
        });
        ValorAbsoluto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble(txtValor3.getText());
                    double recibe_resultado = Math.abs(val1);
                    txtResultado.setText(Double.toString(recibe_resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la operación");
                }

            }
        });
        LogaritmoNatural.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble(txtValor3.getText());
                    double recibe_resultado = Math.log(val1);
                    txtResultado.setText(Double.toString(recibe_resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la operación");
                }

            }
        });
        LogaritmoBase10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble(txtValor3.getText());
                    double recibe_resultado = Math.log10(val1);
                    txtResultado.setText(Double.toString(recibe_resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la operación");
                }

            }
        });
        Redondeo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble(txtValor3.getText());
                    double recibe_resultado = Math.round(val1);
                    txtResultado.setText(Double.toString(recibe_resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la operación");
                }

            }
        });
        Factorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int val1 = Integer.parseInt(txtValor3.getText());
                    long resultado = calcularFactorial(val1);
                    txtResultado.setText(Long.toString(resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la operación");
                }
            }
            private long calcularFactorial(int n) {
                if (n < 0) {
                    throw new IllegalArgumentException("El factorial no está definido para números negativos");
                }
                if (n == 0 || n == 1) {
                    return 1;
                }
                return n * calcularFactorial(n - 1);
            }
        });
        ParteEntera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double val1 = Double.parseDouble(txtValor1.getText());
                    Double val2 = Double.parseDouble(txtValor2.getText());
                    double recibe_resultado = val1 / val2;
                    int parteEntera = (int) recibe_resultado;
                    txtResultado.setText(Integer.toString(parteEntera));
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "No se puede realizar la operación");
                }

            }
        });
        Limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtValor1.setText("");
                txtValor2.setText("");
                txtValor3.setText("");
                txtResultado.setText("");
            }
        });
    }
}
