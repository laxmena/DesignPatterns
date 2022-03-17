package com.laxmena;

public class VideoStreamer {
    private enum Status { PLAY, PAUSE };
    private StreamQualityDownloader streamQuality;
    private Status videoStatus;
    private int chunkId;
    private double networkSpeed;

    private static final double BEST_MIN_NETWORK = 100;
    private static final double BETTER_MIN_NETWORK = 80;
    private static final double MEDIUM_MIN_NETWORK = 50;
    private static final double LOW_MIN_NETWORK = 0;
    private static final double DEFAULT_NETWORK_SPEED = 50;
    public VideoStreamer() {
        this.chunkId = 0;
        setNetworkSpeed(DEFAULT_NETWORK_SPEED);
        playVideo();
    }

    public VideoStreamer(int networkSpeed) {
        this.chunkId = 0;
        setNetworkSpeed(networkSpeed);
        playVideo();
    }

    public void pauseVideo() {
        this.videoStatus = Status.PAUSE;
    }

    public void playVideo() {
        this.videoStatus = Status.PLAY;
    }

    public VideoChunk getVideoChunk() {
        if(this.videoStatus == Status.PAUSE) {
            return null;
        }
        VideoChunk chunk = this.streamQuality.downloadChunk(chunkId);
        this.chunkId = chunk.getChunkId();
        return chunk;
    }

    private void updateStreamQuality() {
        if(this.networkSpeed >= BEST_MIN_NETWORK) {
            this.streamQuality = new BestQualityStreamer();
        } else if(this.networkSpeed >= BETTER_MIN_NETWORK) {
            this.streamQuality = new BetterQualityStreamer();
        } else if(this.networkSpeed >= MEDIUM_MIN_NETWORK) {
            this.streamQuality = new MediumQualityStreamer();
        } else {
            this.streamQuality = new LowQualityStreamer();
        }
    }

    public void setNetworkSpeed(double networkSpeed) {
        this.networkSpeed = networkSpeed;
        updateStreamQuality();
    }
}
