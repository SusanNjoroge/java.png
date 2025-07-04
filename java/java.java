import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PetSelector extends JFrame {
    JLabel picLabel;

    public PetSelector() {
        setTitle("Pet Selector");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        JRadioButton dogBtn = new JRadioButton("Dog");
        JRadioButton catBtn = new JRadioButton("Cat");
        JRadioButton rabbitBtn = new JRadioButton("Rabbit");
        JRadioButton birdBtn = new JRadioButton("Bird");
        JRadioButton pigBtn = new JRadioButton("Pig");

        ButtonGroup group = new ButtonGroup();
        group.add(dogBtn);
        group.add(catBtn);
        group.add(rabbitBtn);
        group.add(birdBtn);
        group.add(pigBtn);

 topPanel.add(dogBtn);
        topPanel.add(catBtn);
        topPanel.add(rabbitBtn);
        topPanel.add(birdBtn);
        topPanel.add(pigBtn);

        add(topPanel, BorderLayout.NORTH);

        picLabel = new JLabel();
        picLabel.setHorizontalAlignment(JLabel.CENTER);
        picLabel.setVerticalAlignment(JLabel.CENTER);
        add(picLabel, BorderLayout.CENTER);


        dogBtn.addActionListener(e -> showPet("dog.png", "Dog"));
        catBtn.addActionListener(e -> showPet("cat.png", "Cat"));
        rabbitBtn.addActionListener(e -> showPet("rabbit.png", "Rabbit"));
        birdBtn.addActionListener(e -> showPet("bird.png", "Bird"));
        pigBtn.addActionListener(e -> showPet("pig.png", "Pig"));

        setVisible(true);
    }

    private void showPet(String fileName, String petName) {
        picLabel.setIcon(new ImageIcon(fileName));
        JOptionPane.showMessageDialog(this, "You selected: " + petName);
    }
public static void main(String[] args) {
        new PetSelector();
    }
}
