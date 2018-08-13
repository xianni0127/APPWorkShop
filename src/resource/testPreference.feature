Feature: Gradle-Cucumber integration

@test
Scenario: test Preference
  Given  open the app and click Preference
  When   click dependencies
  Then   we get dependencies