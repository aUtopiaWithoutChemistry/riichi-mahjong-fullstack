package io.github.autopiawithoutchemistry.backend.transport.ws.dto;

import java.util.List;

/**
 * This model represents a game's status on client side.
 * Only available to user whose id is userid.
 */
public class GameStateView {
  /**
   * The room's id, to identify a game.
   */
  private String roomId;

  /**
   * The user's id, to identify the user playing this game.
   */
  private String userId;

  /**
   * All players' id.
   */
  private String players;

  /**
   * Show which seat's turn.
   */
  private String turnSeat;

  /**
   * Show user's seat.
   */
  private String userSeat;

  /**
   * Show current game phase.
   */
  private String phase;

  /**
   * Show user's hand.
   */
  private List<String> userHand;

  /**
   * Show all players' discards.
   */
  private String discards;

  /**
   * Show latest discarded tile.
   */
  private String lastDiscarded;

  /**
   * All available actions for user.
   */
  private String availableActions;

  /**
   * Number of Tiles remaining in wall.
   */
  private int wallRemaining;
}
