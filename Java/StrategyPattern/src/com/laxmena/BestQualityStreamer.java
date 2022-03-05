package com.laxmena;

public class BestQualityStreamer implements StreamQualityDownloader {
    private String BESTQ_VIDEO_CHUNK = "THIS_IS_A_REALLY_LOOOOOOOOOOOOOOOOOONG_STRING_TO_SIMULATE_BEST_QUALITY";

    public BestQualityStreamer() {
    }

    @Override
    public VideoChunk downloadChunk(int chunkId) {
        int nextChunkId = chunkId + 1;
        // Get the next video chunk
        // In this case, we simulate the download action by creating a chunk object
        VideoChunk chunk = new VideoChunk(nextChunkId, BESTQ_VIDEO_CHUNK);
        return chunk;
    }
}
