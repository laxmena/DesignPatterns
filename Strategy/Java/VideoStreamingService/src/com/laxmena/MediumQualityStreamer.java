package com.laxmena;

public class MediumQualityStreamer implements StreamQualityDownloader {
    private String MEDQ_CHUNK = "MEDIUM_QUALITY_CHUNK_IS_HERE!!!!!";

    @Override
    public VideoChunk downloadChunk(int chunkId) {
        int nextChunkId = chunkId + 1;
        VideoChunk chunk = new VideoChunk(nextChunkId, MEDQ_CHUNK);
        return chunk;
    }
}
