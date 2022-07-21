from __future__ import annotations
from abc import ABC, abstractmethod

class StreamQualityStrategy(ABC):
    """StreamQualityStrategy is the Strategy interface that declares operations common to
    all Concrete classes that implement StreamQualityStrategy"""
    @abstractmethod
    def download_video_chunk(self, chunk_id):
        pass