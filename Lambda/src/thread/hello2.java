package thread;

import javax.swing.JButton;

public class hello2 {
    public static void main(String[] args) {
        
        // JButton jButton = new JButton();

        // jButton.addActionListener(new ActionListener() {

        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         System.out.println(" Hello World!");
        //     }
        // });

        JButton jButton2 = new JButton();

        jButton2.addActionListener(e -> System.out.println(" Hello World"));
    }
}
