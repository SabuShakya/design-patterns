package com.sabu.proxy.proxy;

import com.sabu.proxy.dto.Video;
import com.sabu.proxy.service.ThirdPartyYouTubeClass;
import com.sabu.proxy.service.ThirdPartyYouTubeLib;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {

    private ThirdPartyYouTubeLib youTubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        this.youTubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {

        if (cachePopular.isEmpty())
            cachePopular = youTubeService.popularVideos();
        else
            System.out.println("Retrieved list from cache");
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);

        if (video == null) {
            video = youTubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
