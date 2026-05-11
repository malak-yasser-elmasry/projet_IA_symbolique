package DotsBoxes.player.ai;

import DotsBoxes.board.Action;
import DotsBoxes.board.Board;
import DotsBoxes.observers.AlphaBetaPruningObserver;
import DotsBoxes.observers.NodeCounterObserver;
import DotsBoxes.player.ActionStrategy;

/**
 * Version etudiants.
 *
 * TODO:
 * - Implementer Minimax avec elagage Alpha-Beta.
 * - Utiliser les observateurs pour compter coupes et noeuds visites.
 * - Tenir compte de la regle de rejeu apres fermeture de boxe.
 */
public class AlphaBetaActionStrategy implements ActionStrategy {

    private final int maxDepth;
    private final AlphaBetaPruningObserver observer;
    private final NodeCounterObserver nodeCounter;

    public AlphaBetaActionStrategy(int maxDepth, AlphaBetaPruningObserver observer, NodeCounterObserver nodeCounter) {
        this.maxDepth = maxDepth;
        this.observer = observer;
        this.nodeCounter = nodeCounter;
    }

    @Override
    public Action selectAction(Board board, int playerId) {
        throw new UnsupportedOperationException("TODO etudiant: implementer AlphaBetaActionStrategy.selectAction");
    }

    @Override
    public String getName() {
        return "Alpha-Beta";
    }
}
