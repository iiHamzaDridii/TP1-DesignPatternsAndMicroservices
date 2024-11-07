public class NetworkEncoder {
    private final Encoder encoder;
    private final URL url;
    private final MyDatabase database;

    public NetworkEncoder(Encoder encoder, URL url, MyDatabase database) {
        this.encoder = encoder;
        this.url = url;
        this.database = database;
    }

    public void encode() throws IOException {
        // ... (same network encoding logic as before, using encoder.encode())
    }
}
