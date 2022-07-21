from VideoChunk.video_chunk import VideoChunk
from videostreamer import VideoStreamer

def play_video(chunk: VideoChunk):
    print("Now Playing: Chunk ID - ", chunk.get_chunk_id(), " ==> ", chunk.get_content())

if __name__ == '__main__':
    network_speed = 70
    # Create Streamer object
    streamer = VideoStreamer(network_speed)

    play_video(streamer.get_video_chunk())
    play_video(streamer.get_video_chunk())

    print("update network speed to 100")
    network_speed = 100
    streamer.set_network_speed(network_speed)
    play_video(streamer.get_video_chunk())
    play_video(streamer.get_video_chunk())
    play_video(streamer.get_video_chunk())

    print("update network speed to 20")
    network_speed = 20
    streamer.set_network_speed(network_speed)
    play_video(streamer.get_video_chunk())
    play_video(streamer.get_video_chunk())



