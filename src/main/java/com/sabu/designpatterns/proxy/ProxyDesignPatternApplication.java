package com.sabu.designpatterns.proxy;

import com.sabu.designpatterns.proxy.downloader.YouTubeDownloader;
import com.sabu.designpatterns.proxy.proxy.YouTubeCacheProxy;
import com.sabu.designpatterns.proxy.service.ThirdPartyYouTubeClass;

public class ProxyDesignPatternApplication {

    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader =  new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader =  new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart= test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
    }

    public static long test(YouTubeDownloader downloader){
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }

}
