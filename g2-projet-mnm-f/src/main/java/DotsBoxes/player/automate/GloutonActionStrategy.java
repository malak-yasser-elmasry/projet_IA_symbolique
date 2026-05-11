package DotsBoxes.player.automate;

import DotsBoxes.board.Action;
import DotsBoxes.board.Board;
import DotsBoxes.player.ActionStrategy;

/**
 * Version etudiants.
 *
 * TODO:
 * - Implementer une strategie gloutonne:
 *   1) si un coup ferme une ou plusieurs boxes, le jouer
 *   2) sinon, jouer un coup aleatoire valide
 * - Retourner null si aucun coup n'est disponible.
 */
public class GloutonActionStrategy implements ActionStrategy {

    public GloutonActionStrategy() {
    }

    public GloutonActionStrategy(long seed) {
    }

    @Override
    public Action selectAction(Board board, int playerId) {
        throw new UnsupportedOperationException("TODO etudiant: implementer GloutonActionStrategy.selectAction");
    }

    @Override
    public String getName() {
        return "Glouton";
    }
}
