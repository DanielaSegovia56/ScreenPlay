package com.youtube.UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ListSongUI {

    public static final Target LIST_SONG = Target.the("link of song").
            located(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-video-renderer']"));

}
