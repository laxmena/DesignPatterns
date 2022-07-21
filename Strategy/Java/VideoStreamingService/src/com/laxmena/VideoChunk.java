package com.laxmena;

public class VideoChunk {
    private int chunkId;
    private String videoChunkContent;

    public VideoChunk(int chunkId, String content) {
        this.chunkId = chunkId;
        this.videoChunkContent = content;
    }

    public VideoChunk(int chunkId) {
        this.chunkId = chunkId;
    }

    // Getter methods
    public int getChunkId() {
        return chunkId;
    }

    public String getVideoChunkContent() {
        return videoChunkContent;
    }

    public int getVideoChunkSize() {
        return videoChunkContent.length();
    }

    // Setter methods
    public void setVideoChunkContent(String videoChunkContent) {
        this.videoChunkContent = videoChunkContent;
    }
}
