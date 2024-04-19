package com.mytube;

import com.mytube.alertImpl.EmailService;
import com.mytube.alertImpl.SmsService;
import com.mytube.databaseImpl.MySql;
import com.mytube.databaseImpl.PostGreSql;
import com.mytube.encodingImpl.VideoEncoderV1;
import com.mytube.encodingImpl.VideoEncoderV2;

public class Main {

    public static void main(String[] args) {
        var video = new Video();
        video.setFileName("birthday.mp4");
        video.setTitle("Jennifer's birthday");
        video.setUser(new User("john@domain.com", 982389349));

        var processor = new VideoProcessor(new VideoEncoderV1(), new MySql(), new EmailService());
        processor.process(video);
        processor.setAll(new VideoEncoderV2(), new PostGreSql(), new SmsService());
        processor.process(video);
        processor.setAll(new VideoEncoderV1(), new PostGreSql(), new EmailService());
        processor.process(video);
        processor.setAll(new VideoEncoderV2(), new MySql(), new SmsService());
        processor.process(video);

        System.out.println("\n\n**************************************VERSION 2***********************************\n\n");
        var video2 = new Video("filename", "title", new User("example@mail.com", 984384359));
        processor.process(video2);
        processor.setAll(new VideoEncoderV2(), new PostGreSql(), new SmsService());
        processor.process(video2);
        processor.setAll(new VideoEncoderV1(), new PostGreSql(), new EmailService());
        processor.process(video2);
        processor.setAll(new VideoEncoderV2(), new MySql(), new SmsService());
        processor.process(video2);

    }
}