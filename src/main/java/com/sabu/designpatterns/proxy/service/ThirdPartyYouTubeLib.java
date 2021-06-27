package com.sabu.designpatterns.proxy.service;

import com.sabu.designpatterns.proxy.dto.Video;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {

    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
