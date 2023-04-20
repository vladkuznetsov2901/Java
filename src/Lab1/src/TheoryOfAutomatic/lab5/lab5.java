//package TheoryOfAutomatic.lab5;
//import java.util.*;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//
//
//    public class NFA {
//
//        public class State {
//            private final String name;
//            private final Map<Character, Set<State>> transitions;
//
//            public State(String name) {
//                this.name = name;
//                this.transitions = new HashMap<>();
//            }
//
//            public String getName() {
//                return name;
//            }
//
//            public void addTransition(char symbol, State state) {
//                if (!transitions.containsKey(symbol)) {
//                    transitions.put(symbol, new HashSet<>());
//                }
//                transitions.get(symbol).add(state);
//            }
//
//            public Set<State> getTransitions(char symbol) {
//                return transitions.getOrDefault(symbol, new HashSet<>());
//            }
//        }
//        private final Set<State> states;
//        private final Set<State> acceptStates;
//        private final State startState;
//
//        public NFA(Set<State> states, Set<State> acceptStates, State startState) {
//            this.states = states;
//            this.acceptStates = acceptStates;
//            this.startState = startState;
//        }
//
//        public Set<State> getStates() {
//            return states;
//        }
//
//        public Set<State> getAcceptStates() {
//            return acceptStates;
//        }
//
//        public State getStartState() {
//            return startState;
//        }
//
//        public DFA toDFA() {
//            // Calculate epsilon closure of start state
//            Set<State> startStateClosure = epsilonClosure(Collections.singleton(startState));
//
//            // Initialize DFA with start state closure
//            Set<Set<State>> dfaStates = new HashSet<>();
//            dfaStates.add(startStateClosure);
//            State dfaStartState = new State(startStateClosure);
//            Set<State> dfaAcceptStates = new HashSet<>();
//
//            // Initialize stack with start state closure
//            Deque<Set<State>> stack = new ArrayDeque<>();
//            stack.push(startStateClosure);
//
//            // Build DFA
//            while (!stack.isEmpty()) {
//                Set<State> currentState = stack.pop();
//
//                // Iterate over each input symbol
//                for (char symbol : getSymbols(currentState)) {
//                    // Calculate next state set
//                    Set<State> nextState = epsilonClosure(getNextStates(currentState, symbol));
//
//                    // Add next state set to DFA if not already added
//                    if (!dfaStates.contains(nextState)) {
//                        dfaStates.add(nextState);
//                        stack.push(nextState);
//                    }
//
//                    // Add transition to DFA
//                    dfaStartState.addTransition(new Transition(symbol, new State(nextState)));
//                }
//
//                // Check if current state is an accept state and add to DFA accept states
//                if (!Collections.disjoint(currentState, acceptStates)) {
//                    dfaAcceptStates.add(new State(currentState));
//                }
//            }
//
//            return new DFA(dfaStates, dfaAcceptStates, dfaStartState);
//        }
//
//        private Set<State> getNextStates(Set<State> states, char symbol) {
//            Set<State> nextStates = new HashSet<>();
//            for (State state : states) {
//                Set<State> transitions = state.getTransitions(symbol);
//                if (transitions != null) {
//                    nextStates.addAll(transitions);
//                }
//            }
//            return nextStates;
//        }
//
//        private Set<Character> getSymbols(Set<State> states) {
//            Set<Character> symbols = new HashSet<>();
//            for (State state : states) {
//                symbols.addAll(state.getSymbols());
//            }
//            return symbols;
//        }
//
//        private Set<State> epsilonClosure(Set<State> states) {
//            Set<State> closure = new HashSet<>(states);
//            Deque<State> stack = new ArrayDeque<>(states);
//            while (!stack.isEmpty()) {
//                State state = stack.pop();
//                Set<State> transitions = state.getTransitions(null);
//                if (transitions != null) {
//                    for (State transition : transitions) {
//                        if (!closure.contains(transition)) {
//                            closure.add(transition);
//                            stack.push(transition);
//                        }
//                    }
//                }
//            }
//            return closure;
//        }
//    }
//
