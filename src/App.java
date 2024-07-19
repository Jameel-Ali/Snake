import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth;       // Creating a 600x600 pixel window

        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);     // Making frame visible
        frame.setSize(boardWidth, boardHeight);     // Creating a 600x600 pixel window
        frame.setLocationRelativeTo(null);      // Opens window at centre of screen
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // Program terminates when user clicks 'x' button on window


        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();
    }
}
