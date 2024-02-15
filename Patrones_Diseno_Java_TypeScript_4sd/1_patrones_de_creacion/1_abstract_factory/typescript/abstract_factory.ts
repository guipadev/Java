interface Character {
    getDescription(): string;
}

interface Weapon {
    getDescription(): string;
}

class Elf implements Character {
    getDescription() {
        return "Este es un elfo.";
    }
}

class Orc implements Character {
    getDescription() {
        return "Este es un orco.";
    }
}

class Sword implements Weapon {
    getDescription() {
        return "Esta es una espada.";
    }
}

class Bow implements Weapon {
    getDescription() {
        return "Este es un arco.";
    }
}

interface AbstractFactory {
    createCharacter(): Character;
    createWeapon(): Weapon;
}

class ElfFactory implements AbstractFactory {
    createCharacter() {
        return new Elf();
    }

    createWeapon() {
        return new Bow();
    }
}
class OrcFactory implements AbstractFactory {
    createCharacter() {
        return new Orc();
    }

    createWeapon() {
        return new Sword();
    }
}

const elfFactory = new ElfFactory();
const elfCharacter = elfFactory.createCharacter();
const elfWeapon = elfFactory.createWeapon();
console.log(elfCharacter.getDescription());
console.log(elfWeapon.getDescription()); 

const orcFactory = new OrcFactory();
const orcCharacter = orcFactory.createCharacter();
const orcWeapon = orcFactory.createWeapon();

console.log(orcCharacter.getDescription());
console.log(orcWeapon.getDescription());


