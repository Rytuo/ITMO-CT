package expression.parser;

public interface Source {
    boolean hasNext();
    char next();
    ParserException error(final String message);
}
