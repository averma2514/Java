import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuessingGame extends JFrame {
  private JTextField guessField;
  private JLabel resultLabel;
  private int number;
  private int numGuesses;

  public GuessingGame() {
    // Generate a random number between 1 and 100
    Random rand = new Random();
    number = rand.nextInt(100) + 1;

    // Set up the GUI
    setTitle("Guessing Game");
    setSize(300, 100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(3, 1));

    // Create a panel for the guess field and label
    JPanel guessPanel = new JPanel();
    guessPanel.add(new JLabel("Enter your guess: "));
    guessField = new JTextField(10);
    guessPanel.add(guessField);
    add(guessPanel);

    // Create a button to submit the guess
    JButton submitButton = new JButton("Submit");
    submitButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // Get the user's guess and increment the number of guesses
        int guess = Integer.parseInt(guessField.getText());
        numGuesses++;

        // Check if the guess is correct
        if (guess == number) {
          resultLabel.setText("Congratulations! You guessed the number in " + numGuesses + " guesses.");
        } else if (guess < number) {
          resultLabel.setText("Your guess is too low. Try again.");
        } else if (guess > number) {
          resultLabel.setText("Your guess is too high. Try again.");
        }
      }
    });
    add(submitButton);

    // Create a label to display the result of the guess
    resultLabel = new JLabel("I'm thinking of a number between 1 and 100. Can you guess what it is?");
    add(resultLabel);
  }

  public static void main(String[] args) {
    GuessingGame game = new GuessingGame();
    game.setVisible(true);
  }
}
