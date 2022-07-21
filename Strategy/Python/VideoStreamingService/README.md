# VidoStreamer - Strategy Pattern

Strategy Pattern in implemented in a primitive VideoStreaming service, that automatically changes Streaming Strategy in run-time based on network speed of the client.

## Specs
- Python 3.8

## How to run

__Step 1__: Clone the project, and navigate to the `Python/StreamStrategy` directory.

__Step 2__: Create a Virtual environment if needed. Note: No additional packages have been used in this implementation.

Run this command in the terminal to execute the project.
```
python3 video_streamer_client.py
```

## Strategy Interfaces and Concrete Classes

[`stream_quality_strategy.py`](./StreamStrategy/stream_quality_strategy.py) is the interface that defiens the common methods that all concrete strategy implementation classes should implement.

#### Concrete Classes
Here is the list of Concrete classes that implements the interface:

1. [BestQuality](./StreamStrategy/best_quality.py)
2. [BetterQuality](./StreamStrategy/better_quality.py)
3. [MediumQuality](./StreamStrategy/medium_quality.py)
4. [LowQuality](./StreamStrategy/low_quality.py)

## How we switch strategies
- VideoStreamer is the main class that the user can consume to watch videos. Based on the network speed of the user, the streaming quality is automatically updated, to provide uninterupted service and avoid buffering or waiting for content.

## Output
```
Now Playing: Chunk ID -  1  ==>  THIS IS MEDIUM QUALITY!!!
Now Playing: Chunk ID -  2  ==>  THIS IS MEDIUM QUALITY!!!
update network speed to 100
Now Playing: Chunk ID -  3  ==>  THIS IS BEST QUALITY!!!
Now Playing: Chunk ID -  4  ==>  THIS IS BEST QUALITY!!!
Now Playing: Chunk ID -  5  ==>  THIS IS BEST QUALITY!!!
update network speed to 20
Now Playing: Chunk ID -  6  ==>  THIS IS LOW QUALITY!!!
Now Playing: Chunk ID -  7  ==>  THIS IS LOW QUALITY!!!
```