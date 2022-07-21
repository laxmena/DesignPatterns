package com.laxmena;

public interface StreamQualityDownloader {
    VideoChunk downloadChunk(int chunkId);
}
