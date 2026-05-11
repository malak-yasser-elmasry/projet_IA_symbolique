package DotsBoxes.player.ai;

import DotsBoxes.board.Action;
import DotsBoxes.board.Board;
import DotsBoxes.player.ActionStrategy;

/**
 * Version etudiants.
 *
 * TODO:
 * - Concevoir une strategie experte (heuristique + ordre de coups).
 * - Optionnel: utiliser une table de transposition.
 */
public class ExpertActionStrategy implements ActionStrategy {

    private final int maxDepth;

    public ExpertActionStrategy(int maxDepth) {
        if (maxDepth <= 0) {
            throw new IllegalArgumentException("maxDepth doit etre > 0");
        }
        this.maxDepth = maxDepth;
    }

    @Override
    public Action selectAction(Board board, int playerId) {
        throw new UnsupportedOperationException("TODO etudiant: implementer ExpertActionStrategy.selectAction");
    }

    @Override
    public String getName() {
        return "Expert";
    }
}
