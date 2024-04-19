package com.mytube;

import com.mytube.interfaces.AlertService;
import com.mytube.interfaces.VideoDatabase;
import com.mytube.interfaces.VideoEncoder;

public class VideoProcessor {

    private VideoEncoder encoder;
    private VideoDatabase db;
    private AlertService alert;

    VideoProcessor(VideoEncoder encoder, VideoDatabase db, AlertService alert) {
        this.encoder = encoder;
        this.db = db;
        this.alert = alert;
    }

    public void setAll(VideoEncoder encoder, VideoDatabase db, AlertService alert) {
        this.encoder = encoder;
        this.db = db;
        this.alert = alert;
    }

    public void process(Video video) {

        encoder.encode(video);

        db.store(video);

        alert.sendAlert(video.getUser());
    }
}