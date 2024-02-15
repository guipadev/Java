// Interfaz Expression que representa todas las expresiones que pueden ser interpretadas
interface Expression {
    interpret(): number;
}

// Clase concreta que representa un número
class NumberExpression implements Expression {
    private number: number;

    constructor(number: number) {
        this.number = number;
    }

    interpret(): number {
        return this.number;
    }
}

// Clase concreta que representa una suma
class AddExpression implements Expression {
    private left: Expression;
    private right: Expression;

    constructor(left: Expression, right: 
    Expression) {
        this.left = left;
        this.right = right;
    }

    interpret(): number {
        return this.left.interpret() + this.right.interpret();
    }
}

// Clase concreta que representa una resta
class SubtractExpression implements Expression {
    private left: Expression;
    private right: Expression;

    constructor(left: Expression, right: Expression) {
        this.left = left;
        this.right = right;
    }

    interpret(): number {
        return this.left.interpret() - this.right.interpret();
    }
}

// Cliente que utiliza las expresiones para evaluar una expresión aritmética
const main = () => {
    /* Construir una expresión aritmética: 1 + 2 - 
       3*/
    const expression: Expression = 
    new SubtractExpression(
        new AddExpression(
            new NumberExpression(2), 
            new NumberExpression(2)
        ),
        new NumberExpression(3)
    );

    // Evaluar la expresión
    const result: number = expression.interpret();

    console.log("Resultado de la expresión:", 
    result);
};

main();