package com.laxmena;

public class LowQualityStreamer implements StreamQualityDownloader {
    private String LOWQ_CHUNK = "THIS_LOWQ_STREAM_CHUNK";
    @Override
    public VideoChunk downloadChunk(int chunkId) {
        int nextChunkId = chunkId + 1;
        VideoChunk chunk = new VideoChunk(nextChunkId, LOWQ_CHUNK);
        return chunk;
    }
}
