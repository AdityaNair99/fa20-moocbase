package edu.berkeley.cs186.database.cli.visitor;

import java.util.Optional;

import edu.berkeley.cs186.database.Transaction;
import edu.berkeley.cs186.database.cli.parser.MoocParserDefaultVisitor;
import edu.berkeley.cs186.database.query.QueryPlan;

public abstract class StatementVisitor extends MoocParserDefaultVisitor {
    public void execute(Transaction transaction) {
        throw new UnsupportedOperationException("Statement is not executable.");
    }

    public Optional<String> getSavepointName() {
        return Optional.empty();
    }

    public Optional<QueryPlan> getQueryPlan(Transaction transaction) {
        return Optional.empty();
    }

    public abstract StatementType getType();
}