// Interfaz Mediator
interface ChatMediator {
    sendMessage(message: string, user: User): void;
    addUser(user: User): void;
}

// Clase concreta que implementa el Mediator
class ChatMediatorImpl implements ChatMediator {
    private users: User[] = [];

    addUser(user: User): void {
        this.users.push(user);
    }
    sendMessage(message: string, sender: User): 
    void {
        for (const user of this.users) {
            /* Evitar enviar el mensaje al 
               remitente*/
            if (user !== sender) {
                user.receiveMessage(message);
            }
        }
    }
}

// Clase que representa un usuario
class User {
    private name: string;
    private mediator: ChatMediator;

    constructor(name: string, mediator: 
    ChatMediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addUser(this);
    }

    sendMessage(message: string): void {
        console.log(this.name + " envía: " + 
        message);
        this.mediator.sendMessage(message, this);
    }

    receiveMessage(message: string): void {
        console.log(this.name + " recibe: " + 
        message);
    }
}

// Crear un mediador
const mediator: ChatMediator = new ChatMediatorImpl();

// Crear usuarios
const user1: User = new User("Usuario 1", mediator);
const user2: User = new User("Usuario 2", mediator);
const user3: User = new User("Usuario 3", mediator);

// Los usuarios envían mensajes a través del mediador
user1.sendMessage("Hola a todos");
user2.sendMessage("Hola, Usuario 1");
user3.sendMessage("Hola, ¿cómo están?");