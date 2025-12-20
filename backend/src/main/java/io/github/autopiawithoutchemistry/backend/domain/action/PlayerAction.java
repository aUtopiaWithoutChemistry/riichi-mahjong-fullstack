package io.github.autopiawithoutchemistry.backend.domain.action;

/**
 * Represents an action taken by a player in the game.
 */
public class PlayerAction {
  /**
   * The ID of the player performing the action.
   */
  String playerId;

  /**
   * The type of action being performed.
   */
  ActionType type;

  /**
   * The tile involved in the action.
   */
  String tile;
}
