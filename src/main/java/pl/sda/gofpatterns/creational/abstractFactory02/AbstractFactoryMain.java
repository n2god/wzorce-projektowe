package pl.sda.gofpatterns.creational.abstractFactory02;

class AbstractFactoryMain {
    public static void main(String[] args) {
        UiAbstractFactory factory = new WindowsUiFactory();
        Button button = factory.getButton();
        button.show();
        Input input = factory.getInput();
        input.write("hej");
        input.write("hello world");
        System.out.println(input.getText());
    }
}
