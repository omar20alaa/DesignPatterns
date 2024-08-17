package app.design_patterns.visitor_pattern;

interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

}
