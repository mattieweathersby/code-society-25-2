package com.codedifferently.lesson16.gameLogTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.codedifferently.lesson16.mattieweathersby.GameLogs;
import org.junit.jupiter.api.Test;

class GameTest {

  @Test
  void testCreateGameLogsForSims4() {
    // Arrange
    GameLogs game = new GameLogs("Sims", "PC", 59.99, "Walmart", 9, GameLogs.GameGenre.RPG);
    // Act
    String title = game.getTitle();
    int rating = game.getRating();
    // Assert
    assertEquals("Sims", title);
    assertEquals(9, rating);
  }

  @Test
  void testCreateGameLogsCheckRating() {
    // Arrange
    GameLogs game = new GameLogs("Sims", "PC", 59.99, "Walmart", 9, GameLogs.GameGenre.RPG);
    // Act
    int result = game.checkRating();
    // Assert
    assertEquals(9, result);
  }

  @Test
  void testGetSystemCount() {
    // arrange
    GameLogs game = new GameLogs("Sims", "PC", 59.99, "Walmart", 9, GameLogs.GameGenre.RPG);
    // act
    int result = game.getSystemCount();
    // assert
    assertEquals(1, result);
  }

  @Test
  void testGetPrice() {
    // arrange
    GameLogs game = new GameLogs("Sims", "PC", 59.99, "Walmart", 9, GameLogs.GameGenre.RPG);
    // act
    double result = game.getPrice();
    // assert
    assertEquals(59.99, result);
  }

  @Test
  void testGetStoreLocation() {
    // arrange
    GameLogs game = new GameLogs("Sims", "PC", 59.99, "Walmart", 9, GameLogs.GameGenre.RPG);
    // act
    String result = game.getStoreLocation();
    // assert
    assertEquals("Walmart", result);
  }

  @Test
  void testGetTitle() {
    // arrange
    GameLogs game = new GameLogs("Sims", "PC", 59.99, "Walmart", 9, GameLogs.GameGenre.RPG);
    // act
    String result = game.getTitle();
    // assert
    assertEquals("Sims", result);
  }

  @Test
  void testCheckTitleThrowsExceptionForNull() {
    // Arrange
    GameLogs game = new GameLogs("Sims", "PC", 59.99, "Walmart", 9, GameLogs.GameGenre.RPG);

    // Act & Assert
    Exception exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              game.checkTitle(null);
            });

    assertEquals("Title cannot be null or empty", exception.getMessage());
  }

  @Test
  void testCheckTitleThrowsExceptionForEmptyString() {
    // Arrange
    GameLogs game = new GameLogs("Sims", "PC", 59.99, "Walmart", 9, GameLogs.GameGenre.RPG);

    // Act & Assert
    Exception exception =
        assertThrows(
            IllegalArgumentException.class,
            () -> {
              game.checkTitle(""); // passing empty string should throw
            });

    assertEquals("Title cannot be null or empty", exception.getMessage());
  }
}
