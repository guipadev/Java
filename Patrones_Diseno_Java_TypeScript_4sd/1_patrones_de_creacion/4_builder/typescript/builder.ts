class MyReport {
    private header: string = "";
    private body: string = "";
    private footer: string = "";



    setHeader(header: string) {
        this.header = header;
    }

    setBody(body: string) {
        this.body = body;
    }

    setFooter(footer: string) {
        this.footer = footer;
    }

    getResult(): string {
        return `${this.header}\n${this.body}\n${this.footer}`;
    }
}

// Interfaz del Builder
interface ReportBuilder {
    buildHeader(header: string): void;
    buildBody(body: string): void;
    buildFooter(footer: string): void;
    getResult(): MyReport;
}

// Implementación concreta del Builder
class ConcreteReportBuilder implements ReportBuilder {
    private report: MyReport = new MyReport();

    buildHeader(header: string) {
        this.report.setHeader(header);
    }

    buildBody(body: string) {
        this.report.setBody(body);
    }

    buildFooter(footer: string) {
        this.report.setFooter(footer);
    }
    getResult(): MyReport {
        return this.report;
    }
}

// Director que construye el informe en un orden específico
class ReportDirector {
    private builder: ReportBuilder;

    constructor(builder: ReportBuilder) {
        this.builder = builder;
    }

    build() {
        this.builder.buildHeader("Report Header");
        this.builder.buildBody("Report Body");
        this.builder.buildFooter("Report Footer");
    }
}

// Código principal
const builder: ReportBuilder = new ConcreteReportBuilder();
const director: ReportDirector = new ReportDirector(builder);

director.build();
const report: MyReport = builder.getResult();
console.log(report.getResult());
