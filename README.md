# Java Functional Programming
## Java 8 stream
- My notes and walkthrough from Joe James - https://youtu.be/t1-YZ6bF-g0
- Streams bring functional programming to Java, supported from Java 8
- Advantages:
  - More efficient Java programmer
  - Make heavy use of **Lambda Expressions**
    - https://www.youtube.com/watch?v=eis11j_iGMs
  - ParallelStreams make it easy for multi-threaded operations
- A stream pipeline consists of a **source**, followed by zero or more **intermediate operations**, and a **terminal operation**.
  - **Stream source**:
    - Can be created from _Collections, Lists, Sets, ints, longs, doubles, arrays, lines of file_
  - **Intermediate operations**:
    - Such as *filter, map, sort* return a **stream** so that we can **chain** them together.
  - **Terminal operations**:
    - Such as forEach, collect or reduce are either void or return a non-stream result. Only one terminal operation is allowed to be used in one stream.
      - *forEach* applies the same function to each element.
      - *collect* saves the elements into a collection.
      - *other option* **reduce** the stream to a single summary element.