package com.mytube.databaseImpl;

import com.mytube.Video;
import com.mytube.interfaces.VideoDatabase;

public class PostGreSql implements VideoDatabase {

    @Override
    public void store(Video video) {
        System.out.println("Storing video metadata in a PostGreSql database...");
        System.out.println("Title: " + video.getTitle());
        System.out.println("File Name: " + video.getFileName());
        System.out.println("Done!\n");
    }
}