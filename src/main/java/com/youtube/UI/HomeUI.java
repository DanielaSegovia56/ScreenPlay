package com.youtube.UI;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target INPUT_SEARCH = Target.the("input search").
            located(By.xpath("//input[@name='search_query']"));

}

