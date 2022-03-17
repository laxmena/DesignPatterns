from .stream_quality_strategy import StreamQualityStrategy
from VideoChunk.video_chunk import VideoChunk

class MediumQuality(StreamQualityStrategy):
    """
    Concrete implementation of StreamQualityStrategy interface.
    We simulate the best quality streaming here.
    """
    CONTENT = "THIS IS MEDIUM QUALITY!!!"

    def download_video_chunk(self, chunk_id):
        next_chunk_id = chunk_id + 1
        video_chunk = VideoChunk(next_chunk_id, self.CONTENT)
        return video_chunk

