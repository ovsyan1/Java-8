import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyEventListener implements ActionListener {
    static int clickCounter;

    @Override
    public void actionPerformed(ActionEvent e) {
        clickCounter++;
        System.out.println("Click");
        System.out.println("ClickCounter: " + clickCounter);
    }
}

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World Swing");
        frame.setLocation(2100, 200);
        frame.setSize(300, 200);

        JLabel label = new JLabel("My first desktop app via Core Java");
        frame.getContentPane().add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel myContentPane = new JPanel();

        JButton mainButton = new JButton("Click me");

        frame.add(mainButton, BorderLayout.NORTH);
        frame.add(new JButton("change lng"), BorderLayout.SOUTH);
        frame.add(new JComboBox<>(), BorderLayout.EAST);
        frame.add(new JCheckBox("QWERTY"), BorderLayout.WEST);

        mainButton.addActionListener(new MyEventListener());

        frame.setVisible(true);

    }
}

class Tahiti {
    Tahiti t;

    public static void main(String[] args) {
        Tahiti t = new Tahiti();
        Tahiti t2 = t.go(t);
        t2 = null; // t2 eligible for GC
        // Zeile A
        // ...
    }

    Tahiti go(Tahiti t) {
        Tahiti t1 = new Tahiti();
        Tahiti t2 = new Tahiti(); // can't be deleted, because has reference on t
        t1.t = t2;
        t2.t = t1;
        t.t = t2;
        return t1;
    }

    // Ergebnis: GC kann nur ein Objekt löschen 
}
