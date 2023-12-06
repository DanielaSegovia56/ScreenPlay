package com.youtube.UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NameSongUI {

    public static final Target LBL_SONG = Target.the("name of song").
            located(By.xpath("//div[@id='title']/h1/yt-formatted-string"));
}
