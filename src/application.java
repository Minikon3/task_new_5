import javax.swing.*;
import java.awt.*;

public class application extends JFrame {
    private JPanel panel1=new JPanel();
    private JButton button_ACMilan = new JButton("AC Milan");
    private JButton button_RealMadrid = new JButton("Real Madrid");
    private JLabel result = new JLabel();
    private JLabel last_scorer = new JLabel();
    private JLabel winner = new JLabel();
    private int milan=0;
    private  int madrid=0;
    private void upd(String stat){
        last_scorer.setText("Last Score: "+stat);
        result.setText("Result: "+milan+" X "+madrid);
        String win_result="DRAW";
        if (milan>madrid){
            win_result="AC Milan";
        }
        else if (madrid>milan){
            win_result="Real Madrid";
        }
        winner.setText("Winner: "+win_result);
    }
    private application(){

        setContentPane(panel1);
        setSize(250,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        panel1.setBackground(Color.gray);
        add(button_ACMilan);
        add(button_RealMadrid);
        add(result);
        add(last_scorer);
        add(winner);
        button_ACMilan.addActionListener(e->{
            milan++;
            upd("AC Milan");
        });
        button_RealMadrid.addActionListener(e->{
            madrid++;
            upd("Real Madrid");
        });
    }
    public static void main(String[] args)
    {
        new application();
    }
}


