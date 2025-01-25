public class Main {
    public static void main(String[] args) {
        // Create instances of instruments
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        // Call the play method for both
        guitar.play(); // Outputs: Strumming the guitar...
        piano.play(); // Outputs: Playing the piano...
    }
}