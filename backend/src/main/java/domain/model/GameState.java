package domain.model;

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
   * The id of current operating player's id.
   */
  private String currentPlayerId;

  /**
   * The phase of current game play.
   */
  private enum phase {DRAW, DISCARD}

  /**
   * Each players' tiles.
   */
  private String hand;

  /**
   * Each players' chi/pon/kan sets.
   */
  private String melds;

  /**
   * Each players' discards.
   */
  private String discards;

  /**
   * Tiles not draw yet.
   */
  private String wall;

  /**
   * Shows which player's turn to do actions.
   */
  private String turn;

  /**
   * Shows the latest discard from player.
   */
  private String lastDiscard;

  /**
   * Shows available actions and potential available players.
   */
  private String availableActions;
}
