package org.erlong.pattern.facade;

public class Player {

    public void play(String url) {
        InternetPlayer internetPlayer = new InternetPlayer();
        // 加载资源
        internetPlayer.loadResource(url);
        // 重置状态
        internetPlayer.reset();
        // 播放
        internetPlayer.start();
    }
}
