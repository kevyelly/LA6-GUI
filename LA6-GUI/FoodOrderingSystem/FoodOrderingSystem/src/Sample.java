import javax.swing.*;

public class Sample extends JFrame{
    private JPanel pMain;
    private JCheckBox cbPizza;
    private JCheckBox cbBurger;
    private JCheckBox cbFries;
    private JCheckBox cbSoftDrinks;
    private JCheckBox cbTea;
    private JCheckBox cbSundae;
    private JRadioButton rbNone;
    private JRadioButton rbFive;
    private JRadioButton rbTen;
    private JRadioButton rbFifteen;
    private JButton bOrder;

    Sample(){
        bOrder.addActionListener(e -> {
            JRadioButton[] dc = {rbNone, rbFive, rbTen, rbFifteen};
            JCheckBox[] food = {cbPizza, cbBurger, cbFries, cbSoftDrinks, cbTea, cbSundae};
            int[] price  = {100, 80, 65, 55, 50, 40};
            double[] disc = {1.0, 0.95, 0.90, 0.85};
            double total = 0;

            for(int i = 0; i < food.length;i++){
                if(food[i].isSelected()){
                    total+= price[i];
                }
            }
            for(int i = 0; i < dc.length;i++){
                if(dc[i].isSelected()){
                    total *= disc[i];
                }
            }

            JOptionPane.showMessageDialog(null, "Total: " + total);


        });
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        s.setContentPane(s.pMain);
        s.setSize(400, 400);
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
        s.setTitle("Food Ordering System");
    }

}
