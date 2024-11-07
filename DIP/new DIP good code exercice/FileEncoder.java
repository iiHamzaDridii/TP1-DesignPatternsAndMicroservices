public class FileEncoder {
    private final Encoder encoder;
    private final String inputFilePath;
    private final String outputFilePath;

    public FileEncoder(Encoder encoder, String inputFilePath, String outputFilePath) {
        this.encoder = encoder;
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
    }

    public void encode() throws IOException {
        // ... (same file encoding logic as before, using encoder.encode())
    }
}