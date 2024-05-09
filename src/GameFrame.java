import javax.swing.JFrame;

/**
 * The {@code GameFrame} class extends {@link JFrame} to create a frame for the Snake game.
 * It sets up the window attributes like size, visibility, and behavior upon closure.
 */
public class GameFrame extends JFrame {

    /**
     * Constructs a new {@code GameFrame} instance.
     * Initializes the frame with a {@link SnakeGame}, sets the title,
     * default close operation, resizability, packing, visibility, and centering of the window.
     */
    GameFrame() {
        // Add a new GamePanel to the frame

        this.add(new SnakeGame());
        // Set the title of the frame
        this.setTitle("Snake");
        // Set the default close operation to exit the application
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the frame to be non-resizable
        this.setResizable(false);
        // Pack the frame to fit the preferred size and layouts of its subcomponents
        this.pack();
        // Make the frame visible
        this.setVisible(true);
        // Center the frame on the screen
        this.setLocationRelativeTo(null);

    }

    /**
     * The main method that serves as the entry point for the application.
     * It creates an instance of {@code GameFrame}, initializing the game.
     *
     * @param args command line arguments, not used in this application.
     */
    public static void main(String[] args) {
        new GameFrame();
    }

}
