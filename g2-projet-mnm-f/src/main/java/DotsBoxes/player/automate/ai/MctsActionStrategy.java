package DotsBoxes.player.ai;

import DotsBoxes.board.Action;
import DotsBoxes.board.Board;
import DotsBoxes.player.ActionStrategy;

/**
 * Version etudiant.
 *
 * TODO:
 * - Implementer MCTS (selection, expansion, simulation, backpropagation).
 * - Definir la politique UCT.
 */
public class MctsActionStrategy implements ActionStrategy {

    private final int iterations;

    public MctsActionStrategy(int iterations) {
        this.iterations = iterations;
    }

    public MctsActionStrategy(int iterations, long seed) {
        this.iterations = iterations;
    }

    @Override
    public Action selectAction(Board board, int playerId) {
        throw new UnsupportedOperationException("TODO etudiant: implementer MctsActionStrategy.selectAction");
    }

    @Override
    public String getName() {
        return "MCTS (student)";
    }
}
