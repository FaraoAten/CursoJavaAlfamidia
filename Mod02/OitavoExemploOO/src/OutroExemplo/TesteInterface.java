package OutroExemplo;

import java.awt.HeadlessException;
import java.awt.event.*;
import javax.swing.*;

public class TesteInterface extends JFrame implements ActionListener{
    
    JPanel panel;
    JTextField text;
    JButton button;

    public TesteInterface(String title) {
        super(title);
        this.panel = new JPanel();
        this.text = new JTextField(30);
        this.button = new JButton("Clique Aqui");
        button.addActionListener(this);
        panel.add(text);
        panel.add(button);
        this.add(panel);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {//Método definido na interface ActionListener, o nome sempre é o mesmo, mas muda a implementação sempre que é utilizado.
        text.setText("O botão foi clicado.");
    }
    
}
