package com.sabu.proxy.service;

import com.sabu.proxy.dto.Video;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {

    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
