package com.mytube.encodingImpl;

import com.mytube.Video;
import com.mytube.interfaces.VideoEncoder;

public class VideoEncoderV2 implements VideoEncoder {

    @Override
    public void encode(Video video) {
        System.out.println("Encoding version 2 video...");
        System.out.println("Done!\n");
    }
}