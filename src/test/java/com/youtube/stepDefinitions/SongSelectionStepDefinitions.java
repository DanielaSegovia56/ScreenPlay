package com.youtube.stepDefinitions;

import com.youtube.questions.ValidateNameSong;
import com.youtube.tasks.OpenBrowserTask;
import com.youtube.tasks.SearchSongTask;
import com.youtube.tasks.SelectSongTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SongSelectionStepDefinitions {


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }

    @Given("the user search a song and the user select song of way random")
    public void theUserSearchASongAndTheUserSelectSongOfWayRandom() {
        theActorCalled("user").wasAbleTo(
                OpenBrowserTask.open()
        );

    }
    @When("the user do clic on play")
    public void theUserDoClicOnPlay() {
        theActorInTheSpotlight().attemptsTo(
                SearchSongTask.search(),
                SelectSongTask.select()
        );
    }
    @Then("the user can view the name of the song he selected")
    public void theUserCanViewTheNameOfTheSongHeSelected() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidateNameSong.validate(),
                        Matchers.equalTo(true)
                )
        );
    }
}
