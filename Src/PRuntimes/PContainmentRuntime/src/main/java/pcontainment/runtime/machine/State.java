package pcontainment.runtime.machine;

import com.microsoft.z3.BoolExpr;
import jdk.internal.net.http.common.Pair;
import lombok.Getter;
import pcontainment.Checker;
import pcontainment.runtime.machine.eventhandlers.EventHandlerReturnReason;

import java.util.HashMap;
import java.util.Map;

public abstract class State {
    private static int stateCount = 0;
    @Getter
    private final int id;
    private final String name;
    public Map<BoolExpr, Pair<Integer, EventHandlerReturnReason>> getEntryEncoding(int sends, Checker c, Machine machine ) {
        return new HashMap<>();
    }
    public Map<BoolExpr, Integer> getExitEncoding (int sends, Checker c, Machine machine) { return new HashMap<>(); }

    public State(String name) {
        this.name = name;
        this.id = stateCount++;
    }

    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
