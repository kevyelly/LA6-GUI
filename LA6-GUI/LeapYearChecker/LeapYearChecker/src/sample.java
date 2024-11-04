import javax.swing.*;

public class sample extends JFrame{


    private JPanel panel1;
    private JTextField tfYear;
    private JButton bCheck;
    private JPanel pMain;

    sample(){
        bCheck.addActionListener(e -> {
            int year = Integer.parseInt(tfYear.getText());
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                JOptionPane.showMessageDialog(null, "Leap Year");
            }else{
                JOptionPane.showMessageDialog(null, "Not a Leap Year");
            }
        });
    }
    public static void main(String[] args) {
        sample s = new sample();
        s.setContentPane(s.pMain);
        s.setSize(300, 200);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Leap Year Checker");
    }
}
