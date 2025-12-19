package io.github.autopiawithoutchemistry.backend.domain.model;

import java.util.Deque;
import java.util.List;
import java.util.Map;

/**
 * This model represent a game's status on Server side.
 * Not available to users.
 */
public class GameState {
  /**
   * The room ID, to identify a game.
   */
  private String roomId;

  /**
   * All players' IDs.
   */
  private List<String> playerIds;

  /**
   * The index of current turn.
   */
  private int turnIndex;

  /**
   * The phase of current game play.
   */
  private GamePhase phase;

  /**
   * Tiles not draw yet.
   */
  private Deque<String> wall;

  /**
   * Each players' tiles.
   */
  private Map<String, List<String>> hand;

  /**
   * Each players' discards.
   */
  private Map<String, List<String>> discards;

  /**
   * Shows the latest discard from player.
   */
  private String lastDiscardTile;

  /**
   * Shows which player made the latest discard.
   */
  private String lastDiscardBy;

  /**
   * The type of available action.
   */
  private enum ActionType {
    DISCARD
  }
}
