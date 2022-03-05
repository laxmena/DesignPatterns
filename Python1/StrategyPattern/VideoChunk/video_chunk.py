class VideoChunk:
    """
    VideoChunk is representation of a Video Chunk Object.
    In this example, we do not download the data from Server, instead we simulate the VideoChunk data.
    So Constructor methods are defined to set the contents of the VideoChunks.
    VideoChunk instances are created in the concrete strategy implementations.
    """
    def __init__(self, chunk_id):
        self.chunk_id = chunk_id
        self.content = None

    def __init__(self, chunk_id, content):
        self.chunk_id = chunk_id
        self.content = content

    # getter method
    def get_chunk_id(self):
        return self.chunk_id

    # getter method
    def get_content(self):
        return self.content

    # setter method
    def set_content(self, content):
        self.content = content