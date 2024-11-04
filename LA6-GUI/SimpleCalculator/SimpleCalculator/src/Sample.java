import javax.swing.*;
import javax.xml.transform.Result;
import java.util.Objects;

public class Sample extends JFrame {

    private JTextField tfFirst;
    private JComboBox cbOp;
    private JTextField tfSecond;
    private JTextField tfResult;
    private JPanel pMain;
    private JButton bComp;

    Sample(){
        bComp.addActionListener(e -> {
            int first = 0;
            int result = 0;
            if (!Objects.equals(tfFirst.getText(), "")) {
                first = Integer.parseInt(tfFirst.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Enter first num");
            }
            int second = 0;
            if (!Objects.equals(tfSecond.getText(), "")) {
                second = Integer.parseInt(tfSecond.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Enter second num");
            }

            if(cbOp.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Choose an operation");
            }else if(cbOp.getSelectedIndex() == 1){

                result = first+second;
            }else if(cbOp.getSelectedIndex() == 2){
                result = first-second;
            }else if(cbOp.getSelectedIndex() == 3){
                result = first*second;
            } else if (cbOp.getSelectedIndex() == 4) {
               result = first/second; 
            }
            tfResult.setText(String.valueOf(result));
        });
    }
    public static void main(String[] args) {
        Sample s = new Sample();
        s.setContentPane(s.pMain);
        s.setSize(400, 200);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Simple Calculator");
    }

}
