package com.laxmena;

public class BetterQualityStreamer implements StreamQualityDownloader {
    private String BETTERQ_CHUNK = "THIS_IS_BETTER_QUALITY_VIDEO_CHUNK < BESTQ_CHUNK";
    @Override
    public VideoChunk downloadChunk(int chunkId) {
        int newChunkId = chunkId + 1;
        VideoChunk chunk = new VideoChunk(newChunkId, BETTERQ_CHUNK);
        return chunk;
    }
}
