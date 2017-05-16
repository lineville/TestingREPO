import javax.swing.*;
import java.awt.*;

/**
 * Created by lineville on 5/16/17.
 */
public class View {

    private Model model;
    private Controller controller;

    public View(Model m, Controller c){

        this.model = m;
        this.controller = c;

        JFrame frame = new JFrame();
        frame.setSize(400,400);

        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout());
        for(int i: model.getNums()){
            buttons.add(new JButton(Integer.toString(i)));
        }

        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton mult = new JButton("*");
        JButton divide = new JButton("/");
        JButton exp = new JButton("^");
        JButton exec = new JButton("Enter");
        buttons.add(plus);
        buttons.add(minus);
        buttons.add(mult);
        buttons.add(divide);
        buttons.add(exp);
        buttons.add(exec);


        JTextField textField = new JTextField("");
        frame.add(buttons);
        frame.add(textField);
        frame.pack();
        frame.setVisible(true);



    }



    public static void main(String[] args){
        View v = new View(new Model(84), new Controller(""));
    }
}
