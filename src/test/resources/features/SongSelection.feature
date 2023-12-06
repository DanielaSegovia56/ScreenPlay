Feature: Song selection of Youtube

  Scenario: successful reproduction
    Given the user search a song and the user select song of way random
    When the user do clic on play
    Then the user can view the name of the song he selected