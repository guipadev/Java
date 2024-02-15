class EventLogger {
    private static instance: EventLogger;
    private logFileName: string;

    private constructor() {
        this.logFileName = "event_log.txt";
    }
    static getInstance(): EventLogger {
        if (!EventLogger.instance) {
          EventLogger.instance = new EventLogger();
        }
        return EventLogger.instance;
    }
    logEvent(eventMessage: string): void {
        // Simulate writing the event to a log file
        console.log(
         `Logging event: ${eventMessage} to
         ${this.logFileName}`
        );
    }

    setLogFileName(fileName: string): void {
        this.logFileName = fileName;
    }
}

// Main code
const logger = EventLogger.getInstance();

logger.logEvent("Event 1: Application started");
logger.logEvent("Event 2: User logged in");

logger.setLogFileName("custom_log.txt");

logger.logEvent("Event 3: Data processed");