package DotsBoxes.player.ai;

import DotsBoxes.board.Action;
import DotsBoxes.board.Board;
import DotsBoxes.player.ActionStrategy;

/**
 * Version etudiants.
 *
 * TODO:
 * - Implementer Minimax avec profondeur limite.
 * - Tenir compte de la regle: un joueur rejoue s'il ferme une boxe.
 * - Definir une fonction d'evaluation en feuille.
 */
public class MinimaxActionStrategy implements ActionStrategy {

    private final int maxDepth;

    public MinimaxActionStrategy(int maxDepth) {
        this.maxDepth = maxDepth;
    }

    @Override
    public Action selectAction(Board board, int playerId) {
        throw new UnsupportedOperationException("TODO etudiant: implementer MinimaxActionStrategy.selectAction");
    }

    @Override
    public String getName() {
        return "Minimax";
    }
}
