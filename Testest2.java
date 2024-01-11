import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Testest2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Down Payment Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(200, 200, 220));
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // ข้อความ
        JLabel homePriceLabel = new JLabel("Price:");
        homePriceLabel.setBounds(20, 20, 80, 25);
        panel.add(homePriceLabel);

        // กล่องข้อความ
        JTextField homePriceText = new JTextField(20);
        homePriceText.setBounds(55, 20, 150, 25);
        panel.add(homePriceText);

        // ข้อความ
        JLabel InterestLabel = new JLabel("Interest:");
        InterestLabel.setBounds(20, 80, 80, 25);
        panel.add(InterestLabel);

        // กล่องข้อความ
        JTextField InterestText = new JTextField(20);
        InterestText.setBounds(70, 80, 135, 25);
        panel.add(InterestText);

        // ข้อความ
        JLabel YearLabel = new JLabel("Year:");
        YearLabel.setBounds(20, 110, 80, 25);
        panel.add(YearLabel);

        // กล่องข้อความ
        JTextField YearText = new JTextField(20);
        YearText.setBounds(55, 110, 150, 25);
        panel.add(YearText);

        // ข้อความ
        JLabel downPaymentPercentageLabel = new JLabel("Percent down:");
        downPaymentPercentageLabel.setBounds(20, 50, 150, 25);
        panel.add(downPaymentPercentageLabel);

        // กล่องข้อความ
        JTextField downPaymentPercentageText = new JTextField(20);
        downPaymentPercentageText.setBounds(105, 50, 100, 25);
        panel.add(downPaymentPercentageText);

        // ข้อความ
        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(200, 200, 100, 25);
        calculateButton.setBackground(new Color(70, 130, 180));
        calculateButton.setForeground(Color.WHITE);
        panel.add(calculateButton);

        // กล่องข้อความ
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(20, 130, 300, 50);
        resultLabel.setForeground(Color.BLACK);
        panel.add(resultLabel);

        // คำณวนค่าดาวบ้าน
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double homePrice = Double.parseDouble(homePriceText.getText());
                    double downPaymentPercentage = Double.parseDouble(downPaymentPercentageText.getText());
                    double increase = Double.parseDouble(InterestText.getText());
                    double years = Double.parseDouble(YearText.getText());
                    double downPayment = homePrice * (downPaymentPercentage / 100);
                    double interest = homePrice * (increase / 100 / years);
                    resultLabel.setText("<html>Down house: " + downPayment + " Baht<br>Interest per year: " + interest + " Baht</html>");
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please try again");
                }
            }
        });
    }
}