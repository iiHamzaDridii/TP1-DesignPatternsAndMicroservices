public class EncodingModule {
    private final Encoder encoder;
    private final FileEncoder fileEncoder;
    private final NetworkEncoder networkEncoder;

    public EncodingModule(Encoder encoder, FileEncoder fileEncoder, NetworkEncoder networkEncoder) {
        this.encoder = encoder;
        this.fileEncoder = fileEncoder;
        this.networkEncoder = networkEncoder;
    }

    public void encodeWithFiles() throws IOException {
        fileEncoder.encode();
    }

    public void encodeBasedOnNetworkAndDatabase() throws IOException {
        networkEncoder.encode();
    }
}