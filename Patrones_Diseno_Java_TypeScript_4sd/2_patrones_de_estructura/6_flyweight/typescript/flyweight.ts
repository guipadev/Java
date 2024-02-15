// Interfaz para representar caracteres de texto
interface TextCharacter {
    printCharacter(): void;
}

// Clase concreta para caracteres de texto
class ConcreteTextCharacter implements TextCharacter {
    private character: string;

    constructor(character: string) {
        this.character = character;
    }

    printCharacter(): void {
        process.stdout.write(this.character);
    }
}

// Fábrica para administrar instancias compartidas de caracteres
class CharacterFactory {
    private characterMap: { [key: string]: TextCharacter } = {};

    getCharacter(character: string): TextCharacter 
    {
        if (!this.characterMap[character]) {
            this.characterMap[character] = new 
            ConcreteTextCharacter(character);
        }
        return this.characterMap[character];
    }
}

const characterFactory = new CharacterFactory();

const text = "Hello, World!";
for (const char of text) {
    const character = characterFactory.getCharacter(char);
    character.printCharacter();
}
