package DotsBoxes.player.automate;

import DotsBoxes.board.Action;
import DotsBoxes.board.Board;
import DotsBoxes.player.ActionStrategy;

/**
 * Version etudiants.
 *
 * TODO:
 * - Construire la liste des actions valides.
 * - Tirer une action aleatoirement.
 * - Retourner null si aucun coup n'est disponible.
 */
public class RandomActionStrategy implements ActionStrategy {

    @Override
    public Action selectAction(Board board, int playerId) {
        throw new UnsupportedOperationException("TODO etudiant: implementer RandomActionStrategy.selectAction");
    }

    @Override
    public String getName() {
        return "Random";
    }
}
