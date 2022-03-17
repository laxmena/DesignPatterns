# Strategy Pattern Implementation in Java

This project implements Strategy Pattern in Java. This example is a primitive sample of a Video Streaming Service and 
Client that switches Streaming Quality automatically based on the network speed.

## Classes, Interfaces and Description

### VideoStreamer

VideoStreamer is the main class that streams video, and switches streaming strategy based on network speed of the client.
Client can create an instance of this VideoStreamer to stream video. 

### VideoStreamerClient

Client, where we consume the VideoStreamer. This Class has the main method.

### VideoChunk 

Class that defines the VideoChunk. VideoChunk is the object that gets downloaded by different Strategies. 
In our case, we don't download the chunk, but rather simulate the scenarios.

### StreamQualityDownloder

Interface that all Different Streaming Quality Strategies should implement. Interface defines one method - `downloadChunk(int chunkId)`.
Each Strategy should implement this method.

### Strategy Classes

Following are the Strategy Classes, that implements different business logic.
- [BestQualityStreamer](src/com/laxmena/BestQualityStreamer.java)
- [BetterQualityStreamer](src/com/laxmena/BetterQualityStreamer.java)
- [MediumQualityStreamer](src/com/laxmena/MediumQualityStreamer.java)
- [LowQualityStreamer](src/com/laxmena/LowQualityStreamer.java)

## Sample Output
```
Playing: MEDIUM_QUALITY_CHUNK_IS_HERE!!!!!
Playing: MEDIUM_QUALITY_CHUNK_IS_HERE!!!!!

Network Speed update: 40
Playing: THIS_LOWQ_STREAM_CHUNK
Playing: THIS_LOWQ_STREAM_CHUNK

Network Speed update: 120
Playing: THIS_IS_A_REALLY_LOOOOOOOOOOOOOOOOOONG_STRING_TO_SIMULATE_BEST_QUALITY
Playing: THIS_IS_A_REALLY_LOOOOOOOOOOOOOOOOOONG_STRING_TO_SIMULATE_BEST_QUALITY

Network Speed update: 80
Playing: THIS_IS_BETTER_QUALITY_VIDEO_CHUNK < BESTQ_CHUNK
Playing: THIS_IS_BETTER_QUALITY_VIDEO_CHUNK < BESTQ_CHUNK
```

Feel free to update the `VideoStreamerClient.class` to see how different classes work.

--------

If you have feedback, suggestions or any comments, do reach out to me through [email](mailto:ConnectWith@laxmena.com), [LinkedIn](https://www.linkedin.com/in/lakshmanan-meiyappan).
