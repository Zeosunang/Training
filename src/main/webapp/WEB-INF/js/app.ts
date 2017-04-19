
class Greeter {
    constructor(public greeting: string) {
    }

    public greet() {
        return "<h1>" + this.greeting + "</h1>";
    }
}

let greeter = new Greeter("Hello, world!");

document.body.innerHTML = greeter.greet();
