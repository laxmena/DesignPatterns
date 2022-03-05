import StreamStrategy
from VideoChunk.video_chunk import VideoChunk

class VideoStreamer:
    # Constants
    default_speed = 75
    min_bestq_speed, min_betterq_speed, min_medq_speed, min_lowq_speed = [100, 80, 50, 0]

    def __init__(self, network_speed):
        self.stream_quality = None
        self.network_speed = network_speed
        self.set_network_speed(network_speed)
        self.chunk_id = 0

    def set_network_speed(self, network_speed):
        """
        Update network speed. Once the network speed is changed, we evaluate and select the suitable streaming
        strategy for the speed.
        """
        self.network_speed = network_speed
        self.update_streamquality()

    def update_streamquality(self):
        """
        Update Streaming Streaming Strategy based on Network speed
        """
        if self.network_speed >= self.min_bestq_speed:
            self.stream_quality = StreamStrategy.BestQuality()
        elif self.network_speed >= self.min_betterq_speed:
            self.stream_quality = StreamStrategy.BetterQuality()
        elif self.network_speed >= self.min_medq_speed:
            self.stream_quality = StreamStrategy.MediumQuality()
        else:
            self.stream_quality = StreamStrategy.LowQuality()

    def get_video_chunk(self):
        """
        Downloads the next video chunk using the Streaming Strategy
        """
        chunk: VideoChunk = self.stream_quality.download_video_chunk(self.chunk_id)
        self.chunk_id = chunk.get_chunk_id()
        return chunk