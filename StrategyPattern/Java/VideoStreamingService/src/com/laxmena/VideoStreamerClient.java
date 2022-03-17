package com.laxmena;

public class VideoStreamerClient {

    public void play(VideoChunk chunk) {
        System.out.println("Playing: " + chunk.getVideoChunkContent());
    }

    public static void main(String[] args) {
	    // Create a new VideoStreamer
        VideoStreamerClient client = new VideoStreamerClient();

        VideoStreamer streamer = new VideoStreamer();
        client.play(streamer.getVideoChunk());
        client.play(streamer.getVideoChunk());

        System.out.println("Network Speed update: 40");
        streamer.setNetworkSpeed(40);
        client.play(streamer.getVideoChunk());
        client.play(streamer.getVideoChunk());

        System.out.println("Network Speed update: 120");
        streamer.setNetworkSpeed(120);
        client.play(streamer.getVideoChunk());
        client.play(streamer.getVideoChunk());

        System.out.println("Network Speed update: 80");
        streamer.setNetworkSpeed(80);
        client.play(streamer.getVideoChunk());
        client.play(streamer.getVideoChunk());

    }
}
